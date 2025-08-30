
package oop4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        
        while(true){
            System.out.print("Enter Current Balance: ");
            int curBal = inp.nextInt();

        
            System.out.print("Enter Withdrawal Amount: ");
            int withAmount = inp.nextInt();

            Withdrawal w = new Withdrawal(curBal, withAmount);

            System.out.println("--------------------------------");
            System.out.println("ATAM WITHDRAWAL");
            System.out.println("--------------------------------");
            float totalOutput = w.withdrawalOutput();
            System.out.println("New balance: " +totalOutput);
            System.out.println("--------------------------------\n");
        }
    }
}
