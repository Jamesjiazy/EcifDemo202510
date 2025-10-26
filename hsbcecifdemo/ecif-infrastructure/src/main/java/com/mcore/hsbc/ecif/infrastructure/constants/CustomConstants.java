package com.mcore.hsbc.ecif.infrastructure.constants;

/**
 * 系统名称: SC6000b分布式核心系统
 * 微服务名称: 客户中心
 * 版本号: V0.2.0
 * 创建者: @author user
 * 创建日期: 2023/6/7
 * 功能说明: 客户操作接口组
 * 程序逻辑描述:
 * <p>
 * 修改说明:
 * 日期 修改人 修改描述
 */
public class CustomConstants {
    /**
     * 租户号
     */
    public static final String TENANT_NO = "tenantNo";
    /**
     * 返回ECIF错误信息
     */
    public static final boolean RESULT_ECIF_ERROR_VAL = true;
    /**
     * 返回ECIF错误信息标识
     */
    public static final String RESULT_ECIF_ERROR = "resultEcifErrorFlag";
    /**
     * 客户号
     */
    public static final String CUST_NO = "custNo";
    /**
     * 交易订单号
     */
    public static final String INTD_NO = "intdNo";
    /**
     * 业务订单号
     */
    public static final String BIZ_SGNL_NO = "bizSnglNo";
    /**
     * 服务单号
     */
    public static final String SERV_SGNL_NO = "servSnglNo";
    /**
     * 交易订单号
     */
    public static final String ORIGINL_INTD_NO = "originlIntdNo";
    /**
     * 业务订单号
     */
    public static final String ORIGINL_BIZ_SGNL_NO = "originlBizSnglNo";
    /**
     * 服务单号
     */
    public static final String ORIGINL_SERV_SGNL_NO = "originlServSnglNo";
    /**
     * 交易机构
     */
    public static final String TX_ORG_NO = "txOrgNo";
    /**
     * 交易柜员
     */
    public static final String TX_TELR_NO = "operTelrNo";
    /**
     * 操作类枚举类型
     */
    public static final String ENUM_OPER_TYP = "operTypCd";
    /**
     * 状态类枚举类型
     */
    public static final String ENUM_STUS = "stusCd";

    /**
     * 客户类型：对私客户
     */
    public static final String CUST_TYP_PER_CUST = "0";

    /**
     * 客户类型：对公客户
     */
    public static final String CUST_TYP_CO_CUST = "1";

    /**
     * 客户类型：金融客户
     */
    public static final String CUST_TYP_BANK_CUST = "2";

    /**
     * ECIF客户类型：对公客户
     */
    public static final String ECIF_CUST_TYP_CO_CUST = "1";

    /**
     * ECIF客户类型：对私客户
     */
    public static final String ECIF_CUST_TYP_PER_CUST = "2";

    /**
     * ECIF客户类型：金融客户
     */
    public static final String ECIF_CUST_TYP_BANK_CUST = "3";

    /**
     * 客户账户路由新增
     */
    public static final String CUST_ACCT_ROUTE_TYP_INSERT = "01";

    /**
     * 客户账户路由修改
     */
    public static final String CUST_ACCT_ROUTE_TYP_UPDATE = "02";

    /**
     * 客户账户路由注销
     */
    public static final String CUST_ACCT_ROUTE_TYP_DELETE = "03";

    /**
     * 账户账户状态：有效
     */
    public static final String CUST_ACCT_STATUS_VALID = "1";

    /**
     * 账户账户状态：无效
     */
    public static final String CUST_ACCT_STATUS_INVALID = "0";

    /**
     * ECIF调用开关
     */
    public static final String ECIF_SWITCH = "ecifSwitch";

    /**
     * z核心调用开关
     */
    public static final String Z_SWITCH = "zSwitch";

    /**
     * 客户备注信息新增
     */
    public static final String CUST_REMARK_INFO_INSERT = "1";

    /**
     * 客户备注信息修改
     */
    public static final String CUST_REMARK_INFO_UPDATE = "2";

    /**
     * 客户备注信息注销
     */
    public static final String CUST_REMARK_INFO_DELETE = "3";

