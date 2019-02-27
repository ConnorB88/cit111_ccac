/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2_basics;

import java.util.Scanner;
/**
 *
 * @author connor.britton
 */
public class Tabulator {
    
     public static void main(String[] args){
        // create a scanner for gathering user input
        Scanner scanner = new Scanner(System.in);
         
        // declare and initiate our two counter variables to zero
        int totalRespondents = 0;
        int numLinuxUsers = 0;
        
        System.out.println("LINUX USERS SURVEY");
        
        // this while loop will proceed indefinitiely since the value "true"
        // will always be true, resulting in an infinte loop
        
        while(true){
            System.out.println(">>>>>>>>>>QUESTION<<<<<<<<<");
            System.out.println("Do you regularly use Linux software? (Android == Linux!!)");
            System.out.println("(Enter 1 for YES and 0 for NO)");
            
            int userResponse = scanner.nextInt();
            
            // display an automated response based ont he user's input
            if(userResponse ==1){
                // since they indiciated that they use linux, incremet our counter
                numLinuxUsers = numLinuxUsers + 1;
                System.out.println("Yeaah! Free Software Users Unit!");
            }else{
                System.out.println("[sad face] Visit ubuntu.com immediately!");
        } // end if/else block
          
        // increment total respondents regardless of response
        totalRespondents = totalRespondents + 1; 
        
        // print summary statistics each time the question is answered
        
        System.out.println("*********SUMMARY*********");
        System.out.println(totalRespondents + "folks have responded");
        System.out.println(numLinuxUsers + " report(s) regularly using Linux.");
        double linuxDouble = (double) numLinuxUsers;
        double totalDouble = (double) totalRespondents;
        double percentUsers = (linuxDouble/totalDouble) * 100;
        System.out.println(totalRespondents + "folks have responded");
        }
    }
}
