/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ming Hui
 */
public class C {
    public static void main(String[] args) {
        Object[] o = {new A(), new B()};
        System.out.print(o[0]); //print out "A"
        System.out.print(o[1]); //print out "B"
    }
}

class A extends B {
    public String toString() {
        return "A";
    }
}

class B {
    public String toString() {
        return "B";
    }
}

//Output: AB
