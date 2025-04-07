/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ming Hui
 */
public class TestShapeVolume {
    public static void main(String[] args) {
        Sphere sphere1 = new Sphere(5);
        Cylinder cylinder1 = new Cylinder(5);
        Cone cone1 = new Cone(5);
        System.out.printf("Sphere Volume: %.4f\n",sphere1.calculateVolume());
        System.out.printf("Sphere Surface Area: %.4f\n",sphere1.calculateSurfaceArea());
        System.out.printf("Cylinder Volume: %.4f\n",cylinder1.calculateVolume());        
        System.out.printf("Cylinder Surface Area: %.4f\n",cylinder1.calculateSurfaceArea());
        System.out.printf("Cone Volume: %.4f\n",cone1.calculateVolume());
        System.out.printf("Cone Surface Area: %.4f\n",cone1.calculateSurfaceArea());
    }

}
