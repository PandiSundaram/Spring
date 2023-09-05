package com.pandi.spring;

public class OnlineCricket implements GameRunnerInterface {


    public void up(){
       System.out.println("straight drive");
    }

    public void down(){

        System.out.println("backfoot drive");

    }

    public void left(){
        System.out.println("cover drive");

    }

    public void right(){
        System.out.println("on drive");

    }


}
