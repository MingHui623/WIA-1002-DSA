/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ming Hui
 */
public class StorePairGeneric <T extends Comparable<T>> implements Comparable<StorePairGeneric<T>>{
    private T first, second;
    
    public StorePairGeneric(T first, T second){
        this.first = first;
        this.second = second;
    }
    
    public T getFirst(){
        return first;
    }
    
    public T getSecond(){
        return second;
    }
    
    public void setPair(T first, T second){
        this.first = first;
        this.second = second;
    }
    
    @Override
    public int compareTo(StorePairGeneric<T> a){
        return this.first.compareTo(a.getFirst()); //compare the first values for both objects
    }
    
    @Override
    public String toString(){
        return "first = " + first + " second = " + second;
    }
    
    //test class
    public static void main(String[] args) {
        //assign values to object
        StorePairGeneric <Integer> a = new StorePairGeneric<>(6,4);
        StorePairGeneric <Integer> b = new StorePairGeneric<>(2,2);
        StorePairGeneric <Integer> c = new StorePairGeneric<>(6,3);
        
        
        System.out.println("Object a: " + a);
        System.out.println("Object b: " + b);
        System.out.println("Object c: " + c);
        System.out.println("");
        
        System.out.println("Comparing a and b: "+ a.compareTo(b));
        System.out.println("Comparing b and c: "+ b.compareTo(c));
        System.out.println("Comparing a and c: "+ a.compareTo(c));
    }
}
