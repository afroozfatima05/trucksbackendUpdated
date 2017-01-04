package com.backend.dao;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import com.niit.users.userModelClass;

@ComponentScan("com")
@Repository
public interface usersdao {
	public void registerUser(userModelClass userModelClass);
	}



