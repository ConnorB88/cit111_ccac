/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;
import java.util.Random;
/**
 *
 * @author connor.britton
 */
public class RefactorTheRing {
    // chop main up and call the new methods as needed
    static int numViewersSwallowedByRing = 0;
    static String viewer1 = "Katie";
    static String viewer2 = "Josh";
    static String viewer3 = "Rachel";
    static String viewer4 = "Noah";
    static String viewer5 = "Aiden";
    
    public static void main(String[] args) {
        watchFilm(viewer1);
        watchFilm(viewer2);
        watchFilm(viewer3);
        watchFilm(viewer4);
        watchFilm(viewer5);
        System.out.println("Number of viewers swallowed by the ring: " + numViewersSwallowedByRing);
    } // close main
    public static void watchFilm(String viewer){
        
        System.out.println(viewer + " watched the tape; 7 days to live");
        
        Random randomMachine = new Random();
        boolean madeCopy = randomMachine.nextBoolean();
        
        System.out.print("Did " + viewer + " make a copy? ");
        System.out.println(madeCopy);
        
        if(madeCopy){
            System.out.println(viewer + " is safe from The Ring!");
        } else {
            System.out.println("No copy made; " + viewer + " is toast");
            numViewersSwallowedByRing = numViewersSwallowedByRing + 1;
        }
        System.out.println("****************************************");
  }
    // write and test your new methods here
}
