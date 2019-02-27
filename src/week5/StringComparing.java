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
public class StringComparing {
     public static void main(String[] args){
      final String USER_USERNAME = "javaghost";
      final String USER_PASSWORD = "ic0d3"; 
      String responseusername;
      String responsepassword;
         
      Scanner keyScan = new Scanner(System.in);
      
      System.out.println("What is your Username.");
      
      responseusername = keyScan.next();
      
      System.out.println("What is your Password.");
      
      responsepassword = keyScan.next();
      
      if(responseusername.equals(USER_USERNAME) && responsepassword.equals(USER_PASSWORD)){
          
        System.out.println("Authentication Successful!");  
      }else{
          
         System.out.println("Authentication Failed!");   
      }
    }
}
