
package oop7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        
        String[] name = new String[20];
        int[] age = new int[20];
        String[] status = new String[20];
        
        System.out.println("Enter no. of people: ");
        int num = inp.nextInt();
        
        for(int x = 0; x < num; x++){
            System.out.println("Details of person " +(x+1)+ " : ");
            System.out.print("Name: ");
            name[x] = inp.next();
            
            System.out.print("Age: ");
            age[x] = inp.nextInt();
            
            System.out.print("Status: ");
            status[x] = inp.next();
        }
        
        System.out.println("-----------------------------------------------------");
        System.out.println("no. \t| Name \t| Age \t| Status \t| Voting |");
        System.out.println("-----------------------------------------------------");
        for(int x = 0; x < num; x++){
            if(age[x] <= 18){
                System.out.println((x+1)+ "\t|" +name[x]+ "\t|" +age[x]+ "\t|" +status[x]+ "Legitable");
            }else{
                 System.out.println((x+1)+ "\t|" +name[x]+ "\t|" +age[x]+ "\t|" +status[x]+ "Non-Legitable");
            }
        }
        
        
        
    }
}
