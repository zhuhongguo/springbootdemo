package com.egoint.model;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 用户
 * 
 * @author User
 *
 */
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	// 用户编码
	private String uid;
	// 真实姓名
	private String name;
	// 年龄
	private Integer age;
	// 性别 1:男,2:女
	private Integer sex;
	// 身份证号
	private String carid;
	// 手机号码
	private String phone;
	// 居住地址
	private String address;
	// 用户余额
	private BigDecimal money;
	// 登录账号
	private String username;
	// 登录密码
	private String password;
	// 支付密码
	private String paypwd;
	// 用户类型 1:系统管理员 2:普通用户 3：客服
	private Integer role;
	// 头像
	private String icon;
	// 驾照图片
	private String jzpic;
	// 驾照编号
	private String jzid;
	// 驾照领证日期
	private String jzlssue;
	// 驾照有效日期
	private String jzvilid;
	// 驾照类型 A1,A2,A3,B1,B2,C1,C3,C4
	private String jztype;
	// 驾照状态 1：实习 2：正常 3：吊销 4：过期
	private Integer jzstatus;
	// 驾照档案编号
	private String jzdrivingid;
	// 生日
	private String birthday;
	// APP唯一key
	private String appkey;
	// 微信号
	private String wechat;
	// QQ号
	private String qq;
	// 支付宝账号
	private String alipay;
	// 微博账号
	private String weibo;
	// 用户状态 1:信息未完善 2：审核中 3：正常4：有未处理订单 5：失信 6:软删除
	private Integer status;
	// 信用分
	private Integer credit;
	// 邮箱
	private String email;


	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getCarid() {
		return carid;
	}

	public void setCarid(String carid) {
		this.carid = carid;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public BigDecimal getMoney() {
		return money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@JsonIgnore
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPaypwd() {
		return paypwd;
	}

	public void setPaypwd(String paypwd) {
		this.paypwd = paypwd;
	}

	public Integer getRole() {
		return role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getJzpic() {
		return jzpic;
	}

	public void setJzpic(String jzpic) {
		this.jzpic = jzpic;
	}

	public String getJzid() {
		return jzid;
	}

	public void setJzid(String jzid) {
		this.jzid = jzid;
	}

	public String getJzlssue() {
		return jzlssue;
	}

	public void setJzlssue(String jzlssue) {
		this.jzlssue = jzlssue;
	}

	public String getJzvilid() {
		return jzvilid;
	}

	public void setJzvilid(String jzvilid) {
		this.jzvilid = jzvilid;
	}

	public String getJztype() {
		return jztype;
	}

	public void setJztype(String jztype) {
		this.jztype = jztype;
	}

	public Integer getJzstatus() {
		return jzstatus;
	}

	public void setJzstatus(Integer jzstatus) {
		this.jzstatus = jzstatus;
	}

	public String getJzdrivingid() {
		return jzdrivingid;
	}

	public void setJzdrivingid(String jzdrivingid) {
		this.jzdrivingid = jzdrivingid;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getAppkey() {
		return appkey;
	}

	public void setAppkey(String appkey) {
		this.appkey = appkey;
	}

	public String getWechat() {
		return wechat;
	}

	public void setWechat(String wechat) {
		this.wechat = wechat;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getAlipay() {
		return alipay;
	}

	public void setAlipay(String alipay) {
		this.alipay = alipay;
	}

	public String getWeibo() {
		return weibo;
	}

	public void setWeibo(String weibo) {
		this.weibo = weibo;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getCredit() {
		return credit;
	}

	public void setCredit(Integer credit) {
		this.credit = credit;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public User() {
		super();
	}

	public User(String uid) {
		super();
		this.uid = uid;
	}

}
