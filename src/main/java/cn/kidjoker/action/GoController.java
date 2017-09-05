/** work for life!
 * 
 */
package cn.kidjoker.action;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author kidjoker
 *
 * @date 2017年8月31日 
 */
@Controller
@RequestMapping(value="/study")
public class GoController implements EnvironmentAware {
	
	private Environment environment;
	
	@RequestMapping(value="/index",method={RequestMethod.GET,RequestMethod.POST})
	public String index(Model model,HttpServletRequest req) throws Exception {
		req.getContextPath();
		model.addAttribute("ha","123");
		return "index";
	}

	
	@Override
	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}
	
}
