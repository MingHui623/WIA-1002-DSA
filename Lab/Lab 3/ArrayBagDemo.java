/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ming Hui
 */
public class ArrayBagDemo {
    //testadd method
    private static void testAdd(BagInterface<String> Bag, String[] content){
        System.out.printf("Adding %s\n", String.join(" ", content));
        for(String item: content){
            Bag.add(item);
        }
    }
    
    //display bag method
    private static void displayBag(BagInterface<String> bag){
        Object[] bagArray = bag.toArray();
        System.out.printf("The bag contains %d strings(s), as follows: \n", bagArray.length);
        for(int i = 0; i< bagArray.length; i++){
            System.out.print(bagArray[i]+ " ");
        }
        System.out.println("\n");
    }
    public static void main(String[] args) {
        ArrayBag<String> bag1 = new ArrayBag<>();
        ArrayBag<String> bag2 = new ArrayBag<>();
        
        String[] contentsOfBag1 = {"A", "A", "B", "A", "C", "A"};
        String[] contentsOfBag2 = {"A", "B", "A", "C", "B", "C", "D", "another string"};
      
        //add content into bag1
        System.out.println("bag 1:");
        testAdd(bag1, contentsOfBag1);
        displayBag(bag1);
        
        //add content into bag2
        System.out.println("bag 2:");
        testAdd(bag2, contentsOfBag2);
        displayBag(bag2);
        
        //union
        System.out.println("bag3, test the method union of bag1 and bag2");
        ArrayBag<String> bag3 = (ArrayBag<String>)bag1.union(bag2);
        displayBag(bag3);
        
        //intersection
        System.out.println("bag4, test the intersection union of bag1 and bag2");
        ArrayBag<String> bag4 = (ArrayBag<String>)bag1.intersection(bag2);
        displayBag(bag4);
        
        //difference
        System.out.println("bag5, test the method difference of bag1 and bag2");
        ArrayBag<String> bag5 = (ArrayBag<String>)bag1.difference(bag2);
        displayBag(bag5);
    }
}
