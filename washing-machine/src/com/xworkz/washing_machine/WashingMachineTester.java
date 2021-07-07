package com.xworkz.washing_machine;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.washing_machine.bean.WashingMahineBean;




public class WashingMachineTester {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("context.xml");
		WashingMahineBean bean=applicationContext.getBean(WashingMahineBean.class);
		System.out.println(bean);

	}

}
