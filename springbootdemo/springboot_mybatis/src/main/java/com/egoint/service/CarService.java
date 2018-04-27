package com.egoint.service;

import com.egoint.form.CarForm;
import com.egoint.model.Car;
import com.egoint.model.PageBean;

public interface CarService {
	
	PageBean<Car> getCarsByPage(CarForm carForm, int pageCurrent, int pageSize, int pageCount);

}
