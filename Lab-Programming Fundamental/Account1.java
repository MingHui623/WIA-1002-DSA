


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ming Hui
 */
import java.util.ArrayList;
import java.util.Date;
public class Account1 extends Account{
    private String name;
    private ArrayList<Transaction> list;
    
    Account1(String name, int id, double balance){
        super(id, balance);
        this.name = name;
        this.list = new ArrayList<>();
    }
    
    public void withdraw(double amt, String description){
        if(amt< this.getBalance()){
            super.withdraw(amt);
            this.list.add(new Transaction('W',amt,this.getBalance(),description));
        }
    }
    
    public void deposit(double amt, String description){
        super.deposit(amt);
        this.list.add(new Transaction('D',amt,this.getBalance(),description));
    }
    
    //method to display
    @Override
    public void displayStatus(){
        System.out.println("Account name: " + name);
        super.displayStatus();
        
        System.out.println("Transactions: ");
        for(Transaction ts : list){
            ts.displayTransaction();
        }
    }
    
    //main method to test
    public static void main(String[] args) {
        Account1 test = new Account1("George",1122,1000);
        test.deposit(30, "deposit 30");
        test.deposit(40, "deposit 40");
        test.deposit(50, "deposit 50");
        
        test.withdraw(5, "withdraw 5");
        test.withdraw(4, "withdraw 4");
        test.withdraw(2, "withdraw 2");
        
        test.displayStatus();
    }
}

//transaction class
class Transaction{
    //date
    private Date date;
    
    //type of transaction 'W' for withdraw, 'D' for deposit
    public char status;
    
    //amount
    private double amt;
    
    //balance
    private double balance;
    
    //description
    private String description;
    
    //constructor
    public Transaction(char status, double amt, double balance, String description){
        this.date = new Date();
        this.status = status;
        this.amt = amt;
        this.balance = balance;
        this.description = description;
    }
    
    //getter
    public Date getDate(){
        return date;
    }
    public char getStatus(){
        return status;
    }
    public double getAmount(){
        return amt;
    }
    public double getBalance(){
        return balance;
    }
    public String getDescription(){
        return description;
    }
    
    //setter
    public void setDate(Date date){
        this.date = date;
    }
    public void setStatus(char status){
        this.status = status;
    }
    public void setAmount(double amount){
        this.amt = amt; 
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setDescription(String description){
        this.description = description;
    }
    
    //display the transaction
    public void displayTransaction(){
        boolean flag = true;
        if(status == 'W'){
            flag = false;
        }
        else if (status == 'D'){
            flag = true;
        }
        System.out.println("Date: "+ date);
        System.out.println("Type: "+ (flag? "Deposit" :"Withdraw"));
        System.out.println("Amount: "+ amt);
        System.out.println("Current Balance: "+ balance);
        System.out.println("Description: "+ description);
        System.out.println("");
    }    
}