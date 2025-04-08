/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ming Hui
 */

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Delimiter {
    public static void main(String[] args) {
        //curate("D:\\DSA WIA 1002\\Lab 1\\src\\text1.txt",",");
        //curate("D:\\DSA WIA 1002\\Lab 1\\src\\text2.txt",",");
        //curate("D:\\DSA WIA 1002\\Lab 1\\src\\text3.txt",";");
        //curate("D:\\DSA WIA 1002\\Lab 1\\src\\text4.txt","[0-9]");
    }
    
    //method to curate the text file
    public static void curate(String filename,String delimiter){
        int count = 0;
        try{
            Scanner sc = new Scanner(new FileInputStream(filename));
            while(sc.hasNextLine()){
                String temp = sc.nextLine();
                String [] curated = temp.split(delimiter);
                
                //display the curated line
                for(String s : curated){
                    System.out.print(s);
                    
                    //keep track of the characters
                    count += s.length();
                }
                System.out.println("");
                
                
            }
        }catch(FileNotFoundException e){
            System.out.println("File is not Found.");
        }
        System.out.println("Number of characters: "+ count);
    }
}
