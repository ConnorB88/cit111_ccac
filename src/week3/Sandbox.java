/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import java.util.Scanner;

/**
 *
 * @author connor.britton
 */
public class Sandbox {
    public static void main(String[] args){
        int response;
        int compScore = 0;
        Scanner keyScan = new Scanner(System.in);   
        // ask the user for an integer, store = it in variable age
        System.out.println("Do you play video games (1 = yes, 2 = no): ");
        response = keyScan.nextInt();
        if(response == 1){
            // exactly the same effect
            compScore = compScore + 10;
        }
        System.out.println("you entered age of : " + response);
        response = keyScan.nextInt();
        System.out.println("you entered age of : " + response);
    }    
}
