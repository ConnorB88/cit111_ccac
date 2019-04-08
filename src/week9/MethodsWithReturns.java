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
public class MethodsWithReturns {
    public static void main(String[] args){
        int initialNumber = 100;
        // calls doubleAValue and store the returned integer in returnedValue
        int returnedValue= doubleAValue(initialNumber);
        System.out.println("Value returned: " + returnedValue);
    }// close main
    
    // a mtehod takes in aan integer, doubles it, and returns the result
    public static int doubleAValue(int value){
        int result = value * 2;
        return result;
    }
    
}// close class
