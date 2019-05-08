/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object_week11;

/**
 * Client class of our Donut class
 * We make instances of Donut objects
 * and populate their member variables
 * @author connor.britton
 */
public class DonutLand {
    public static void main(String[] args){
        // make (i.e. "instantiate") a Donut
        // and store a reference to that object
        // in a variable called firstDonut
        // of type Donut
        Donut firstDonut = new Donut();
        firstDonut.name = "Drum";
        firstDonut.percRemaining = 100;
        firstDonut.hasHole = true;
        firstDonut.size = "Medium";
        firstDonut.flavor = "Chocolate sprinkled";
        firstDonut.eatDonut(100);
        printDonutStats(firstDonut);
        // firstDonut should have 90% left
        // instantiate your second Donut
        // populate its member variables
        // with proper values
        
        Donut secondDonut = new Donut();
        secondDonut.name = "Jord";
        secondDonut.percRemaining = 100;
        secondDonut.hasHole = true;
        secondDonut.size = "Medium";
        secondDonut.flavor = "Chocolate not sprinkled";
        secondDonut.eatDonut(100);
        printDonutStats(secondDonut);
    } // close main
    public static void printDonutStats(Donut d){
        System.out.println("Perc remaining of " + d.name + " is " + d.getPercentRemaining() + "%");
    }
    
    
}// close class
