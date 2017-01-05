package com.niit.bakend.bakend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.niit.bakend.config.*;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	
     
    }
}
