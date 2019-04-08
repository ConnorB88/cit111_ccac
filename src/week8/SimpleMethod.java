/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author connor.britton
 */
public class SimpleMethod {
    // declaring a class memeber variable
     public static void main(String[] args){
         int response;
          System.out.println("******Switches and Methods******");
          System.out.println("Options:");
          System.out.println("1 - Print a Special Statement");
          System.out.println("2- Generate a really big number");
          System.out.println("3- Get me out of here!");
          System.out.println("Enter an int and press enter:");
          Scanner keyScan = new Scanner(System.in);
          response = keyScan.nextInt(); 
          switch(response){
              case 1:
                  printStatement();
                  break;
              case 2:
                  generateBigNumber();
                  break;
              case 3:
                  outOfHere();
                  break;
          }
    } // close main
    // A method is a named block of code that does a single task
    // a single task (aka function, routine)
    public static void printStatement(){
        System.out.println("SPECIAL STATEMENT");
    }  
    public static void generateBigNumber(){
    Random r = new Random();
        
     BigInteger bigInt = new BigInteger(100,r);
        
     System.out.println(bigInt);
    }
     public static void outOfHere(){
         System.out.println("Im out of here");
     }
}
