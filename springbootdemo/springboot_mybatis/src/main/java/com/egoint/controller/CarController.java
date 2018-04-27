package com.egoint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.egoint.form.CarForm;
import com.egoint.model.Car;
import com.egoint.model.PageBean;
import com.egoint.service.CarService;
import com.egoint.util.PageUtil;

@Controller
public class CarController {
	@Autowired
	private CarService carServices;
	
	@RequestMapping(value="/carManage_{pageCurrent}_{pageSize}_{pageCount}")
	public ModelAndView getCarPage(CarForm carForm ,@PathVariable int pageCurrent, @PathVariable int pageSize,@PathVariable int pageCount){
		ModelAndView mv = new ModelAndView();
		PageBean<Car> pageBean = carServices.getCarsByPage(carForm,pageCurrent,pageSize,pageCount);
		mv.addObject("cars", pageBean.getItems());
		mv.setViewName("views/carManage");
		String pageHTML = PageUtil.getPageContent("carManage_{pageCurrent}_{pageSize}_{pageCount}",pageCurrent,pageSize,pageBean.getTotalPage());
		mv.addObject("pageHTML",pageHTML);
		mv.addObject("carform", carForm);
		return  mv;
		
	}

}
