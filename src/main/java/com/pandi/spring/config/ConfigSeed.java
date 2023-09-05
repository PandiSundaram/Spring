package com.pandi.spring.config;


import com.pandi.spring.GameRunner;
import com.pandi.spring.GameRunnerInterface;
import com.pandi.spring.OnlineCricket;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration


record Person (String name,Integer age){

};



public class ConfigSeed {


    @Bean
    public String name(){
        return "pandiSundaram";
    }

    @Bean
    public Integer age(){
        return 18;
    }

    @Bean
    public Person person(){
        return new Person("pandi",20);
    }

    @Bean
    public GameRunnerInterface gameRunnerInterface(){
        return new OnlineCricket();
    }

    @Bean
    public GameRunner gameRunner(){
        return new GameRunner(gameRunnerInterface());
    }

}
