package com.face.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.face.bo.HelloWorld;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext beanFactory=new ClassPathXmlApplicationContext("resources/MyFile.xml");
HelloWorld myBean=(HelloWorld) beanFactory.getBean("SpringHelloWorldBean");
myBean.printHello();
	}

}
