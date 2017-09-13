package cn.kidjoker.action;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;

import cn.kidjoker.validator.UserValidator;

@ControllerAdvice
public class ControllerGlobalConfig {

	@Autowired
	private UserValidator userValidator;
	
	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.addValidators(userValidator);
	}
	
	@ModelAttribute
	public void Test() {
		System.out.println("hahaha");
	}
	
	@ModelAttribute(value="initParam")
	public String setModel() throws IOException {
		return "hello";
	}
}
