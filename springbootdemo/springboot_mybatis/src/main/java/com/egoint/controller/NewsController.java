package com.egoint.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.egoint.model.User;
import com.egoint.util.PageUtil;

@Controller
public class NewsController {
	@GetMapping("news/newsManage_{pageCurrent}_{pageSize}_{pageCount}")
	public ModelAndView   newsManage(@PathVariable Integer pageCurrent,@PathVariable Integer pageSize,@PathVariable Integer pageCount,HttpSession session){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("news/newsManage");
		User user = (User) session.getAttribute("user");
		modelAndView.addObject("user", user);
		String pageHTML = PageUtil.getPageContent("newsManage_{pageCurrent}_{pageSize}_{pageCount}?title="+"title"+"&category=123&commendState=123&orderBy=123", 1, 2, 3);
		modelAndView.addObject("pageHTML",pageHTML);
		return  modelAndView;
	}
	
	@GetMapping("news/newsType_{pageCurrent}_{pageSize}_{pageCount}")
	public ModelAndView   type(@PathVariable Integer pageCurrent,@PathVariable Integer pageSize,@PathVariable Integer pageCount,HttpSession session){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("news/newsType");
		User user = (User) session.getAttribute("user");
		modelAndView.addObject("user", user);
		String pageHTML = PageUtil.getPageContent("newsType_{pageCurrent}_{pageSize}_{pageCount}?title="+"title"+"&category=123&commendState=123&orderBy=123", 2, 2, 3);
		modelAndView.addObject("pageHTML",pageHTML);
		return  modelAndView;
	}
	
}
