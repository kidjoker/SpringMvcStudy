/** work for life!
 * 
 */
package cn.kidjoker.action;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.map.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.kidjoker.model.User;
import cn.kidjoker.service.TestStock;
import junit.framework.Test;

/**
 * @author kidjoker
 *
 * @date 2017年8月31日 
 */
@Controller
@RequestMapping(value="/study")
public class GoController {
	
	@Autowired
	private TestStock testStock;
	
	@ResponseBody
	@RequestMapping(value="/index",method={RequestMethod.GET,RequestMethod.POST})
	public String index1(User user,Model model) throws Exception {
		model.addAttribute("userName", user.getUserName());
		return model.toString();
	}
	
	@RequestMapping(value="/stock",method={RequestMethod.GET,RequestMethod.POST})
	public void stock() throws Exception {
		testStock.getStockData();
	}
}
