/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ming Hui
 */
public class Cone implements Shapes{
    private double radius;
    private double height;
    
    //constructor
    public Cone(double radius){
        this.radius = radius;
        height = radius * 2;
    }
    
    @Override
    public double calculateVolume() {
       return (1/3.0 * Math.PI * radius * radius * height); 
    }

    @Override
    public double calculateSurfaceArea() {
        return (Math.PI * radius)* (radius + Math.sqrt((radius * radius + height * height)));
    }
    
}
