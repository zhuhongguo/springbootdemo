package com.egoint.mapper;

import java.util.List;

import com.egoint.form.CarForm;
import com.egoint.model.Car;

public interface CarMapper {

	List<Car> findCarsByPage(CarForm carForm);

	int countCar(CarForm carForm);

}
