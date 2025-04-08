/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ming Hui
 */
public class CompareMax {
    //generic static method named "maximum" 
    public static <T extends Comparable<T>> T maximum(T a, T b, T c){
        T max = a;
        
        if(b.compareTo(max)>0){
            max = b;
        }
        if(c.compareTo(max)>0){
            max = c;
        }
               
        return max;
    }
    
    //main method
    public static void main(String[] args) {
        System.out.println(maximum(30,10,20));
    }
}
