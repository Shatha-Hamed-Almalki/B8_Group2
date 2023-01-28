


public class Order {
//order info
String OrderID;  
String OrderDate; 
String OrderDetiels;
float PriceSum;


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

    public float getPriceSum() {
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

    public void setPriceSum(float PriceSum) {
        this.PriceSum = PriceSum;
    }

}
