

import java.util.ArrayList;

public class Customer {
   //Customer info
    String CustomerName = null;
    String CustomerPassword = null;
    String CustomerEmail = null;
    String CustomerPhone;
    String CustomerAddress;
    int CustomerID;
    
    
    //constructor
    public Customer(int CustomerID, String CustomerName, String CustomerPassword, String CustomerEmail, String CustomerPhone, String CustomerAddress) {
        this.CustomerID = CustomerID;
        this.CustomerName = CustomerName;
        this.CustomerPassword = CustomerPassword;
        this.CustomerEmail = CustomerEmail;
        this.CustomerPhone = CustomerPhone;
        this.CustomerAddress = CustomerAddress;
    }
    

    //Getters and setters
    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public void setCustomerPassword(String CustomerPassword) {
        this.CustomerPassword = CustomerPassword;
    }

    public void setCustomerEmail(String CustomerEmail) {
        this.CustomerEmail = CustomerEmail;
    }

    public void setCustomerPhone(String CustomerPhone) {
        this.CustomerPhone = CustomerPhone;
    }

    public void setCustomerAddress(String CustomerAddress) {
        this.CustomerAddress = CustomerAddress;
    }
    
    public void setCustomerID(int CustomerID) {
        this.CustomerID = CustomerID;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public String getCustomerPassword() {
        return CustomerPassword;
    }

    public String getCustomerEmail() {
        return CustomerEmail;
    }

    public String getCustomerPhone() {
        return CustomerPhone;
    }
    
    public String getCustomerAddress(){
        return CustomerAddress;
    }

    public int getCustomerID() {
        return CustomerID;
    }
   
   //Method to check if the name of the book that the customer searched for is in stock
    public Book searchForLawyer(String name, ArrayList<Book> list ) {
        
        for(int i=0;i<list.size();i++){
            if(name.equalsIgnoreCase(list.get(i).getBookName()))
                return list.get(i);
        }
        return null;
    }
 
}

