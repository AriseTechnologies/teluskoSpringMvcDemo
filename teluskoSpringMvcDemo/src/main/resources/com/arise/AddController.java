package com.arise;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {

	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int i, @RequestParam("t2") int j) {
//		int i = Integer.parseInt(req.getParameter("t1"));
//		int j = Integer.parseInt(req.getParameter("t2"));
		int k = i + j;

		ModelAndView mv = new ModelAndView();
		if(k<5){
		mv.setViewName("display");
		mv.addObject("result", k);
		}else{
			mv.setViewName("index");
		}
		return mv;
	}
}
