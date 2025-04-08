/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ming Hui
 */
public class FindMax {
    public static <E extends Comparable<E>> E max(E[] list){
        if(list == null){
            return null;
        }
        
        E max = list[0];
       
        for(E element : list){
            if(element.compareTo(max)>0){
                max = element;
            }
        }
        
        return max;
    }
}

//Circle class
class Circle implements Comparable<Circle>{
    private double radius;
    
    //constructor
    public Circle(double radius){
        this.radius = radius;
    }
    
    //getter and setter
    public void setRadius(double r){
        this.radius = r;
    }
    
    public double getRadius(){
        return this.radius;
    }
    
    @Override
    public int compareTo(Circle c) {
        return Double.compare(this.radius, c.radius);
    }
    
    @Override
    public String toString(){
        return Double.toString(radius);
    }
    
}

//test class
class test{
    public static void main(String[] args) {
        Integer [] a = {1,2,3};
        String [] b = {"red", "green", "blue"};
        
        //create three circle, then store in array
        Circle c1 = new Circle(3);
        Circle c2 = new Circle(2.9);
        Circle c3 = new Circle(5.9);
        Circle[] c = {c1, c2, c3};
        
        System.out.println(FindMax.max(a));
        System.out.println(FindMax.max(b));
        System.out.println(FindMax.max(c));
    }
}