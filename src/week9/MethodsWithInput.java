/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9;

/**
 *
 * @author connor.britton
 */
public class MethodsWithInput {
    public static void main(String[] args){
        int firstNum = 26;
        int secondNum = 17;
        String name = "Delores";
        addNumbers(3477, secondNum);
    }// close main
    /**
     * Adds the input parameters and prints results
     * @param a
     * @param b 
     */
    public static void addNumbers(int a, int b){
        int result = a + b;
        System.out.println("Result: " + result);
     }
    
}// close class
