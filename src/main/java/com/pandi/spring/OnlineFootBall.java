package com.pandi.spring;

public class OnlineFootBall implements GameRunnerInterface{



    public void up(){
        System.out.println("pass next");
    }

    public void down(){

        System.out.println("dont pass");

    }

    public void left(){
        System.out.println("off goal post");

    }

    public void right(){
        System.out.println("on goal post");

    }



}
