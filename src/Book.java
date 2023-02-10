

public class Book  {
//book info
    String BookName;
    String AuthorName;
    String BookType;
    double BookPrice;
    int NumberOfAvalibleCopies;
    String BookState;

  
    
//constructor
    public Book(String BookName, String AuthorName, String BookType,  double BookPrice,int NumberOfAvalibleCopies,String BookState) {
        this.BookName = BookName;
        this.AuthorName = AuthorName;
        this.BookType = BookType;
        this.BookPrice = BookPrice;
        this.NumberOfAvalibleCopies=NumberOfAvalibleCopies; 
        this.BookState = BookState;
    }

      

//Getters and setters
        public void setBookName(String BookName) {
        this.BookName = BookName;
    }


    public void setAuthorName(String AuthorName) {
        this.AuthorName = AuthorName;
    }

    public void setBookType(String Publisher) {
        this.BookType = Publisher;
    }
    
    public void setBookPrice(double BookPrice) {
        this.BookPrice = BookPrice;
    }
   
    public void setNumberOfAvalibleCopys(int NumberOfAvalibleCopies) {
        this.NumberOfAvalibleCopies = NumberOfAvalibleCopies;
    }

    public void setBookState(String BookState) {
        this.BookState = BookState;
    }
   

    public String getBookName() {
        return BookName;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public String getBookType() {
        return BookType;
    }
    public double getBookPrice() {
        return BookPrice;
    }
    
    public int getNumberOfAvalibleCopies() {
        return NumberOfAvalibleCopies;
    }

    public String getBookState() {
        return BookState;
    }
  
   
    
    @Override
    public String toString() {
        return "The book name is: " +this.getBookName()+"\n"+ "The author name is: " + this.getAuthorName()+"\n"+  "The book type is : "
                + this.getBookType()+"\n"+"The book Price is: " + this.getBookPrice()+ "\n"+"The number of available copies: "+this.getNumberOfAvalibleCopies()+"\n"+ "The book state is: " + this.getBookState();
    }

}
