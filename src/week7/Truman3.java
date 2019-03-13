/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

import java.util.Scanner;
import java.util.StringTokenizer;
/**
 *
 * @author connor.britton
 */
public class Truman3 {
    
    public static void main(String[] args){
        String lady = "Lady";
        String flowers = "Bicycle";
        String beetle = "Beetle";
        
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(input, ",");
        int ctl = Integer.parseInt(tokenizer.nextToken());
        int stepSize = Integer.parseInt(tokenizer.nextToken());
        int max = Integer.parseInt(tokenizer.nextToken());
        
        
        System.out.println(lady);
        
        do {
            System.out.println(flowers);
            ctl = ctl + stepSize;
        }while ((ctl <= max) && (ctl % 2 < 1));
        System.out.println(beetle);
    }
}
