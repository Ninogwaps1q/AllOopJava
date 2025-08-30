
package oop5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Enter Credit Score: ");
        int credit = inp.nextInt();
        
        System.out.print("Enter Annual income: ");
        int annual = inp.nextInt();
        
        System.out.print("Enter Existing Debt: ");
        int debt  = inp.nextInt();
        
        LoanApproval loan = new LoanApproval(credit, annual, debt);
        
        loan.LoanApprovalOutput();
        
    }
}
