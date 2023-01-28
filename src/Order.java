


public class Order {

//order info    
   String OrderID;  
   String OrderDate; 
   String OrderDetiels;
   double PriceSum;

    
//constructor
   public Order(String OrderID, String OrderDate, String OrderDetiels, double PriceSum) {
        this.OrderID = OrderID;
        this.OrderDate = OrderDate;
        this.OrderDetiels = OrderDetiels;
        this.PriceSum = PriceSum;
    }


//Getters and setters
    public String getOrderID() {
        return OrderID;
    }

    public String getOrderDate() {
        return OrderDate;
    }

    public String getOrderDetiels() {
        return OrderDetiels;
    }

    public double getPriceSum() {
        return PriceSum;
    }

    public void setOrderID(String OrderID) {
        this.OrderID = OrderID;
    }

    public void setOrderDate(String OrderDate) {
        this.OrderDate = OrderDate;
    }

    public void setOrderDetiels(String OrderDetiels) {
        this.OrderDetiels = OrderDetiels;
    }

    public void setPriceSum(double PriceSum) {
        this.PriceSum = PriceSum;
    }

}
