package com.jcy.account;

import com.jcy.common.annotation.EnableJcyCommon;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableJcyCommon
@MapperScan({"com.jcy.account.mapper"})
public class JaccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(JaccountApplication.class, args);
    }

}
