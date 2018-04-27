package com.egoint.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.egoint.form.UserForm;
import com.egoint.mapper.UserMapper;
import com.egoint.model.PageBean;
import com.egoint.model.User;
import com.egoint.service.UserService;
import com.github.pagehelper.PageHelper;


@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

	@Override
	public PageBean<User> getUserListByPage(UserForm userform,int currentPage, int pageSize) {
		PageHelper.startPage(currentPage, pageSize);
        List<User> allUsers= userMapper.findUsersByPage(userform);  
        int countNums = userMapper.countUser(userform);           
        PageBean<User> pageData = new PageBean<>(currentPage, pageSize, countNums);
        pageData.setItems(allUsers);
        return pageData;
	}

	@Override
	public User getUserByUid(String uid) {
		User user = userMapper.getUserbyId(uid);
        return user;
	}

	@Override
	public User getUserByUsername(String username) {
		User user =userMapper.getUserByUsername(username);
		return user;
	}

}
