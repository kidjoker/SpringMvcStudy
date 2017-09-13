package cn.kidjoker.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.kidjoker.model.User;

@Controller
@RequestMapping(value="/valid")
public class ValidatorController {
	
	@RequestMapping(value="/index",method={RequestMethod.GET})
	public String index(Model model) {
		model.addAttribute("user", new User());
		return "user";
	}
	
	@RequestMapping(value="/signup",method={RequestMethod.POST})
	public String signup(@Validated User user,BindingResult result) {
		return "user";
	}
	
}
