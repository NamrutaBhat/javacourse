package com.xworkz.image_gallery;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.image_gallery.beans.ImageGalleryBeans;



public class ImageGalleryTester {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("context.xml");
		ImageGalleryBeans imageGalleryBean=applicationContext.getBean(ImageGalleryBeans.class);
		System.out.println(imageGalleryBean);
	}

}
