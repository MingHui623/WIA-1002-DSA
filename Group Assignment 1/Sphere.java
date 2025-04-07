/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ming Hui
 */
public class Sphere implements Shapes{
    private double radius;
    
    //constructor
    public Sphere(double radius){
        this.radius = radius;
    }
    
    //calculate volume 

    @Override
    public double calculateVolume() {
        return (4.0/3.0 * Math.PI * radius * radius * radius);
    }

    @Override
    public double calculateSurfaceArea() {
        return (4 * Math.PI * radius * radius);
    }
    
}