    /**
     * z核心响应返回类型 正常
     */
    public static final String REQ_TYPE_SUCCESS = "0";

    /**
     * z核心响应返回类型 失败
     */
    public static final String REQ_TYPE_ERROR = "1";

    /**
     * SC6000z输入为空
     */
    public static final String SC6000Z_HTTP_INPUT_BE_NULL = "1001";

    /**
     * SC6000z输入非法
     */
    public static final String SC6000Z_HTTP_INPUT_INVALID = "1002";

    /**
     * SC6000z核心系统错误
     */
    public static final String SC6000Z_HTTP_SYSTEM_ERROR = "0005";

    /**
     * SC6000z核心 客户不存在
     */
    public static final String SC6000Z_HTTP_CUST_NOT_EXIST = "3065";

    /**
     * 黑名单控制标志默认值，标识未控制
     */
    public static final String BLKLIST_CUST_FLG_NO_CTRL = "N";

    /**
     * 黑名单控制标志默认值，标识禁止取现
     */
    public static final String BLKLIST_CUST_FLG_CTRL = "0";

    /**
     * 默认柜员号
     */
    public static final String OPER_RELR_NO = "888888";

    /**
     * MQ消息key
     */
    public static final String MQ_KEY_MSGTYP = "msgTyp";
    public static final String MQ_KEY_CUSTNO = "custNo";
    public static final String MQ_KEY_TENANTNO = "tenantNo";
    public static final String MQ_KEY_CRTFTYPCD = "crtfTypCd";
    public static final String MQ_KEY_CRTFNO = "crtfNo";
    public static final String MQ_KEY_CUSTNM = "custNm";
    public static final String MQ_KEY_CUSTACCTNO = "custAcctNo";
    public static final String MQ_KEY_RELASEQNO = "relaSeqNo";
    public static final String MQ_KEY_ACCTIACCTSEQNO = "acctiAcctSeqNo";
    public static final String MQ_KEY_MSGTYP_PERCUSTINFO = "perCustInfo";
    public static final String MQ_KEY_MSGTYP_COCUSTINFO = "coCustInfo";
    public static final String MQ_KEY_MSGTYP_BANKCUSTINFO = "bankCustInfo";
    public static final String MQ_KEY_MSGTYP_BASECUSTINFO = "baseCustInfo";
    public static final String MQ_KEY_MSGTYP_CUSTRISK = "custRisk";
    public static final String MQ_KEY_MSGTYP_CUSTREMARK = "custRemark";
    public static final String MQ_KEY_MSGTYP_CUSTCHNLTXNCOMMOND = "custTxContrl";
    /**
     * 汇聚发送消息租户号
     */
    public static final String MQ_KEY_TENANT_NO = "tenant_no";

    /**
     * 客户归并MQ-TP
     */
    public static final String MQ_TP = "TP_sc6kd_cust_mgmt";

    /**
     * 文件批量
     */
    public static final String MQ_TP_BAT = "TP-sc6kd-online-bat";

    /**
     * 是否员工/股东 1：员工 2：股东
     */
    public static final String RCUEMPLYFLG_NO = "0";
    public static final String RCUEMPLYFLG_YES = "1";

