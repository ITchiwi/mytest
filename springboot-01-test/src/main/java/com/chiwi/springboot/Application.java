package com.chiwi.springboot;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot用来引导Spring快速构建企业级应用的微框架
 * 开发引导类
 * @SpringBootApplication,代表该类为SpringBoot的引导类
 * (scanBasePackages={"com.chiwi.springboot"})
 * 默认就是扫描Application所在的包
 * @author chiwi
 *
 */
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		//第一种方式：运行SpringBoot项目
		//SpringApplication.run(Application.class, args);
		
		//第二种方式：运行SpringBoot项目
		SpringApplication springApplication = new 
				SpringApplication(Application.class);
		//设置关闭Banner横幅
		springApplication.setBannerMode(Mode.OFF);
		//运行
		springApplication.run(args);
	}
}
