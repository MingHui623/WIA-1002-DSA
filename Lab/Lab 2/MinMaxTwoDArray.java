/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ming Hui
 */
public class MinMaxTwoDArray {
    //minimum element 
    public static <E extends Comparable<E>> E min(E[][] list){
        E min = list[0][0];
        
        //go through the 2D array row by row
        for(E[] row : list){
            for(E element : row){
                if(element.compareTo(min)<0){
                    min = element;
                }
            }
        }
        
        return min;
    }
    
    //maximum element 
    public static <E extends Comparable<E>> E max(E[][] list){
        E max = list[0][0];
        
        //go through the 2D array row by row
        for(E[] row : list){
            for(E element : row){
                if(element.compareTo(max)>0){
                    max = element;
                }
            }
        }
        
        return max;
    }
    
    //test program
    public static void main(String[] args) {
        Integer [][] array = {{4,5,6},{1,2,3}};
        System.out.println("Max Value: "+ max(array));
        System.out.println("Min Vaue: "+ min(array));
    }
}