    /**
     * 数据清理任务状态（0-登记、1-清理完成、2清理失败、3、清理中）
     */
    public static final String REG_TASK_STUS_START = "0";
    public static final String REG_TASK_STUS_SUCC = "1";
    public static final String REG_TASK_STUS_FAIL = "2";
    public static final String REG_TASK_STUS_CLEARING = "3";
    /**
     * ECIF地址类型: 1-实际经营地址
     */
    public static final String ECIF_ADDR_TYP_1 = "1";
    /**
     * ECIF地址类型: 2-注册地址
     */
    public static final String ECIF_ADDR_TYP_2 = "2";
    /**
     * ECIF地址类型: 3-企业联系地址
     */
    public static final String ECIF_ADDR_TYP_3 = "3";
    /**
     * ECIF地址类型: 4-办公地址
     */
    public static final String ECIF_ADDR_TYP_4 = "4";
    /**
     * ECIF地址类型: 9-其它
     */
    public static final String ECIF_ADDR_TYP_9 = "9";
    /**
     * 空格字符串
     */
    public static final String SPACE_STR = " ";
    /**
     * 整形-0
     */
    public static final Integer INT_ZERO = 0;
    /**
     * 整形-3
     */
    public static final Integer INT_THREE = 3;
    /**
     * 有效标志: 0-无效
     */
    public static final String VALID_FLG_0 = "0";
    /**
     * 有效标志: 1-无效
     */
    public static final String VALID_FLG_1 = "1";
    /**
     * 撤销标志: 0-正常
     */
    public static final String RVCT_FLG_0 = "0";
    /**
     * 撤销标志: 1-已撤销
     */
    public static final String RVCT_FLG_1 = "1";
    /**
     * 调用Z核心追加开关: true调用Z,false查询本地数据库
     */
    public static String SC6000Z_APPEND_SWITCH = "SC6000z.append.switch";
    /**
     * 客户渠道交易控制维护操作类型代码：01-设置
     */
    public static final String MGMT_CUST_CHNL_TXNCOMMOND_OPER_TYP_CD_01 = "01";
    /**
     * 客户渠道交易控制维护操作类型代码：02-修改
     */
    public static final String MGMT_CUST_CHNL_TXNCOMMOND_OPER_TYP_CD_02 = "02";
    /**
     * 客户渠道交易控制维护操作类型代码：03-删除
     */
    public static final String MGMT_CUST_CHNL_TXNCOMMOND_OPER_TYP_CD_03 = "03";
    /**
     * 客户渠道交易控制-限制类型代码：3-客户风险等级
     */
    public static final String CUST_CHNL_TXNCOMMOND_LIMIT_TYP_CD = "3";
    /**
     * 备注信息单笔查询返回时间戳格式
     */
    public static final String QURY_SGL_REMARK_TIME_STDDTMF = "yyyy-MM-dd-HH.mm.ss.SSSSSS";
    /**
     * 执行进度赋值为1
     */
    public static final String PER_SUCC = "1";
    /**
     * 一阶段上报进度
     */
    public static final String PHASE_ONE_PROGRESS = "+5";
    /**
     * 二阶段占比(二阶段总进度)
     */
    public static final String PHASE_TWO_PROPORTION = "+90";
    /**
     * 三阶段上报进度
     */
    public static final String PHASE_THREE_PROGRESS = "+5";
    /**
     * 业务异常默认不可重试
     */
    public static final boolean CAN_RETRY = false;
    /**
     * Gzone
     */
    public static final String GZONE = "Gzone";
    /**
     * Rzone
     */
    public static final String RZONE = "Rzone";
    /**
     * 文件目录分隔符
     */
    public static final String SEPARATE_DIAGONAL = "/";
    /**
     * 文件目录
     */
    public static final String LOCAL_FILE = "tmp/tmp/";
    /**
     * 文件内容分隔符
     */
    public static final String MANSBJ_SEPARATE = "|#|";
    /**
     * 文件读取行数
     */
    public static final int BATCH_SIZE = 400;
    /**
     * 英文冒号
     */
    public static final String ENG_COLON = ":";
    /**
     * 字符串-0
     */
    public static final String STR_ZERO = "0";
    /**
     * ECIF需处理错误码
     */
    public static final String ECIF_ERROR_CODE_E0001 = "E0001";
    /**
     * ECIF需处理错误信息-Connection reset
     */
    public static final String ECIF_ERROR_INFO_RESET = "Connection reset";
    /**
     * ECIF需处理错误信息-Read timed out
     */
    public static final String ECIF_ERROR_INFO_TIMED_OUT = "Read timed out";
    /**
     * SC6000Z最小证件到期日期字段名-int_cal_flag
     */
    public static final String INT_CAL_FLAG = "int_cal_flag";
    /**
     * SC6000Z返回字段名-data_list
     */
    public static final String DATA_LIST = "data_list";
    /**
     * SC6000Z返回字段名-tot_rec_num
     */
    public static final String TOT_REC_NUM = "tot_rec_num";
}
