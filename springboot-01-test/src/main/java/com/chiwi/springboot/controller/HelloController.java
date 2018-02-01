package com.chiwi.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chiwi.springboot.service.HelloService;
/**
 * @RestController = @Controller+@ResponseBody
 * @author chiwi
 *
 */
@RestController
public class HelloController {
	@Autowired
	private HelloService helloService;
	//@Autowired
	//private Environment environment;
	@Value("${name}")
	private String name;
	@Value("${url}")
	private String url;
	
	@GetMapping("/hello")
	public String hello() {
		//System.out.println(environment.getProperty("name"));
		//System.out.println(environment.getProperty("url"));
		System.out.println(name + "\t" + url);
		helloService.say();
		return "Hello World";
	}
}
