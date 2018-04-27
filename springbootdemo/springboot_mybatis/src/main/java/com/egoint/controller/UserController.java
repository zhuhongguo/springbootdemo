package com.egoint.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.egoint.form.UserForm;
import com.egoint.model.PageBean;
import com.egoint.model.User;
import com.egoint.service.UserService;
import com.egoint.util.PageUtil;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	/**
	 * 登录
	 * @param username
	 * @param password
	 * @param model
	 * @param session
	 * @return
	 */
	@PostMapping("/user/login")
	public ModelAndView   login(String username,String password, Model model,HttpSession session){
		ModelAndView  mv = new ModelAndView();
		User dbUser = userService.getUserByUsername(username);
		if(dbUser==null){
			mv.addObject("error", "用户不存在!");
			mv.setViewName("login");
			return mv;
		}
		dbUser.setIcon("http://park.qy-its.com/"+dbUser.getIcon());
		if(dbUser.getPassword().equals(password)){
			session.setAttribute("user", dbUser);
			mv.setViewName("home");
			return mv;
		}else{
			model.addAttribute("error", "用户名或密码错误，请重新登录！");
			mv.setViewName("login");
			return mv;
		}
	}
	/**
	 * 退出登录
	 * @param session
	 * @return
	 */
	@GetMapping(value="/user/logout")
	public ModelAndView logout(HttpSession session){
		ModelAndView mv = new ModelAndView();
		session.removeAttribute("user");
		mv.setViewName("login");
		return mv;
	}
	
	/**
	 * 用户管理分页
	 * @param userForm
	 * @param pageCurrent
	 * @param pageSize
	 * @param pageCount
	 * @param session
	 * @return
	 */
	@RequestMapping("/userManage_{pageCurrent}_{pageSize}_{pageCount}")
	public ModelAndView  userManage(UserForm userForm, @PathVariable Integer pageCurrent,@PathVariable Integer pageSize,@PathVariable Integer pageCount,HttpSession session){
		PageBean<User> pageBean = userService.getUserListByPage(userForm,pageCurrent, pageSize);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("views/userManage");
		String pageHTML = PageUtil.getPageContent("userManage_{pageCurrent}_{pageSize}_{pageCount}",pageCurrent,pageSize,pageBean.getTotalPage());
		modelAndView.addObject("pageHTML",pageHTML);
		modelAndView.addObject("users", pageBean.getItems());
		modelAndView.addObject("userform", userForm);
		return  modelAndView;
	}
	
	@RequestMapping("/user/edit")
	public ModelAndView userEdit(){
		return null;
	}

	@RequestMapping("/user/delete")
	public ModelAndView userDelete(User user){
		return null;
	}
	 
}
