package com.egoint.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.egoint.form.CarForm;
import com.egoint.mapper.CarMapper;
import com.egoint.model.Car;
import com.egoint.model.PageBean;
import com.egoint.service.CarService;
import com.github.pagehelper.PageHelper;
@Service
public class CarServiceImpl implements CarService {
	@Autowired
	private CarMapper carMapper;
	
	@Override
	public PageBean<Car> getCarsByPage(CarForm carForm, int pageCurrent, int pageSize, int pageCount) {
		PageHelper.startPage(pageCurrent, pageSize);
        List<Car> allCars= carMapper.findCarsByPage(carForm);  
        int countNums = carMapper.countCar(carForm);           
        PageBean<Car> pageBean = new PageBean<>(pageCurrent, pageSize, countNums);
        pageBean.setItems(allCars);
        return pageBean;
	}

}
