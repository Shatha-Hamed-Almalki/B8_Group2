
import java.util.Scanner;




public class Rating {
    private int stars;
    private String rate;
    Scanner input = new Scanner(System.in);
    Scanner input1 = new Scanner(System.in);
    public Rating() {
    }
  
  public int Stars() {
      
     
      stars = input.nextInt();
      if (stars >= 1 && stars <= 5) {
        this.stars = stars;
      } else {
        throw new IllegalArgumentException("Score must be between 1 and 5");
      }
      return stars;
      
  }
  public String Rate() {
     
      rate = input1.nextLine();
      return rate;
      
  }

    
  
 
  
    
}
