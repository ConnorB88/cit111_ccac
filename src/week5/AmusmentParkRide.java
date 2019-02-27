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
public class AmusmentParkRide {
    public static void main(String[] args){
        final int MIN_CM = 56;
        int riderheight;
        int riderheight2;
        Scanner keyScan = new Scanner(System.in);
        
        System.out.println("The Minimum height required to ride on the Phantom is 56 centimeters.");
        
        System.out.println("What is either of your heights in centimeters?");
        
        riderheight = keyScan.nextInt();
        
        riderheight2 = keyScan.nextInt();
        
        if(riderheight < MIN_CM && riderheight2 < MIN_CM){
            System.out.println("Both of you are too short.");
        }else{
            System.out.println("Both of you can ride!");
        }     
    }
}
