/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ming Hui
 */
public class Cylinder implements Shapes{
    private double radius;
    private double height;
    
    //constructor
    public Cylinder(double r){
        radius = r;
        height = 2.0 * r;
    }
    
    @Override
    public double calculateVolume() {
        return(Math.PI * radius * radius * height);
    }

    @Override
    public double calculateSurfaceArea() {
        return (2.0 * Math.PI * radius * radius + 2.0 * Math.PI * radius * height );
    }
    
}
