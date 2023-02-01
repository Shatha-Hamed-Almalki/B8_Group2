
import java.util.ArrayList;

public class Order {

//order info    
    private String OrderID;
    private String OrderDate;
    private String OrderDetiels;
    private double PriceSum;
    private ArrayList<Book> books = new ArrayList<>();

    public Order() {
    }

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
        double price = 0.0;
        for (int i = 0; i < this.books.size(); i++) {
            price += this.books.get(i).getBookPrice();
        }
        
        return price;
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

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
    
    

    public void addBook(Book b) {
        this.books.add(b);
    }

}
