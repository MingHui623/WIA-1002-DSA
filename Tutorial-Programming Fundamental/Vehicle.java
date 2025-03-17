/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ming Hui
 */
public abstract class Vehicle {
    double maxSpeed;
    protected double currentSpeed;
    
    //constructor
    Vehicle(double ms){
        this.maxSpeed = ms;
    }
    
    abstract void accelerate();
    
    //method to get current speed
    public double getCurrentSpeed(){
        return currentSpeed;
    }
    
    //method to get max speed
    public double getMaxSpeed(){
        return maxSpeed;
    }
    
    //method pedal to the metal
    public void pedalToTheMetal(){
        while(currentSpeed < maxSpeed){
            accelerate();
        }
    }
}

//the instance of Vehicle cannot be created because it is an abstract class.