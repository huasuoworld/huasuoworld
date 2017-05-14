package org.huasuoworld.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@MapperScan("org.huasuoworld.dao")
@ComponentScan("org.huasuoworld.controller")
@EnableAutoConfiguration
@SpringBootApplication
public class BootStart {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(BootStart.class, args);
	}

}
