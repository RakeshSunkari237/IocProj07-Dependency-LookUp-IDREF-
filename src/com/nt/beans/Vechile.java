package com.nt.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Vechile {

	private String enggId;

	public Vechile() {
		System.out.println("Vechile :0 param constructor");
	}

	public String getEnggId() {
		return enggId;
	}

	public void setEnggId(String enggId) {
		this.enggId = enggId;
	}
	
	public void move() {
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		Engine engine = ac.getBean("eng", Engine.class);
		engine.start();
		System.out.println("Vechile moved for journey.....");
	}
	
}
