package com.mcore.hsbc.ecif.implementation;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@Slf4j
@SpringBootApplication(exclude = {
    org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration.class,
    org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration.class
})
@ImportResource({
    "classpath*:META-INF/hsbcECIFDemo/hsbcECIFDemo-bean.xml",
    "classpath*:META-INF/dao-bean.xml"
})
@ComponentScan(basePackages = {
    "com.mcore",
    "com.mcore.hsbc.ecif"
})
public class BootstrapApplication {
    public static final Logger logger = LoggerFactory.getLogger(BootstrapApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(BootstrapApplication.class, args);
    }
}
