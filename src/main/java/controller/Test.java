package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Test {
	private static final String MODELPATH = "";
	
	@RequestMapping("index")
	public String index() {
		System.out.println("aaa");
		return "index";
	}
	
	@RequestMapping("index1")
	public ModelAndView index1() {
		ModelAndView model = new ModelAndView();
		model.setViewName("/index1");
		return model;
	}
}
