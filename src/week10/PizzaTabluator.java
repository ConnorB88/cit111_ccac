/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

import java.util.Scanner;

/**
 * Calculates how many pizza sliders and/or roast beef sliders do you want.
 * @author connor.britton
 */
public class PizzaTabluator {
    public static int numPizzaSlidersOrdered;
    public static int numRoastBeefSlidersOrdered;
    
    public static void main(String[] args) {
      final String USER_ANWSER = "Yes";
      final String USER_ANWSER2 = "yes";
      printTotalPizzaOrders();
      System.out.println("How many pizza sliders would you like to order?");
      Scanner keyScan = new Scanner(System.in);
      int pizzaresponse = keyScan.nextInt();
      int returnedpizzaValue = orderPizzaSliders(pizzaresponse);
      System.out.println("Cookin' up " + returnedpizzaValue + " pizza sliders.");
      System.out.println("*****************************************************");
      
      System.out.println("How many roast beef sliders would you like to order?");
      int roastbeefresponse = keyScan.nextInt();
      int returnedroastbeefValue = orderRoastBeefSliders(roastbeefresponse);
      System.out.println("Cookin' up " + returnedroastbeefValue + " roast beef sliders.");
      System.out.println("*****************************************************");
      printTotalPizzaOrders();
      
      System.out.println("Do you want to order any more pizza sliders?");
      String anwser = keyScan.next();
      
      if(anwser.equals(USER_ANWSER) || anwser.equals(USER_ANWSER2)){
      System.out.println("How many more pizza sliders would you like to order?");
      int pizzaresponse2 = keyScan.nextInt();
      int returnedpizzaValue2 = orderPizzaSliders(pizzaresponse2);
      System.out.println("Cookin' up " + returnedpizzaValue2 + " pizza sliders now.");
      System.out.println("*****************************************************"); 
      }else{
      printTotalPizzaOrders();  
      }
      
      System.out.println("Do you want to order any more roast beef sliders?");
      String anwser2 = keyScan.next();
      
      if(anwser.equals(USER_ANWSER) || anwser.equals(USER_ANWSER2)){
      System.out.println("How many more roast beef sliders would you like to order?");
      int roastbeefresponse2 = keyScan.nextInt();
      int returnedroastbeefValue2 = orderRoastBeefSliders(roastbeefresponse2);
      System.out.println("Cookin' up " + returnedroastbeefValue2 + " roast beef sliders now.");
      System.out.println("*****************************************************");
      printTotalPizzaOrders();  
      }else{
      printTotalPizzaOrders();  
      }
    }
    public static int orderPizzaSliders(int pizza){
    numPizzaSlidersOrdered = numPizzaSlidersOrdered + pizza;   
    return numPizzaSlidersOrdered;
    }
    public static int orderRoastBeefSliders(int roastbeef){
    numRoastBeefSlidersOrdered = numRoastBeefSlidersOrdered + roastbeef;  
    return numRoastBeefSlidersOrdered;
    }
    public static void printTotalPizzaOrders(){
     System.out.println("***************** ORDER TOTALS *******************");
     System.out.println("Total pizza sliders ordered: " + numPizzaSlidersOrdered);
     System.out.println("Total roast beef sliders ordered: " + numRoastBeefSlidersOrdered);
     System.out.println("***************************************************");
   }
}
