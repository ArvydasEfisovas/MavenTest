package com.spring.test2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.SpringConfig;
import service.TestBean;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = 
        		new AnnotationConfigApplicationContext(SpringConfig.class);
        TestBean bean = context.getBean(TestBean.class);
        //String name,String surname,String email,int age,String sex
        TestBean testobject = new TestBean("Arvydas","Efisovas",
        		"arvydasefisovas@gmail.com",22,"Male");
        System.out.println(testobject.toString());
    }
}
