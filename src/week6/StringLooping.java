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
public class StringLooping {
     public static void main(String[] args){
      //final String USER_USERNAME = "javaghost";
      final String USER_PASSWORD = "ic0d3"; 
      int ctl = 0;
      int target = 3;
      boolean keepLooping = true;
      
      //String responseusername;
      String responsepassword;
         
      Scanner keyScan = new Scanner(System.in);
      
      // System.out.println("What is your Username.");
      
     
      
      System.out.println("What is your Password.");
      
      while(keepLooping){
        
          
       responsepassword = keyScan.next();
   
    
      if(responsepassword.equals(USER_PASSWORD)){
          
         System.out.println("Secret Message: Authentication Successful!"); 
        
           
         break; 
         
      }else{
          
          ctl++;
          System.out.println("Incorrect password, please try again:");  
          System.out.println("Number of attempts:" + ctl);
          System.out.println("Number of attempts allowed:" + target);   
      }  
      if(ctl == 1){
      System.out.println("Please try again:"); 
      }
      if(ctl == 2){
      System.out.println("Please try again:"); 
      }
      if(ctl >= target){
          System.out.println("Accout Terminated."); 
          
          break;   
      }
    } 
  }
}
