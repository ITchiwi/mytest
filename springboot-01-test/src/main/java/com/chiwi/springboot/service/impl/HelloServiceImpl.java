package com.chiwi.springboot.service.impl;

import org.springframework.stereotype.Service;

import com.chiwi.springboot.service.HelloService;
@Service
public class HelloServiceImpl implements HelloService {

	@Override
	public void say() {
		System.out.println("HelloServiceImpl---say()");
	}

}
