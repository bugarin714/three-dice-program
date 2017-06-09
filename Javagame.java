/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javagame;
//main program
import java.util.Scanner;
/**
 *
 * @author juan
 */
public class Javagame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int round = 1;
        int total = 0;
        int Match = 1;
        // calling of the dice class
        Dice dice = new Dice(1);
        do{
            // users imput of dice goes here
            System.out.println("So... how many dice we rolling here?");
            int die = input.nextInt();
            dice.setDice(die);
            // users guess
            System.out.println("better guess my rolls ive never lost at all");
            int guess = input.nextInt();
            int roll= dice.Roll();
            // when users guess is correct
            if (guess == roll){
                System.out.println("you won their buddy you beat me fair and square");
            }
            // when the user is wrong
            if (guess != roll){
            System.out.println("welp another one bites the dust heh. heh..");
        }
            System.out.printf("comp roll: %d and your roll;%d\n", roll, guess );
            total = total + 1;
		System.out.println("Play again Yes=1 No=0");
		Match = Match + 1;
		round = input.nextInt();
		System.out.println("Plays : "+ total);
		
		} while (round == 1);
		{
			if (round == 0)
                            System.out.print(dice.toString());
				System.out.println("Bye");
                        System.exit(0);
        }
        // TODO code application logic here
    }
    
}
