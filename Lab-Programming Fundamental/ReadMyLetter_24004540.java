/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ming Hui
 */
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;

public class ReadMyLetter_24004540 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new FileInputStream("D:\\DSA WIA 1002\\Lab 1\\src\\LauMingHui_24004540.txt"));
            
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            
            System.out.println("Enter part 2 below:");
            
        }
        catch(FileNotFoundException e){
            System.out.println("File is not found.");
        }
        
        try{
            Scanner s = new Scanner(System.in);
            PrintWriter pw = new PrintWriter(new FileOutputStream("D:\\DSA WIA 1002\\Lab 1\\src\\LauMingHui_24004540.txt",true));
            pw.println("\nThursday, 18 June 2021.\n");
            while(true){
                String input = s.nextLine();
                if(input.isEmpty()){
                    break;
                }
                pw.println(input);
            }
            pw.close();
        }
        catch(IOException e){
            System.out.println("Error with writing file.");
        }
    }
}
