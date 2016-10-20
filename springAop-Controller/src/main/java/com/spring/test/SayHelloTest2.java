package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @describe :
 * @Date : 2016年10月21日 上午1:59:53
 * @Author : Ding
 */
public class SayHelloTest2 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("sayHello2.xml");
		//jdk
		SayHello hello = (SayHello) context.getBean("sayHelloImplJdk");
		hello.sayHello(); 
		
		//cglib
		/*System.err.println("---------------------华丽的分割线----------------------------");
		SayHelloImplCglib sayHelloImplCglib = context.getBean("sayHelloImplCglib", SayHelloImplCglib.class);
		sayHelloImplCglib.sayHello();*/
	}
}
