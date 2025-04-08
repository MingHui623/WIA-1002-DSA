/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ming Hui
 */
public class FindMinMax {
    public static void main(String[] args) {
        Integer[] intArray = {5,4,7,1,4,9,8,2};
        String[] strArray = {"red", "blue", "orange", "tan"};
        
        minmax(intArray);
        minmax(strArray);
    }
    
    //min max method
    public static <T extends Comparable<T>> void minmax(T [] array){
        T min = array[0];
        T max = array[0];
        
        //check values
        for(T element : array){
            if(element.compareTo(min)<0){ //if the element is smaller than current min
                min = element;
            }
            else if(element.compareTo(max)>0){
                max = element;
            }
        }
        
        //display the min and max
        System.out.println("Min = "+ min + " Max = "+ max);
        
    }
}
