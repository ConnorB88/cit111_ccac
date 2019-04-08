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
public class BasicSwitch {
     public static void main(String[] args){
         // a hard coded value to test switch functionality
         final int SELECTOR = 23;
         
         switch(SELECTOR){
             case 1:
                 System.out.println("First case selected");
                 break;
             case 2:
                 System.out.println("Second case selected");
                 break;
             case 78:
                 System.out.println("78 case selected");
                 break;
             default: 
                 System.out.println("Default case");
         }// close of switching block
     }// close main
}// close class
