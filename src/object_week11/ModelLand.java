/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object_week11;

/**
 *
 * @author connor.britton
 */
public class ModelLand {
   
    public static void main(String[] args){
        ModelCar policecar1 = new ModelCar();
        policecar1.name = "Metro";
        policecar1.bulletproofwindows = true;
        policecar1.color = "black and white";
        policecar1.bodyStyle = "4 door sport";
        policecar1.insideLights = true;
        policecar1.outsideLights = 5;
        policecar1.manufacture = "Dodge Charger";
        policecar1.passangers = 4;
        policecar1.year = "2008";
        policecar1.safteyRating = 9/10;
        policecar1.tireStrength = 8/10;
        
        ModelCar deLorean = new ModelCar();
        deLorean.year = "1983";
        deLorean.manufacture = "DeLorean DMC-12";
        
        displayCarStats(policecar1);
        policecar1.startEngine();
        policecar1.accelerate(88);
        displayCarStats(policecar1);
        policecar1.decelerate(100);
        policecar1.stopEngine();
        displayCarStats(policecar1);
    }
    public static void displayCarStats(ModelCar anyCarObject){
        System.out.println("********* STATS ***************");
        System.out.println(anyCarObject.year + " " + anyCarObject.manufacture);
        System.out.println("Name: " + anyCarObject.name);
        System.out.println("Engine running? " + anyCarObject.checkEngineStatus());
        System.out.println("Current Speed " + anyCarObject.currentSpeed());
        System.out.println("*************");
    }
}
