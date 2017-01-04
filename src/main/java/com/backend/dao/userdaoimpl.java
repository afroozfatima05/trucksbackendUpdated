package com.backend.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.users.userModelClass;


@Repository("userdaoimpl")
@Transactional
public class userdaoimpl implements usersdao{
	@Autowired
	private SessionFactory sessionFactory;
	public void registerUser(userModelClass userModelClass) {
		Session session=sessionFactory.getCurrentSession();
		session.save(userModelClass);
		System.out.println("user saved");
		
	}

}


