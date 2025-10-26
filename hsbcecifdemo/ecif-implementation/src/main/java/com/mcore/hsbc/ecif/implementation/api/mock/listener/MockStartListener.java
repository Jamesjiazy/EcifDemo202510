package com.mcore.hsbc.ecif.implementation.api.mock.listener;

import com.alibaba.fastjson.JSON;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Service
@Slf4j
public class MockStartListener implements ApplicationListener<ContextRefreshedEvent> {


    @Value("${api.mock.enable}")
    private boolean apiMockEnable;

    @Value("${api.mock.skip.method.blacklist}")
    private String apiMockSkipMethodBlacklist;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        if (!apiMockEnable) {
            return;
        }
        // root application context没有parent
        if (event.getApplicationContext().getParent() == null) {
            log.info("开始加载挡板数据");
            MockService mockService = event.getApplicationContext().getBean(MockService.class);
            // 处理挡板方法黑名单
            if (Strings.isNotBlank(apiMockSkipMethodBlacklist)) {
                String[] skipMethodBlacklist = apiMockSkipMethodBlacklist.split(";");
                mockService.initSkipMethodBlackList(skipMethodBlacklist);
            }

            PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
            Resource[] resources = new Resource[0];
            try {
                resources = resolver.getResources("classpath*:mock/*.json");
            } catch (IOException e) {
                log.warn("加载挡板，数据读取文件失败", e);
            }
            if (resources.length > 0) {
                for (Resource resource : resources) {
                    try {
                        MockInfo mockInfo = JSON.parseObject(resource.getInputStream(), MockInfo.class);
                        log.info("加载挡板:{}", mockInfo.getMockName());
                        mockService.initMockData(mockInfo);
                    } catch (Exception e) {
                        log.warn("加载挡板{}失败", resource.getFilename(), e);
                    }
                }
            }
        }
        log.info("结束加载挡板数据");
    }
}