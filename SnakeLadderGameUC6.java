// Report the number of times the dice was played to win the game
// And also th eposition after every die roll
package com.mycompany.snake_ladder_08_dec;


public class SnakeLadderGameUC6 {
    public static void main(String []args){
        //constants
        final int Start_POS = 0;
        final int FINAL_POS = 100;
        // variables
        int new_pos = Start_POS;
        int cnt_dice_played = 0;
        while (new_pos !=FINAL_POS){           
            // Get random integer between 1 and 6
            int roll_num = (int)Math.ceil(Math.random()*6);
            cnt_dice_played++;
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
            if (new_pos>100){
                new_pos -=roll_num;
            }
        }   
    System.out.println("The dice was played a total of "+ cnt_dice_played +" times to win the game.");
    }
}
   
