
package com.mycompany.snake_ladder_08_dec;
        
public class SnakeLadderGameUC3 {
    public static void main(String []args){
        // variables
        int new_pos = 0;
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
        // does not make any move
        else if (options_avail == 1){
                System.out.println("The player does not move.");
        }
        // Moves ahead
        else if (options_avail==2){
                new_pos +=roll_num;
                System.out.println("The player moves ahead by "+ roll_num + " positions and reaches the position of "
                        + new_pos); 
        }       
    }   
}
