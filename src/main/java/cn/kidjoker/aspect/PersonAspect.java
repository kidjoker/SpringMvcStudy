package cn.kidjoker.aspect;

import org.springframework.stereotype.Component;

@Component("personAspect")
public class PersonAspect {
	
	public void test1() {
		System.out.println("开始函数调用");
	}
	
	public void test2() {
		System.out.println("结束函数调用");
	}
	
	public void testError() {
		System.out.println("函数调用异常");
	}
}
