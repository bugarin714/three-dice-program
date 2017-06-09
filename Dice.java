/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagame;
import java.util.Arrays;
/**
 *
 * @author juan
 */
public class Dice {
    private int d;
    private int v;
    int i=0; //counter measure for values in arrays
    int[] History = new int[100];
    public Dice (int dice){
    d = dice;
    }
    // this is the dice roll method
    public int Roll(){
        int value = (1 +(int)(Math.random()*(6))) * d;
        v = value;
        History[i] = value;// once set to zero the m_i value will be stored in and index of zero
        i++;//allows for more storage of values 
        return value;
        }
    // the input needed for user to set number of dice
    public void setDice(int num){
        d = num;
    
    }
    // history implementation
    public void history(){
        System.out.println("your history of rolls:");
        for(int i = 0;i<History.length;i++)
            System.out.println(History[i]);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Dice History=");
        builder.append(Arrays.toString(History));
	builder.append("]");
	return builder.toString();
        //all this part is needed in oerder to bring back the list of rolls in an array
    }
}

   
