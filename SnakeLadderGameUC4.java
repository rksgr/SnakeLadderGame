package com.mycompany.snake_ladder_08_dec;
// Repeat till the player reaches the winning position 100

public class SnakeLadderGameUC4 {
    public static void main(String []args){
        //constants
        final int Start_POS = 0;
        // variables
        int new_pos = Start_POS;
        while (new_pos <100){
            // Get random integer between 1 and 6
            int roll_num = (int)Math.ceil(Math.random()*6);
            // Get random integer between 0 and 2
            int options_avail = (int)Math.floor(Math.random()*3);
            //System.out.println("The game starts from the starting position of "+ START_POS);
            System.out.println("The player gets the number "+ roll_num);
            // Moves behind
            if (options_avail==0){
                new_pos -=roll_num;
                System.out.println("The player moves behind by "+ roll_num + " positions"
                            + "and reaches the position of "+ new_pos);
            }
            // Does not move
            else if (options_avail == 1){

                    System.out.println("The player does not move.");
            }
            // Moves ahead
            else if (options_avail==2){
                    new_pos +=roll_num;
                    System.out.println("The player moves ahead by "+ roll_num + " positions and reaches the position of "
                            + new_pos); 
            }
            if (new_pos<0){
                new_pos = 0;
            }
        }   
    }
}
