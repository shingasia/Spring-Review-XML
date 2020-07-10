package ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		String configLocation1="classpath:applicationCTX1.xml";
		String configLocation2="classpath:applicationCTX2.xml";
		AbstractApplicationContext ctx=new GenericXmlApplicationContext(configLocation1, configLocation2);
		Student student1=ctx.getBean("student1", Student.class);
		System.out.println(student1.getName());//홍길동
		System.out.println(student1.getHobbys());//수영, 요리
		
		StudentInfo studentInfo=ctx.getBean("studentInfo1", StudentInfo.class);
		Student student2=studentInfo.getStudent();//student1==student2
		System.out.println(student1.getName());//홍길동
		System.out.println(student1.getHobbys());//수영, 요리
		
		if(student1.equals(student2)) {
			System.out.println("student1 == student2");
		}
		Student student3=ctx.getBean("student3", Student.class);
		System.out.println(student3.getName()); //김길동
		
		if(student1.equals(student3)) {
			System.out.println("student1 == student3");
		}else {
			System.out.println("student1 != student3");
		}
		
		Family family=ctx.getBean("family", Family.class);
		System.out.println(family.getPapaName());//홍아빠
		System.out.println(family.getMamiName());//홍엄마
		System.out.println(family.getSisterName());//홍누나
		System.out.println(family.getBrotherName());//홍오빠
		
		ctx.close();
	}

}
