package com.sanchezih.di.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sanchezih.di.spring.service.Converter;
import com.sanchezih.di.spring.service.impl.ARSToUSDConverter;

public class Main {

	public static void main(String[] args) {
		
		BeanFactory applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		double cantidad = 100;
		Converter c = (ARSToUSDConverter) applicationContext.getBean("converterUSD");
		System.out.println(c.convert(cantidad));

	}
}
