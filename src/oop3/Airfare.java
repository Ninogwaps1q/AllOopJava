
package oop3;


public class Airfare {
    int distance;
    int clas;
    
    public Airfare (int distance, int clas){
    this.distance = distance;
    this.clas = clas;
    }
    
    public void computr(){
        float discount;
        float total;
        
        switch(clas){
            
            case 1:
                total = distance * 250;
                if(total > 1000){
                    discount = total * 0.1f;
                    total -= discount;
                    System.out.println("Total Fare: " +total);
                }
            break;
            
            case 2:
                total = distance * 500;
                if(total > 1000){
                    discount = total * 0.1f;
                    total -= discount;
                    System.out.println("Total Fare: " +total);
                }
            break;
            
            default:
                System.out.println("Invalid input");
                
        }
    }
}
