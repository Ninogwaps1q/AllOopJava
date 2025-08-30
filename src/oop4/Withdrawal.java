
package oop4;


public class Withdrawal {
    int balance = 0;
    int amount = 0;
    
    Withdrawal(int balance, int amount){
        this.balance = balance;
        this.amount = amount;
    }
    
    public float withdrawalOutput(){
        float newBal;
        
        System.out.println("Current Balance: " +(float)balance);
        System.out.println("Withdrawal Amount: " +(float)amount);
        if(balance > amount){
            newBal = balance -= amount;
            System.out.println("Withdrawal Successful.");
            return newBal;
        }else{
            newBal = balance -= amount;
            System.out.println("insufficent , Transation failed");
        }
        return 0;
    }
}
