package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		AbstractApplicationContext ctx=new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		Pencil pencil=ctx.getBean("pencil", Pencil.class);//Bean객체를 가져옴
		pencil.use();
		
		ctx.close();
	}

}
