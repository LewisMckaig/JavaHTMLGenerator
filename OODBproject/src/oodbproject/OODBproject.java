/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodbproject;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * contains main and methods to run the program.
 * @author 1634854
 */
public class OODBproject {
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {  
        run();
        search();
    }
    
    /**
    * Runs database connection, creates the index page and user pages, and displays
    * any necessary info
    */
    static void run(){
        
        DataBase db = new DataBase();
        
        Index I = new Index(); 
        String index = I.html;
        System.out.println(index);
        SaveHTML.save("Index", index);
        
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter text to add to User Pages.");
        String txt = Scan.nextLine();
        
        for (int i = 0; i< DataBase.contact.size(); i++){
            String id =  DataBase.contact.get(i).getID();
            String fname = DataBase.contact.get(i).getFname();
            String lname = DataBase.contact.get(i).getLname();
            String email = DataBase.contact.get(i).getEmail();
 
        UserPage p = new UserPage(id, fname, lname,i,txt);
        String html = p.html;
        if (i == 1){
                System.out.println(html);
            }
        System.out.println(DataBase.contact.get(i).toText());
        SaveHTML.save(id, html);
        }
    }
    
    /**
     * Allows the user to search for a specific user.
     */
    static void search(){
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter Name of user:");
        String search = Scan.nextLine();
        boolean found = false;
         for (int i = 0; i< DataBase.contact.size(); i++){

             if (search.equals(DataBase.contact.get(i).getFname())){
                 System.out.println(DataBase.contact.get(i).toText());
                 found = true;
             }
             else if (search.equals(DataBase.contact.get(i).getLname())){
                 System.out.println(DataBase.contact.get(i).toText());
                 found = true;
             }
             else if (search.equals(DataBase.contact.get(i).getFname() + " " + DataBase.contact.get(i).getLname())){
                 System.out.println(DataBase.contact.get(i).toText());
                 found = true;
             }
         }
        if (found == false){
            System.out.println("User Not found!");
        }
    }
}
