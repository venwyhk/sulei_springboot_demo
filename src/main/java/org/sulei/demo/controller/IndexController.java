package org.sulei.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class IndexController {

	@RequestMapping(value = "/{pageName}.html")
	public ModelAndView hello(ModelAndView mv, @PathVariable String pageName) throws Exception {
		mv.setViewName(pageName);
		return mv;
	}

}
