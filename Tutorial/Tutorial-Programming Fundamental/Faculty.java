/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ming Hui
 */
class Person {
    //Person being instantiated, print out (1)
    public Person() {
        System.out.println("(1) Performs Person's tasks");
    }
}

class Employee extends Person {
    //invoke parent "Person", then run "this" statement
    public Employee() {
        this("(2) Invoke Employee's overloaded constructor");
        System.out.println("(3) Performs Employee's tasks ");
    }

    public Employee(String s) {
        System.out.println(s);
    }
}

public class Faculty extends Employee {
    //Faculty constructor is being called, will invoke parent "Employee"
    public Faculty() {
        System.out.println("(4) Performs Faculty's tasks");
    }

    //instantiate faculty (run main method first)
    public static void main(String[] args) {
        new Faculty();
    }
}

/*Output:
(1) Performs Person's tasks
(2) Invoke Employee's overloaded constructor
(3) Performs Employee's tasks 
(4) Performs Faculty's tasks
*/