/** work for life!
 * 
 */
package cn.kidjoker.action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.kidjoker.model.User;
import junit.framework.Test;

/**
 * @author kidjoker
 *
 * @date 2017年8月31日 
 */
@Controller
@RequestMapping(value="/study")
public class GoController {
	
	@ModelAttribute
	public void Test() {
		System.out.println("hahaha");
	}
	
	@ModelAttribute(value="initParam")
	public String setModel() throws IOException {
		return "hello";
	}
	
	@RequestMapping(value="/index",method={RequestMethod.GET,RequestMethod.POST})
	public String index1(User user,Model model) throws Exception {
		System.out.println(model.asMap().get("initParam"));
		System.out.println(user.getUserName());
		return "index";
	}
	
	@RequestMapping(value="/index2",method={RequestMethod.GET,RequestMethod.POST})
	public String index2() throws Exception {
		return "index";
	}
	
}
