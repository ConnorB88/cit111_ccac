/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object_week11;

/**
 * "Blueprint" class that models
 * a real-world donut; No main method.
 * @author connor.britton
 */
public class Donut {
    // Member variables
    // Each instance of a Donut class
    // will receive each of these member variables
    // and can customize their values
   String name;
   int percRemaining;
   String size;
   String shape;
   boolean hasHole;
   String flavor;
   /*
   * Simulates eating some percent of this
   * donut
   * @param percentEaten
   */
   public void eatDonut(int percentEaten){
       percRemaining = percRemaining - percentEaten; 
   }
   /*
   * Accessor method for retrieving the value
   * of the member varialbe: percRemaining;
   * @return the percent remaining
   */
   public int getPercentRemaining(){
       return percRemaining;
   }
}
