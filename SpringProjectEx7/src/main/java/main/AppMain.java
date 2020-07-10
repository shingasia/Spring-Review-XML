package main;

import org.springframework.context.support.GenericXmlApplicationContext;

import spring.SamsungTV;

public class AppMain {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		
//		스프링 컨테이너는 기본적으로 bean 등록된 순서대로 객체를 생성하며, 모든 객체는 기본생성자 호출을 원칙으로 한다.
		SamsungTV tv=ctx.getBean("tv", SamsungTV.class);
		tv.powerOn();
		tv.powerOff();
		tv.powerUp();
		tv.volumeDown();
		System.out.println(tv.getPrice());
		
		
	}

}
