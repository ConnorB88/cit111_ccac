/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week12;
import java.util.Scanner;
/**
 *
 * @author connor.britton
 */
public class ArrayPractice {
     public static void main(String[] args){
      String[] carsLicense = new String[8];
      carsLicense[0] = "ERJ-1191";
      carsLicense[1] = "YTV-6277";
      carsLicense[2] = "JWG-4318";
      carsLicense[3] = "KYR-5067";
      carsLicense[4] = "KHP-4200";
      carsLicense[5] = "KRY-6925";
      carsLicense[6] = "KBA-0926";
      carsLicense[7] = "TBP-2345";
      
      userInteraction(carsLicense);
     //for(initialize ; boolean check ; increment )
  
  }// close main 
   
  // a method that takes in a String[] and allows the user to populate values   
   public static void userInteraction(String[] args){
        Scanner keyScan = new Scanner(System.in);
       // display size of the array to user
       System.out.println("Enter what you want to call the license numbers 8 different times.");
       
       String response1 = keyScan.next();
       args[0] = response1;
       
       String response2 = keyScan.next();
       args[1] = response2;
       
       String response3 = keyScan.next();
       args[2] = response3;
       
       String response4 = keyScan.next();
       args[3] = response4;
       
       String response5 = keyScan.next();
       args[4] = response5;
       
       String response6 = keyScan.next();
       args[5] = response6;
       
       String response7 = keyScan.next();
       args[6] = response7;
       
       String response8 = keyScan.next();
       args[7] = response8;
       
       System.out.println(" Now Enter which license number you want to choose between 1 - 8.");
       // ask user which bin they want to access
       // make a Scanner object
       int response = keyScan.nextInt(); 
       // read in an int with scan.nextInt()
       switch(response){
             case 1:
                 System.out.println(args[0]);
                 break;
             case 2:
                 System.out.println(args[1]);
                 break;
             case 3:
                 System.out.println(args[2]);
                 break;
             case 4:
                 System.out.println(args[3]);
                 break;
             case 5:
                 System.out.println(args[4]);
                 break;
             case 6:
                 System.out.println(args[5]);
                 break;
             case 7:
                 System.out.println(args[6]);
                 break;
             case 8:
                 System.out.println(args[7]);
                 break;
             default: 
                 System.out.println("Why didnt you select in the range?");
         }// close of switching block
       // modify user input to work with 0-indexed arrays (subtract 1)
       
       // look up value in array
       
       // display to user
   }
}// close class
