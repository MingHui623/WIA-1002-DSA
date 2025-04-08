/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ming Hui
 */
public class MyGeneric <T> {
    private T e;
    
    //constructor (no-args)
    public MyGeneric(){}
    
    //constructor (one generic param)
    public MyGeneric(T e){
        this.e = e;
    }
    
    //setter
    public void setType(T e){
        this.e = e;
    }
    
    //getter
    public T getType(){
        return e;
    }
}

class TestProgram{
    public static void main(String[] args) {
        MyGeneric <String> strObj = new MyGeneric<> ();
        MyGeneric <Integer> intObj = new MyGeneric<> ();
        
        strObj.setType("Hello");
        intObj.setType(5);
        
        System.out.println(strObj.getType());
        System.out.println(intObj.getType());
    }
}