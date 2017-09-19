package cn.kidjoker.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.kidjoker.model.Person;

public class NewTest{

	public static void main(String[] args) {
		ApplicationContext act = 
			new ClassPathXmlApplicationContext("config/META-INF/spring/spring-config.xml");
		NewTest nt = new NewTest();
		Person p = (Person) act.getBean("user");
		System.out.println(p.getAddress());
	}
}
