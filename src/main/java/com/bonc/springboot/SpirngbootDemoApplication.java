package com.bonc.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.config.EnableAdminServer;
//@springBootConfiguration和@Configuration的功能一样，用来代替xml的bean
//@EnableAutoConfiguration自动加载jar的默认配置
//@ComponentScan用来代替<context:conponent-scan>来扫描包
//@RestController包括Controller和ResponseBody写入流中
//@RequestMapping
//@Value
@SpringBootApplication
public class SpirngbootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpirngbootDemoApplication.class, args);
	}
}
