package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import config.AppConf1;
import spring.AdultShop;
import spring.SwimmingPool;

public class MainClass {

	public static void main(String[] args) {
		AbstractApplicationContext ctx=new AnnotationConfigApplicationContext(AppConf1.class);
		SwimmingPool obj1=ctx.getBean("swimmingPool", SwimmingPool.class);
		AdultShop obj2=ctx.getBean("adultShop1", AdultShop.class);
		obj1.play();
		obj2.play();
		
		ctx.close();
	}

}
