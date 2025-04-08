/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ming Hui
 */
import java.util.Arrays;

public class ArrayBag<T extends Comparable<T>> implements BagInterface<T>{
    private T[] bag;
    private static final int DEFAULT_CAPACITY = 25;
    private int numberOfEntries;
    
    //constructor
    public ArrayBag(){
        bag = (T[]) new Comparable[DEFAULT_CAPACITY];
        numberOfEntries = 0;
    }
    
    @Override
    public int getCurrentSize() {
        return numberOfEntries;
    }

    @Override
    public boolean isFull() {
        return bag.length == numberOfEntries;
    }

    @Override
    public boolean isEmpty() {
       return numberOfEntries == 0; 
    }

    @Override
    public boolean add(T newEntry) {
        if (isFull()){
            return false;
        }
        else{ //if bag is not full, then add to next index 
            bag [numberOfEntries] = newEntry;
            numberOfEntries++;
            return true;
        }
    }

    @Override
    public T remove() { //remove unspecified entry
        if(isEmpty()){
            return null;
        }
        //get a random index to ommit
        int randomIndex = (int)(Math.random() * numberOfEntries);
            
        T holder = bag[randomIndex];
        bag [randomIndex] = bag[numberOfEntries -1];
        bag [numberOfEntries -1]= null;
        numberOfEntries--;
        
        return holder;
    }

    @Override
    public boolean remove(T anEntry) {
        for(int i = 0; i< numberOfEntries; i++){
            if(bag[i].equals(anEntry)){
                bag[i] = bag[numberOfEntries - 1];
                bag[numberOfEntries - 1] = null;
                numberOfEntries--;
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        Arrays.fill(bag, null);
        numberOfEntries = 0;
    }

    @Override
    public int getFrequencyOf(T anEntry) {
        int count = 0;
        
        for(T elements: bag){
            if(anEntry.equals(elements)){
                count++;
            }
        }
        return count;
    }

    @Override
    public boolean contains(T anEntry) {
        boolean flag = false;
        for(T elements : bag){
            if(anEntry.equals(elements)){
                flag = true;
            }
        }  
        return flag;         
    }

    @Override
    public T[] toArray() {
      return Arrays.copyOf(bag, numberOfEntries);
    }

    @Override
    public BagInterface<T> union(BagInterface<T> anotherBag) {
        ArrayBag<T> result = new ArrayBag<>();
        
        //transfer the bag elements to array and combine
        T[] thisArrayBag = this.toArray();
        T[] anotherArrayBag = anotherBag.toArray();
        
        //combine arrays
        T[] combinedArray = Arrays.copyOf(thisArrayBag,thisArrayBag.length+anotherArrayBag.length);
        System.arraycopy(anotherArrayBag, 0, combinedArray, thisArrayBag.length, anotherArrayBag.length);
        
        //Sort elements
        Arrays.sort(combinedArray);
        
        //Add sorted elements to result
        for(T item : combinedArray){
            result.add(item);
        }
        
        return result;
    }

    @Override
    public BagInterface<T> intersection(BagInterface<T> anotherBag) {
        ArrayBag<T> result = new ArrayBag<>();
        T[] thisArray = this.toArray();
        
        BagInterface<T> tempBag = new ArrayBag<>();
        for(T item: anotherBag.toArray()){
            tempBag.add(item);
        }
        
        //check through the bag elements against the other array
        for(T item: thisArray){
            if(tempBag.contains(item)){
                result.add(item);
                tempBag.remove(item);
            }
        }
        return result;
    }

    @Override
    public BagInterface<T> difference(BagInterface<T> anotherBag) {
        ArrayBag<T> result = new ArrayBag<>();
        
        //add all the elements in cuurent bag to result bag
        for(T item : this.toArray()){
            result.add(item);
        }
        
        //use the remove(item) method to remove the similar occurences
        for(T item: anotherBag.toArray()){
            result.remove(item);
        }
        
        return result;
    }
    
}
