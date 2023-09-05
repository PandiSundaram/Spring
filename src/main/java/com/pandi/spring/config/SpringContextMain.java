package com.pandi.spring.config;

import com.pandi.spring.config.ConfigSeed;
import com.pandi.spring.config.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringContextMain {



    public static void main(String arg[]){


        var context = new AnnotationConfigApplicationContext(ConfigSeed.class);


        System.out.println( context.getBean("name"));
        System.out.println(  context.getBean("age"));
        System.out.println(  context.getBean(Person.class));



    }


}
