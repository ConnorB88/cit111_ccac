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
public class GemotricShapes {
    public static void main(String[] args){
       // call calcVolumeOfCube here 
       
       
       System.out.println("Enter the side length of the cube to calculate its volume:"); 
       Scanner keyScan = new Scanner(System.in);
       double response = keyScan.nextDouble(); 
        
       double returnedValue = calcVolumeOfCube(response);
       
       System.out.println("Volume of a cube with sidelength of " + response + " is "+ returnedValue); 
       
       System.out.println("Enter the cylinder radius:"); 
       double responseRadius = keyScan.nextDouble(); 
       
       System.out.println("Enter the cylinder height:"); 
       double responseHeight = keyScan.nextDouble(); 
       
       double returnedValue2 = calcVolumeOfCylinder(responseRadius, responseHeight);
       
       System.out.println("Volume of a cylinder with radius of " + responseRadius + " and height of " + responseHeight + " is " + returnedValue2); 
    
    }// close main
    
    public static double calcVolumeOfCube(double sideLength){
        // raise sidelenth to the third power
        double cubeVolume = Math.pow(sideLength,3);
        return cubeVolume;
    }// close method
    
    public static double calcVolumeOfCylinder(double radius, double height){
        final double PI = 3.1416;
        double cylVol = PI * (radius * radius) * height;
        return cylVol;
    }// close method
    public static double calcVolumeOfTrapazoid(double b1, double b2, double height){
        double trapArea = (0.5) * (b1 + b2) * height;
        return trapArea;
    }// close method
}// close class
