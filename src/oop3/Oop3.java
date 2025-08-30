
package oop3;

import java.util.Scanner;

public class Oop3 {

   
    public static void main(String[] args) {
       
        Scanner inp = new Scanner(System.in);
        while(true){
            System.out.print("Distance: ");
            int distance = inp.nextInt();

            System.out.print("Class: ");
            int clas = inp.nextInt();
        
            Airfare fare = new Airfare (distance, clas);
        
            fare.computr();
        }

        
    }
    
}
