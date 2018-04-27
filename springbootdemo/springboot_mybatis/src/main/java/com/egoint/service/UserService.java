package com.egoint.service;

import com.egoint.form.UserForm;
import com.egoint.model.PageBean;
import com.egoint.model.User;

public interface UserService {
	/**
	 *根据用户id获取用户
	 * @param uid
	 * @return
	 */
	public  User getUserByUid(String  uid) ;
	/**
	 * 分页获取用户列表
	 * @param userForm
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	public PageBean<User> getUserListByPage(UserForm userForm,int currentPage,int pageSize);
	/**
	 * 根据用户名获取用户
	 * @param username
	 * @return
	 */
	public User getUserByUsername(String username);
}
