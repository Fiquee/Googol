/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SearchEngineTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author umarazif
 */
public class SearchEngineMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int counter = 0; //to control number of index for arr
        int max = 201; //to control the max run for while loop
        int run = 0; //to control the max run for while loop
        String str; //to hold string for splitting
        String[] arr = new String[402]; //to store split string as elements
        try {
            Scanner sc = new Scanner(new FileInputStream("/Users/umarazif/Desktop/OneDrive/UM Degree AI/WIX1002 - Fundamentals of Programming/Assignment/list website (1-201).txt"));
            
            while (run < max){ //to control max run for while loop, run < max, won't run more than max times
                for (int i=0; i<1; i++){
                    str = sc.nextLine(); //store nextLine as string
                    String[] temp = str.split(","); //split string when "," encountered. Store as elements in temp array
                    for (int j=0; j<temp.length; j++){
                        arr[counter]=temp[j]; //transfer the elements to main arr for use outside of loop
                        counter++; //increase value of index for main arr to store another string from temp array
                    }
                }
                run++; //increase value of index after while loop is done running
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
        
//        for (int i=0; i<arr.length; i++){
//            System.out.println(arr[i]); //print out the main arr to check if string has been split into website and category
//        }
            
        System.out.println("Search for: ");
        String input = s.nextLine();
        for (int i = 0; i < arr.length; i++){
            if (input.equalsIgnoreCase(arr[i])){
                System.out.println(arr[i-1]);
            }
        }
    }
    
    public void Search(String input){
        int counter = 0; //to control number of index for arr
        int max = 201; //to control the max run for while loop
        int run = 0; //to control the max run for while loop
        String str; //to hold string for splitting
        String[] arr = new String[402]; //to store split string as elements
        try {
            Scanner sc = new Scanner(new FileInputStream("/Users/umarazif/Desktop/OneDrive/UM Degree AI/WIX1002 - Fundamentals of Programming/Assignment/list website (1-201).txt"));
            
            while (run < max){ //to control max run for while loop, run < max, won't run more than max times
                for (int i=0; i<1; i++){
                    str = sc.nextLine(); //store nextLine as string
                    String[] temp = str.split(","); //split string when "," encountered. Store as elements in temp array
                    for (int j=0; j<temp.length; j++){
                        arr[counter]=temp[j]; //transfer the elements to main arr for use outside of loop
                        counter++; //increase value of index for main arr to store another string from temp array
                    }
                }
                run++; //increase value of index after while loop is done running
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
        
//        for (int i=0; i<arr.length; i++){
//            System.out.println(arr[i]); //print out the main arr to check if string has been split into website and category
//        }
            
        System.out.println("Search for: ");
        for (int i = 0; i < arr.length; i++){
            if (input.equalsIgnoreCase(arr[i])){
                System.out.println(arr[i-1]);
            }
        }
    }
}
