package com.xworkz.inverter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.inverter.bean.InverterBean;



public class InverterTester {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("context.xml");
		InverterBean bean=applicationContext.getBean(InverterBean.class);
		System.out.println(bean);

	}

}
