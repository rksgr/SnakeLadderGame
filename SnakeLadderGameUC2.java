package com.mycompany.snake_ladder_08_dec;

public class SnakeLadderGameUC2 {
    public static void main(String []args){
        int START_POS = 0;
        // Get random number between 1 and 6
        int num = (int)Math.ceil(Math.random()*6);
        System.out.println("The game starts from the starting position of "+ START_POS);
        System.out.println("The player gets the number "+ num);
    }
}
