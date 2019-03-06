/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

import java.util.Scanner;

/**
 *
 * @author connor.britton
 */
public class SimpleWhile {
    public static void main(String[] args){
      int numLoops = 0;
      int userinput;
      String phrase;
      
      Scanner keyScan = new Scanner(System.in);
      
      System.out.println("Enter the value");
      
      userinput = keyScan.nextInt();
      
      System.out.println("Enter the phrase");
      
      phrase = keyScan.next();
      
      while(numLoops <= userinput){
          
          System.out.println( phrase + " " + numLoops);
          
          numLoops = numLoops + 1;
       }
    }
}
