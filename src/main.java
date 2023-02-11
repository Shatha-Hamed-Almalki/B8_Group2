
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
        Scanner input4 = new Scanner(System.in);

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

        Random random = new Random();
        int orderNum = random.nextInt(10000);
        File myFile = new File("orders.txt");
        FileWriter ordersNum = new FileWriter(myFile, true);
        PrintWriter writeNum = new PrintWriter(ordersNum);

        //object from customer class type
        ob = new Customer(1, "raghad hezam", "Ab12345", "rh@hotmail.com", "0534672588", "jeddah, alajwad");
        order = new Order();

        while (true) {
            System.out.println("-------------------------------------");
            System.out.println("    Welcome to used book system      ");
            System.out.println("-------------------------------------");

            System.out.println("1.  search book");
            System.out.println("2.  view order details");
            System.out.println("3.  Update account");
            System.out.println("4.  checkout");
            System.out.println("5.  rating ");
            System.out.println("0.  exite");
            System.out.println("-------------------------------------");

            System.out.print("Please enter number: ");
            int menueInput = input4.nextInt();

            switch (menueInput) {
                case 1:
                    System.out.print("Enter the book name to search pleese :");
                    Customer object = new Customer();
                    String name = input2.nextLine();
                    Book userBook = object.searchForBook(bookList, name);
                    if (userBook == null) {
                        System.out.println("book with name: " + name + " is not found, sorry :(");
                        continue;
                    }
                    System.out.println("");
                    System.out.println("-------------------------------------");
                    System.out.println("         Book information:           ");
                    System.out.println("-------------------------------------");
                    System.out.println(userBook.toString());
                    System.out.println("-------------------------------------\n");
                    System.out.println("Would you like to add it to the cart?");
                    System.out.println("-------------------------------------");
                    System.out.println("1.  Add book to the cart");
                    System.out.println("2.  go back to main menue");
                    System.out.println("-------------------------------------");
                    System.out.print("Please enter number: ");
                    int bookAction = Integer.parseInt(input2.nextLine().trim());
                    if (userBook.getBookState().equalsIgnoreCase("Not Available")) {
                        System.out.println("sorry this book is not available!");
                        System.out.println("");
                        continue;
                    }
                    if (bookAction == 1) {
                        order.addBook(userBook);
                        System.out.println("\nBook is added successfully !\n");
                    }
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("-------------------------------------");
                    System.out.println("       your order information        ");
                    System.out.println("-------------------------------------");
                    for (int i = 0; i < order.getBooks().size(); i++) {
                        System.out.println(order.getBooks().get(i));
                        System.out.println("-------------------------------------");
                    }
                    System.out.println("");
                    System.out.println("total price: " + order.getPriceSum());
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("\n**please choose what you want to update:** \n");
                    System.out.println("--------------------");
                    System.out.println("1.  Email");
                    System.out.println("2.  Phone number");
                    System.out.println("3.  Address");
                    System.out.println("---------------------");
                    System.out.print("Enter number: ");
                    int infoUpdate = Integer.parseInt(input2.nextLine().trim());
                    if (infoUpdate == 1) {
                        System.out.println("\nyour current email is " + ob.getCustomerEmail() + "\n");
                        System.out.print("please enter your new email: ");
                        String newEmail = input2.nextLine();
                        ob.setCustomerEmail(newEmail);
                        System.out.println("---------------------------------------------");
                        System.out.println("The email has been updated successfully!");
                        System.out.println("your new email is " + ob.getCustomerEmail() + "\n");
                    }
                    if (infoUpdate == 2) {
                        System.out.println("#nyour current phone number is: " + ob.getCustomerPhone());
                        System.out.print("please inter your new number: ");
                        String newPhone = input2.nextLine();
                        ob.setCustomerPhone(newPhone);
                        System.out.println("---------------------------------------------");
                        System.out.println("The phone number has been updated successfully!");
                        System.out.println("you new phone number is " + ob.getCustomerPhone() + "\n");
                    }
                    if (infoUpdate == 3) {
                        System.out.println("your current address is " + ob.getCustomerAddress());
                        System.out.print("please inter your new address: ");
                        String newAddress = input2.nextLine();
                        ob.setCustomerAddress(newAddress);
                        System.out.println("---------------------------------------------");
                        System.out.println("The addres has been updated successfully!");
                        System.out.println("your new addres is " + ob.getCustomerAddress() + "\n");
                    }
                    break;
                case 4:
                    System.out.println("\n** please choose your payment method ** ");
                    System.out.println("-----------------------");
                    System.out.println("1. Cash on delivery");
                    System.out.println("2. Crediet Card");
                    System.out.println("-----------------------");
                    System.out.print("Enter number: ");
                    int PaymantMethod = input2.nextInt();

                    if (PaymantMethod == 1) {
                        System.out.println("\nYou choose to pay cash on delivery.");

                        System.out.println("The total is price: " + order.getPriceSum() + " SR");
                        System.out.println("");
                        //
                        System.out.println("             ***********                     ");
                        System.out.println("Thank you, your order number is: " + orderNum + "\n");
                        writeNum.append(String.valueOf(orderNum) + "\n");
                        writeNum.close();

                    } else if (PaymantMethod == 2) {
                        String CardNum = "";
                        Scanner input3 = new Scanner(System.in);
                        while ((CardNum.length() != 16)) {
                            System.out.print(" \nEnter your card number: " + " ** Hint Your card number must be 16 digits ** :");

                            CardNum = input3.nextLine();
                            if (CardNum.length() == 16) {
                                break;
                            }
                            System.out.println("The card number is not correct, Try  again! ");

                        }

                        System.out.print("Enter the name on card: ");
                        String NameOnCard = input3.nextLine();

                        System.out.print("Enter the Expire year: ");
                        int ExpiryYear = input2.nextInt();
                        if (ExpiryYear < 23) {
                            System.out.println("Sorry, your card is expired!");
                            break;
                        }

                        String CCV = "";
                        while (CCV.length() != 3) {
                            System.out.print("Enter the CVV code: ** Hint Your CVV must be 3 digits ** :");
                            CCV = input3.nextLine();
                            if (CCV.length() == 3) {
                                break;
                            }

                            System.out.println("Wrong CVV number,Try again");
                        }

                        System.out.println("---------------------------------------------");
                        System.out.println("            PAYMENT SUCCESSFUL!                ");
                        System.out.println("---------------------------------------------");
                        System.out.println("");
                        System.out.println("Amount paid " + order.getPriceSum() + " SR");
                        System.out.println("your order number is: " + orderNum);
                        System.out.println("\n********Thank you for using our store********");
                        System.out.println("");

                        writeNum.append(String.valueOf(orderNum) + "\n");
                        writeNum.close();
                        writeNum.flush();

                        System.exit(0);
                    } else if (PaymantMethod != 1 || PaymantMethod != 2) {
                        System.out.println("Wrong number, Try again!");
                        System.exit(0);
                    }
                    break;
                case 5:
                    Scanner input = new Scanner(System.in);
                    Scanner input5 = new Scanner(System.in);
                    Scanner scan = new Scanner(myFile);
                    System.out.print("Please enter your order number:");
                    String yourOrdernum = input.next();
                    boolean exist = false;
                    while (scan.hasNextLine()) {

                        String read = scan.nextLine();
                        if (read.equals(yourOrdernum)) {
                            exist = true;
                            break;
                        }
                    }
                    if (exist) {
                        while (true) {
                            Rating rating = new Rating();
                            System.out.println("\nYour order waits to be rated");
                            System.out.println("Please rate your overall satisfaction by entering the stars between 1 and 5:");
                            System.out.println("***Notes that 1 means Highly Unssatisfied and 5 means Highly Satisfied***");
                            rating.setStars(input.nextInt());
                            if (rating.getStars() <1 ||rating.getStars() >5 ) {
                                System.out.println("\n--------------------------------------");
                                System.out.println("please give a rating between 1 and 5");
                                System.out.println("--------------------------------------");
                                continue;
                            }
                            
                            System.out.println("Please give us any notes/ recommendations:");
                            input5.nextLine();
                            rating.setRate(input.nextLine());
                            System.out.println("\n--------------------------------------");
                            System.out.println("We have recieved your feedback!");
                            System.out.println("Thank you for using our system <3\n");
                        
                            
                            // save rating on the file
                            FileWriter writer = new FileWriter("Rating.txt", true);
                            try {
                                writer.append("\n\n**********Order " + yourOrdernum + " Rating:**********\n");
                                writer.append(rating.getStars() + " stars out of 5\n");
                                writer.append("Customer comment: " + rating.getRate());
                                writer.close();
                            } catch (IOException e) {
                                System.out.println("An error occured");
                                e.printStackTrace();
                            }
                            break;
                        }
                    } else {
                        System.out.println("Sorry, this order number is wrong");
                    }
                    break;
                case 0:
                    System.out.println("thank you for using our system, goodbye ");
                    System.exit(0);
                default:
                    break;
            }

        }

    }

}

