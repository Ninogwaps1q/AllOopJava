
package oop8;


public class user {
    private int sid;
    private String userName;
    private String firstName, lastName;
    
    user(int sid, String userName, String firstName, String lastName){
        this.sid = sid;
        this.userName = userName;
    }
    
    int getId(){
        return sid;
    }
    
    String getUname(){
        return userName;
    }
    
    String getFname(){
        return firstName;
    }
    
    String getLname(){
        return lastName;
    }
    
}
