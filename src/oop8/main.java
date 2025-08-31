
package oop8;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
     
      Scanner inp = new Scanner(System.in);
        
        int id = 101;
      
        System.out.print("Create Usename: ");
        String uName = inp.next();
        
        System.out.print("Enter your fistname: ");
        String fName = inp.next();
        
        System.out.print("Enter your Lastname: ");
        String lName = inp.next();
        
        user u = new user(id, uName, fName, lName);
        id = u.getId();
        
        System.out.println(id+ "| " +uName+ "| " +fName+ "| " +lName+"|");
        
    }
}
