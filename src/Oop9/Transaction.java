
package Oop9;

import java.util.Scanner;

public class Transaction {
    
    public float getTotalSales(){
        Scanner inp = new Scanner(System.in);
        
        int num;
        float total = 0;
        String option;
        do{
            System.out.print("\nEnter the number of transaction: ");
            num = inp.nextInt();

            for(int x = 1; x <= num; x++){
                System.out.print("Enter amount: ");
                float amount = inp.nextFloat();

                total += amount;
            }

            System.out.println("---------------------------");
            System.out.println("TOTAL SALES");
            System.out.println("---------------------------");

            System.out.println("Number of Transaction: " +num);
            System.out.printf("Total Sales: %.2f\n", total);
            
            System.out.print("do you want to continue: ");
            option = inp.next();
        }while(option.equals("1"));
        total += total;
        
        return total;
    }    
}
