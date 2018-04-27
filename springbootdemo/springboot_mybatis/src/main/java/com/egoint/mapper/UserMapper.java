package com.egoint.mapper;

import java.util.List;

import com.egoint.form.UserForm;
import com.egoint.model.User;

public interface UserMapper {
	User getUserbyId(String  uid);

	List<User> findUsersByPage(UserForm userform);

	int countUser(UserForm userform);

	User getUserByUsername(String username);

}
