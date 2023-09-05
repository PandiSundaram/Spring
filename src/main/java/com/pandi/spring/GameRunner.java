package com.pandi.spring;

public class GameRunner {

    private GameRunnerInterface game;

    public GameRunner(GameRunnerInterface game){
        this.game = game;
    }


    public void run(){
       System.out.println(game);
       game.up();
       game.down();
       game.left();
       game.right();
    }

}
