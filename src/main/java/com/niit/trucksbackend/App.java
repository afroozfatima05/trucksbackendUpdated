package com.niit.trucksbackend;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.backend.config.AppConfig;
import com.backend.dao.usersdao;
import com.niit.users.userModelClass;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
    	//annotationConfigApplicationContext.refresh();
    	usersdao userdao=(usersdao) annotationConfigApplicationContext.getBean("userdaoimpl");
    	userModelClass user=new userModelClass ();
    	user.setUsername("fatima");
    	user.setPassword("123456");
    	userdao.registerUser(user);
    	
        System.out.println( "from app.java" );
    }
}
