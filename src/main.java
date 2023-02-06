import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

    private static Customer ob;
    private static Order order;

    public static void main(String[] args) throws FileNotFoundException {
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
