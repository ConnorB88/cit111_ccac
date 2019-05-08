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
public class ModelCar {
    // define member variables
    // every instance of ModelCar
    // will have its own set of these variables
    String color;
    String bodyStyle;
    String year;
    int outsideLights;
    String manufacture;
    boolean insideLights;
    String name;
    int safteyRating;
    int passangers;
    int tireStrength;
    boolean bulletproofwindows;
    // private variables
    private boolean isEngineRunning;
    private double speed;
    
    public void startEngine(){
        isEngineRunning = true;
        System.out.println("Vroom!");
    }
    public void stopEngine(){
        isEngineRunning = false;
        System.out.println("Poof!");
    }
    public boolean checkEngineStatus(){
        return isEngineRunning;
    }
    public double currentSpeed(){
        return speed;
    }
    public double accelerate(int mphIncrease){
        speed = speed + mphIncrease;
        return speed;
    }
    public double decelerate(int mphDecrease){
        speed = speed - mphDecrease;
        return speed;
    }
}
