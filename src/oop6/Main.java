
package oop6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Enter number of Student: ");
        int num = inp.nextInt();
        
        forloop f = new forloop(num);
        
        f.Average();
    }
}
