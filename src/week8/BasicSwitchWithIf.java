/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

/**
 *
 * @author connor.britton
 */
public class BasicSwitchWithIf {
     public static void main(String[] args){
         // a hard coded value to test switch functionality
         final int SELECTOR = 3;
         
         if(SELECTOR == 1){
          System.out.println("First case selected");
         }else if(SELECTOR == 2){
          System.out.println("Second case selected");
         }else if(SELECTOR == 23){
           System.out.println("23 case selected");  
         }else if(SELECTOR == 90){
           System.out.println("90 case selected");  
         }else{
          System.out.println("default case selected");    
         }
     }// close of switching block
 }// close main
// close class
