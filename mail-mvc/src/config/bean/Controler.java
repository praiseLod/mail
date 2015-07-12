package config.bean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/test")
public class Controler {
	@RequestMapping("index.htm")
	public String index(HttpServletRequest request,HttpServletResponse response){
		ModelAndView vm = new ModelAndView("index");
		return "index";
	}
}
