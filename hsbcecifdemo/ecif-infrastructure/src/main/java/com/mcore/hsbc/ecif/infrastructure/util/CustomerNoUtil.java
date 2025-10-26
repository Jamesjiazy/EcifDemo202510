package com.mcore.hsbc.ecif.infrastructure.util;

/**
 * 客户号生成工具类
 * 规则: C + 雪花算法生成的数字(取后 13 位)
 * 固定长度 14 位，保证唯一
 */
public class CustomerNoUtil {

    // 起始时间戳 (2025-01-01)，减少位数
    private static final long EPOCH = 1735689600000L;

    private static final long WORKER_ID_BITS = 5L;      // 机器位
    private static final long DATACENTER_ID_BITS = 5L;  // 机房位
    private static final long SEQUENCE_BITS = 12L;      // 序列位

    private static final long MAX_WORKER_ID = ~(-1L << WORKER_ID_BITS);
    private static final long MAX_DATACENTER_ID = ~(-1L << DATACENTER_ID_BITS);
    private static final long SEQUENCE_MASK = ~(-1L << SEQUENCE_BITS);

    private static final long WORKER_ID_SHIFT = SEQUENCE_BITS;
    private static final long DATACENTER_ID_SHIFT = SEQUENCE_BITS + WORKER_ID_BITS;
    private static final long TIMESTAMP_LEFT_SHIFT = SEQUENCE_BITS + WORKER_ID_BITS + DATACENTER_ID_BITS;

    private final long workerId;
    private final long datacenterId;
    private long sequence = 0L;
    private long lastTimestamp = -1L;

    // 单例
    private static final CustomerNoUtil INSTANCE = new CustomerNoUtil(1, 1);

    private CustomerNoUtil(long workerId, long datacenterId) {
        if (workerId > MAX_WORKER_ID || workerId < 0) {
            throw new IllegalArgumentException("workerId out of range");
        }
        if (datacenterId > MAX_DATACENTER_ID || datacenterId < 0) {
            throw new IllegalArgumentException("datacenterId out of range");
        }
        this.workerId = workerId;
        this.datacenterId = datacenterId;
    }

    /**
     * 获取工具类实例
     */
    public static CustomerNoUtil getInstance() {
        return INSTANCE;
    }

    /**
     * 生成唯一客户号 (C 开头，总长 14 位)
     */
    public synchronized String generateCustomerNo() {
        long timestamp = System.currentTimeMillis();

        if (timestamp < lastTimestamp) {
            throw new RuntimeException("Clock moved backwards");
        }

        if (lastTimestamp == timestamp) {
            sequence = (sequence + 1) & SEQUENCE_MASK;
            if (sequence == 0) {
                // 等待下一毫秒
                while ((timestamp = System.currentTimeMillis()) <= lastTimestamp) {
                }
            }
        } else {
            sequence = 0L;
        }

        lastTimestamp = timestamp;

        long diff = timestamp - EPOCH;
        long id = (diff << TIMESTAMP_LEFT_SHIFT)
                | (datacenterId << DATACENTER_ID_SHIFT)
                | (workerId << WORKER_ID_SHIFT)
                | sequence;

        // 取后 13 位，加上前缀 C，总长 14
        String numPart = String.valueOf(id);
        if (numPart.length() > 13) {
            numPart = numPart.substring(numPart.length() - 13);
        } else {
            numPart = String.format("%013d", Long.parseLong(numPart));
        }

        return "C" + numPart;
    }

    public static void main(String[] args) {
        CustomerNoUtil util = CustomerNoUtil.getInstance();
        for (int i = 0; i < 20; i++) {
            System.out.println(util.generateCustomerNo());
        }
    }
}
