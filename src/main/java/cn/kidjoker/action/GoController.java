/** work for life!
 * 
 */
package cn.kidjoker.action;

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
public class GoController {
	
	@RequestMapping(value="/index",method={RequestMethod.GET,RequestMethod.POST})
	public String index(Model model) throws Exception {
		model.addAttribute("ha","123");
		return "index1";
	}
	
}
