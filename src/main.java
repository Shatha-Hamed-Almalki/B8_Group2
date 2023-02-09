import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class main {
    private static Customer ob;
    private static Order order;

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File InputFile = new File("input.txt");

        if (!InputFile.exists()) {
            throw new FileNotFoundException("The File is not exist");
        }
                
        Scanner input1 = new Scanner(InputFile);
        Scanner input2 = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<>();
        while (input1.hasNext()) {
            //save book informathion
            String BookName = input1.nextLine().trim();
            String AuthorName = input1.nextLine().trim();
            String BookType = input1.nextLine().trim();
            String BookPrice = input1.nextLine().trim();
            String NumberOFAvalibleCopies = input1.nextLine().trim();
            String BookState = input1.nextLine().trim();
            //Add info to array list
            bookList.add(new Book(BookName, AuthorName, BookType, Double.parseDouble(BookPrice), Integer.parseInt(NumberOFAvalibleCopies), BookState));

        }
        
                //
        Random random = new Random();
        int orderNum = random.nextInt(10000);
        File myFile = new File ("orders.txt");
        FileWriter ordersNum = new FileWriter(myFile, true);
        PrintWriter writeNum = new PrintWriter(ordersNum);
        
                //
        //object from customer class type
        ob = new Customer(1, "raghad hezam", "Ab12345", "rh@hotmail.com", "0534672588", "jeddah, alajwad");
        order = new Order();

        while (true) {
            System.out.println("-------------------------------------");
            System.out.println("    Welcome to used book system      ");
            System.out.println("-------------------------------------");
         
            
            System.out.println("1.  search book");
            System.out.println("2.  view order details");
            System.out.println("3.  checkout");
            System.out.println("4.  rating ");
            System.out.println("5.  Update account");
            System.out.println("0.  exite");
            System.out.print("Enter number: ");
            int menueInput = Integer.parseInt(input2.nextLine().trim());

            if (menueInput == 1) {
                System.out.print("Enter the book name to search pleese :");
                String name = input2.nextLine();
                Book userBook = findBook(bookList, name);
                if (userBook == null) {
                    System.out.println("book with name: " + name + " is not found, sorry :(");
                    continue;
                }
                System.out.println("Book information:");
                System.out.println(userBook);

                System.out.println("1.  add book to Order");
                System.out.println("2.  go back to menue");
                System.out.print("Enter number: ");
                int bookAction = Integer.parseInt(input2.nextLine().trim());

                if (userBook.getBookState().equalsIgnoreCase("Not Available")) {
                    System.out.println("sorry this book is not available!");
                    System.out.println("");
                    continue;
                }
                
                
                if (bookAction == 1) {
                    order.addBook(userBook);
                    System.out.println("book is added successfully !\n");
                }

                
                System.out.println("");
                
            }
            
            else if (menueInput == 2) {
                System.out.println("your order information ");
                for (int i = 0; i < order.getBooks().size(); i++) {
                    System.out.println(order.getBooks().get(i));
                }
                System.out.println("total price: "+order.getPriceSum());
                System.out.println("");
            }
            
            else if (menueInput == 3){
                
            System.out.println("Choose your payement method: ");
            System.out.println("1. Cash on delivery");
            System.out.println("2. Crediet Card");
            int PaymantMethod = input2.nextInt();
            if (PaymantMethod == 2){
            System.out.println("Enter your card number: ");
            Scanner input3 = new Scanner(System.in);
            String CardNum = input3.nextLine();
            if(CardNum.length() != 16){
                System.out.println("The card number is not correct, Try to pay again! ");
            System.exit(0);}
            
            
            System.out.println("Enter the name on card: ");
            String NameOnCard = input3.nextLine();
            
            System.out.println("Enter the Expire Date: ");
            int ExpiryYear = input2.nextInt();
            if(ExpiryYear < 23) {
            System.out.println("Sorry, your card is expired!");System.exit(0);}
            
            System.out.println("Enter the CVV code: ");
            String CCV = input3.nextLine();
            if (CCV.length() != 3){
                System.out.println("Wrong CVV number,Try again"); System.exit(0);}
            
            System.out.println("PAYMENT SUCCESSFUL");
                    System.out.println("Amount paid " + order.getPriceSum() + 
                            " SR");
                    //
                    System.out.println("Thank you, your order number is: "+orderNum);
                    writeNum.append(String.valueOf(orderNum)+"\n");
                    writeNum.close();
                    writeNum.flush();
                    //
                           
                    System.exit(0);}
            
            else if (PaymantMethod == 1){
            System.out.println("You choose to pay in cash on delivery.");
            
            System.out.println("The total is price: "+order.getPriceSum() + " SR");
            System.out.println("");        
                    //
                    System.out.println("Thank you, your order number is: "+orderNum);
                    writeNum.append(String.valueOf(orderNum)+"\n");
                    writeNum.close();
                    writeNum.flush();
                    //      
                    System.exit(0);
            }
            else if (PaymantMethod != 1 || PaymantMethod != 2 ){
            System.out.println("Wrong number, Try again!"); System.exit(0);   
            }
            
            
            }
            else if (menueInput == 4) {
               
               Scanner input = new Scanner(System.in);
               Scanner scan = new Scanner(myFile);
               
               System.out.println("Please enter your order number:");
               String yourOrdernum = input.next();
               boolean exist = false;
               
                while (scan.hasNextLine()){
                   
                    String read = scan.nextLine();
                    if (read.equals(yourOrdernum) ){
                       exist = true;
                       break;
                    }  
                }
               if (exist==true){
                Rating rating = new Rating();
                int stars =rating.Stars();
                String rate = rating.Rate();
                // save rating on the file
                FileWriter writer = new FileWriter("Rating.txt", true);
                try {
                    writer.append("\n\n**********Order "+yourOrdernum+" Rating:**********\n");
                    writer.append(stars+" stars out of 5\n");
                    writer.append("Customer comment: "+rate);
                    writer.close();
                }
                catch (IOException e){
                    System.out.println("An error occured");
                    e.printStackTrace();
                }  
               }
               else {
                   System.out.println("Sorry, this order number is wrong");
               } 
               System.exit(0);
            }
            

            
            else if (menueInput == 5) {
                System.out.println("please choose what you want to update: ");
                System.out.println("1.  email");
                System.out.println("2.  phone number");
                System.out.println("3.  address");
                System.out.print("Enter number: ");
                int infoUpdate = Integer.parseInt(input2.nextLine().trim());
                
                if (infoUpdate == 1){
                    System.out.println("you current email is " + ob.getCustomerEmail());
                    System.out.print("please inter your new email: ");
                    String newEmail = input2.nextLine();
                    ob.setCustomerEmail(newEmail);
                    System.out.println("you new email is " + ob.getCustomerEmail());
                }
                
                if(infoUpdate == 2){
                    System.out.println("you current phone number is " + ob.getCustomerPhone());
                    System.out.print("please inter your new number: ");
                    String newPhone = input2.nextLine();
                    ob.setCustomerPhone(newPhone);
                    System.out.println("you new phone number is " + ob.getCustomerPhone());
                }
                
                if(infoUpdate == 3){
                    System.out.println("you current address is " + ob.getCustomerAddress());
                    System.out.print("please inter your new address: ");
                    String newAddress = input2.nextLine();
                    ob.setCustomerAddress(newAddress);
                    System.out.println("you new addres is " + ob.getCustomerAddress());
                }

            }
            
            else if (menueInput == 0) {
                System.out.println("thank you for using our system, goodbye ");
                System.exit(0);
            }

        }
        

    }

    private static Book findBook(ArrayList<Book> bookList, String name) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getBookName().equalsIgnoreCase(name)) {
                return bookList.get(i);
            }
        }

        return null;
    }
}
