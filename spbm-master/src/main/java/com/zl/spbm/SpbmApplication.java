package com.zl.spbm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
@MapperScan("com.zl.spbm.dao")
public class SpbmApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpbmApplication.class, args);
	}
}
