


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ming Hui
 */
import java.util.Date;
public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;
    
    //no argument constructor
    public Account(){};
    
    //constructor with id and balance
    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }
    
    //accessor 
    public int getId(){
        return id;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public double getInterestRate(){
        return annualInterestRate;
    }
    
    //mutator
    public void setId(int id){
        this.id = id;
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    public void setInterestRate(double rate){
        this.annualInterestRate = rate;
    }
    
    //accessor for date Created
    public Date getDate(){
        return dateCreated;
    }
    
    //monthly interest rate
    public double getMonthlyInterestRate(){
        return annualInterestRate / 12.0 / 100;
    }
    
    //monthly interest
    public double getMonthlyInterest(){
        return getMonthlyInterestRate() * balance;
    }
    
    //method to withdraw
    public void withdraw(double amt){
        if(amt < balance){
            balance -= amt;
        }
    }
    
    //method to deposit
    public void deposit(double amt){
        balance += amt;
    }
    
    //method to display
    public void displayStatus(){
        System.out.println("Account ID: "+ id);
        System.out.println("Current Balance: "+ balance);
        System.out.println("Monthly Interest: "+ getMonthlyInterest());
        System.out.println("Date when account created: "+ getDate());
        System.out.println("");
    }
    //main method to test
    public static void main(String[] args) {
        Account test = new Account(1122,20000);
        test.setInterestRate(4.5);
        test.withdraw(2500);
        test.deposit(3000);
        test.displayStatus();
    }
}
