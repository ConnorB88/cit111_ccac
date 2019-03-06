/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Scanner;
/**
 *
 * @author connor.britton
 */
public class DoIHaveEnoughGas {
     public static void main(String[] args){
        final int STANDARD_MPG= 28;
        int gasremaining;
        int milesremaining;
        Scanner keyScan = new Scanner(System.in);
        
        System.out.println("How many gallons of gas remain in your tank?");
        
        gasremaining = keyScan.nextInt();
        
        int cardrive = gasremaining * STANDARD_MPG;
        
        System.out.println("How many miles to the next station? ");
        
        milesremaining = keyScan.nextInt();
        
        if(cardrive < 50 && milesremaining < 30 ){
            
            System.out.println("Whew! You'll make it to the next station.");
        }else{
            
           System.out.println("You're out of luck."); 
        }
    }
}
