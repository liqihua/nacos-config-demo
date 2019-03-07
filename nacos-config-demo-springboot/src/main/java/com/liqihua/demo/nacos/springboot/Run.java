package com.liqihua.demo.nacos.springboot;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author liqihua
 * @since 2019/3/6
 */
@SpringBootApplication
@NacosPropertySource(dataId = "example-dev.properties", groupId = "weixin",autoRefreshed = true)
public class Run {

    public static void main(String[] args) {
        SpringApplication.run(Run.class, args);
    }
}
