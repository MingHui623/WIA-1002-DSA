/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ming Hui
 */
public class T1Q1 {
    public static void main(String[] args) {
        //instantiate 5 telephone objects
        Telephone t1 = new Telephone("03","79676300");
        Telephone t2 = new Telephone("03","79676301");
        Telephone t3 = new Telephone("03","79676302");
        Telephone t4 = new Telephone("03","79676303");
        Telephone t5 = new Telephone("03","79676304");
    
        //store into array
        Telephone tele [] = {t1,t2,t3,t4,t5};
    
        //iterate the array to print
        for(int i = 0; i< tele.length; i++){
            System.out.println(tele[i].makeFullNumber());
        }
        
        //display number of telephone object
        System.out.println("Number of Telephone Object:" + Telephone.numberOfTelephoneObject);
    }
    
}

class Telephone{
    String areaCode;
    String number;
    static int numberOfTelephoneObject;
    
    //constructor
    Telephone(String areaCode, String number){
        this.areaCode = areaCode;
        this.number = number;
        numberOfTelephoneObject++;
    }
    
    //accessor
    public String getAreaCode(){
        return areaCode;
    }
    
    public String getNumber(){
        return number;
    }
    
    //mutator
    public void setAreaCode(String areaCode){
        this.areaCode = areaCode;
    }
    
    public void setNumber(String number){
        this.number = number;
    }
    
    //makeFullNumber method
    public String makeFullNumber(){
        return(areaCode + "-"+ number);
    }
}