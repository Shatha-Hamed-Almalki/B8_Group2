
import java.util.Scanner;




public class Rating {
    private int stars;
    private String rate;
    Scanner input = new Scanner(System.in);
    Scanner input1 = new Scanner(System.in);
    public Rating() {
    }
  
  public int Stars() {
      
      System.out.println("Your order waits to be rated");
      System.out.println("Please rate your overall satisfaction by entering the stars between 1 and 5:");
      System.out.println("***Notes that 1 means Highly Dissatisfied and 5 means Highly Satisfied***");
      stars = input.nextInt();
      if (stars >= 1 && stars <= 5) {
        this.stars = stars;
      } else {
        throw new IllegalArgumentException("Score must be between 1 and 5");
      }
      return stars;
      
  }
  public String Rate() {
      System.out.println("Please give us any notes/ recommendations:");
      rate = input1.nextLine();
      return rate;
      
  }

    
  
 
  
    
}
