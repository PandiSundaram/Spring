package com.pandi.spring.config;

import com.pandi.spring.GameRunner;
import com.pandi.spring.config.ConfigSeed;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMain {


    public static void main(String arg[]){



        var context = new AnnotationConfigApplicationContext(ConfigSeed.class);
        context.getBean(GameRunner.class).run();



//        var game = new OnlineCricket();
//        //var game = new OnlineFootBall();
//        var GameRunner = new GameRunner(game);
//        GameRunner.run();

    }



}
