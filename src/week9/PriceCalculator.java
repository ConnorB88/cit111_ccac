/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9;
import java.util.Scanner;
/**
 *
 * @author connor.britton
 */
public class PriceCalculator {
    public static void main(String[] args){
        final double ITEM_PRICE = 100.0;
        double discount = 0.15;
        double limit = 200;
        double response;
        
        System.out.println("Hard coded price value: $" + ITEM_PRICE);
        System.out.println("Enter your purchase limit and press enter (no $)");
        
        Scanner keyScan = new Scanner(System.in);
        response = keyScan.nextInt(); 
        
        displayPriceWithTax(ITEM_PRICE);
        computePriceAfterDiscount(ITEM_PRICE, discount);
        displayPurchasableNumber(ITEM_PRICE, response);
    }
    
    public static void displayPriceWithTax(double price){
        final double TAX_RATE = 0.075;
        
        double totalPrice = price * (1 + TAX_RATE);
        System.out.println("Total price with tax: $" + totalPrice);
    }
    
    public static void computePriceAfterDiscount(double price, double discount){
        double finalPrice = price - (price * discount);
        System.out.println("Hard-coded discount of %" + discount);
        System.out.println("Price after discount: $" + finalPrice);
    }
    public static void displayPurchasableNumber(double price, double limit){
        int numPurchasable = (int) Math.floor(limit / price);
        System.out.println("With $" + limit + ", you can buy " + numPurchasable + " units");
    }
}
