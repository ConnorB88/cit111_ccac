/*
 * Copyright (C) 2018 delores
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package week3;

import java.util.Scanner;

/**
 * Class to demonstrate implementation of if/else logic in context of an
 * activity that creates a chain of logic to assess friend compatability
 *
 * @author delores the javabot
 */
public class FriendsWithUserInput {

    public static void main(String[] args) {
        System.out.println("Welcome User");
        //container for storing user input. No initial value given.
        int response;
        // compatability score: this variable will be adjusted based on
        // the user's response to questions
        int compScore = 0;
        Scanner keyScan = new Scanner(System.in); 
        // create a scanner object and store a reference to it in variable
        // of type Scanner called keyboardReader
        // Scanner keyboardReader = new Scanner(System.in);
        // RESPONSE_CAR = keyboardReader.nextInt();
         System.out.println("Do you drive a Toyata? (0 = no, 1 = yes)");
         
          response = keyScan.nextInt();
        // once we have the response saved, implement our decision logic
        if (response == 1) {
            compScore = compScore + 10;
            System.out.println("Your compatability score is: " + compScore);
            System.out.println("Can you do magic? (0 = no, 1 = yes)");
        }
         response = keyScan.nextInt();
        
            if (response == 1) {
                compScore = compScore + 20;
                System.out.println("Your compatability score is now: " + compScore);
            }
            
            // lots more questions
            // but you already have a keyboardReader so you don't need to repeat line 41
            // just use your object like you did in line 42 again
            //System.out.println("**************************");
           //System.out.println("FINAL FRIEND DETERMINATION");
            //System.out.println("**************************");
            // final check of compatibility score
            if (compScore > 5) {
                System.out.println("Based on our compatability score, we might\n"
                        + "indeed make good friends");
            } else {
                System.out.println("Yikes, according to my \ndecision tree,"
                        + "we probably wouldn't make good friends.");
            } // end of if/else blocks
       
    }// close main
} //close class
