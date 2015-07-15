package htq.mail.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 登录
 * @author PraiseLod
 * @date 2015年7月8日
 *
 */
@RequestMapping("/test")
public class LogonAction extends BaseAction {
	
	@RequestMapping("index.htm")
	public String index(HttpServletRequest request,HttpServletResponse response){
		ModelAndView vm = new ModelAndView("index");
		return "test";
	}
	
}
