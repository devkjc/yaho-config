package com.toy.yahoconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class YahoConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(YahoConfigApplication.class, args);
    }

}
