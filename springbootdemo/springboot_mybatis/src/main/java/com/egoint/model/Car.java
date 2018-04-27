package com.egoint.model;

import java.io.Serializable;
import java.util.Date;
public class Car implements Serializable {

	private static final long serialVersionUID = 1L;
	// 车辆编号
	private String cid;
	// 所有人姓名
	private String owner;
	// 牌照号
	private String plate;
	// 车身颜色
	private String color;
	// 车辆类型
	private String cartype;
	// 发动机号码
	private String engine;
	// 车辆识别代号
	private String vin;
	// 使用性质
	private String nature;
	// 品牌型号
	private String model;
	// 添加日期
	private Date addtime;
	// 车辆状态 1：正常 2：报废 3：故障
	private Integer state;
	// 行驶证照片
	private String picture;
	// uid
	private String uid;

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCartype() {
		return cartype;
	}

	public void setCartype(String cartype) {
		this.cartype = cartype;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getNature() {
		return nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Date getAddtime() {
		return addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Car() {
		super();
	}

}
