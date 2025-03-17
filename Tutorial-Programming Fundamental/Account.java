/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ming Hui
 */
interface Account{
    public int deposit(int amt);
    public boolean withdraw(int amt);
}

class BankAccount implements Account{
    private int balance;
    
    //constructor
    public BankAccount(int balance){
        this.balance = balance;
    }
    
    @Override
    public int deposit(int amt) {
        this.balance += amt;
        return balance;
    }

    @Override
    public boolean withdraw(int amt) {
        if(amt>balance){
            return false;
        }
        else{
            this.balance -= amt;
            return true;
        }
    }
    
    public static void main(String[] args) {
        boolean status = true;
        BankAccount test = new BankAccount(100);
        System.out.println("Current Balance: "+ test.balance);
        
        //deposit 50
        test.deposit(50);
        System.out.println("Current Balance: "+ test.balance);
        
        //withdraw 200
        status = test.withdraw(200);
        System.out.println("Withdraw status: "+ status);
        System.out.println("Current Balance: "+ test.balance);
        
        //withdraw 100
        status = test.withdraw(100);
        System.out.println("Withdraw status: "+ status);
        System.out.println("Current Balance: "+ test.balance);
    }
}
