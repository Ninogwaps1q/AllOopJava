
package oop6;

import java.util.Scanner;

public class forloop {
    
    Scanner inp = new Scanner(System.in);
    
    int num;
    
    forloop(int num){
        this.num = num;
    }
    
    public void Average(){
        float grade;
        float ave;
        float total = 0;
        for(int x = 1; x <= num; x++){
            System.out.print("Enter grade for Student: ");
            grade = inp.nextFloat();
            total += grade;
        }
        ave = total / num;
        System.out.printf("\nClass Average: %.2f\n", ave);
        
    }
}
