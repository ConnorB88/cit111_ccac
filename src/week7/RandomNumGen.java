/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

import java.util.Random;
/**
 *
 * @author connor.britton
 */
public class RandomNumGen {
    public static void main(String[] args){
        int unitQuality;
        int totalUnitsMade = 0;
        int totalFailures = 0;
        final int QUALITY_THRESHOLD = 80;
        final int MAX_QUALITY = 100;
        final int UNITS_TO_MAKE = 50;
        
        Random randGenerator = new Random();
            
      while(totalUnitsMade < UNITS_TO_MAKE){
          
        unitQuality = randGenerator.nextInt(MAX_QUALITY);
         
        if(unitQuality < QUALITY_THRESHOLD){
         totalUnitsMade++;
         totalFailures++;
         System.out.println("Unit Quality: " + unitQuality + " " + "Unit below quality standards!");
         System.out.println("Total Failures: " + totalFailures + " " + "out of "  + totalUnitsMade + " " + "units made");
        }else
        {
         totalUnitsMade++;
         System.out.println("Unit Quality: " + unitQuality + " " + "Unit passes quality test");
         System.out.println("Total Failures: " + totalFailures + " " + "out of "  + totalUnitsMade + " " + "units made");
        }
      }
       System.out.println("Tested units:" + "" + totalUnitsMade);
       System.out.println("Failure Ratio:" + totalUnitsMade/totalFailures);
   }
}  