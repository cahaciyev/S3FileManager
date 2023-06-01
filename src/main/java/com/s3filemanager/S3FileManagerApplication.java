package com.s3filemanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class S3FileManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(S3FileManagerApplication.class, args);
    }

}
