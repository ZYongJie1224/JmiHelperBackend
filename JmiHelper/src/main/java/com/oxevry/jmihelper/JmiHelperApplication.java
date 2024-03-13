package com.oxevry.jmihelper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//@MapperScan({"com.oxevry.DAO"})
@SpringBootApplication
public class JmiHelperApplication {

    public static void main(String[] args) {
        SpringApplication.run(JmiHelperApplication.class, args);
    }

}
