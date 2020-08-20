package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Vechile;

public class ClientApp {

	public static void main(String[] args) {
		
		//Locate config file and activate spring container
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		//get Bean
		Vechile vechile = ac.getBean("vech", Vechile.class);
		vechile.move();
	}
}
