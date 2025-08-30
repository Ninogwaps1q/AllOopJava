
package oop5;


public class LoanApproval {
    int credit;
    int annual;
    int debt;
    
    LoanApproval(int credit, int annual, int debt){
        this.credit = credit;
        this.annual = annual;
        this.debt = debt;
    }
    
    public void LoanApprovalOutput(){
       if(credit >= 700){
           if(annual >= 300000){
               if(debt <= annual * 0.5f){
                   System.out.println("Loan status: Approve");
               }else{
                   System.out.println("Loan status: Rejected (Existing debt too high)");
               }
           }else{
               System.out.println("Loan status: Rejected (Annual income too low)");
           }
       }else{
           System.out.println("Laon status: Rejected (Credit too low)");
       }
    }
}
