
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
 
    public static void main(String[] args) throws FileNotFoundException {
        File InputFile = new File("input.txt");

        if (!InputFile.exists()) {
            throw new FileNotFoundException("The File is not exist");
        }
        
        Scanner input1 = new Scanner(InputFile);
        Scanner input2 = new Scanner(System.in);
        ArrayList<Book> list = new ArrayList<>();
        while (input1.hasNext()){
            //save book informathion
            String BookName = input1.nextLine();
            String AuthorName = input1.nextLine();
            String BookType = input1.nextLine();
            String BookPrice = input1.nextLine();
            String NumberOFAvalibleCopies = input1.nextLine();
            String BookState = input1.nextLine();
            //Add info to array list
            list.add(new Book(BookName, AuthorName, BookType, Double.parseDouble(BookPrice), Integer.parseInt(NumberOFAvalibleCopies),BookState));

        }
        //object from customer class type
        Customer ob = new Customer();
        System.out.print("Enter the book name to search pleese :");
        String name = input2.nextLine();
        //call search method
        Book result = ob.searchForLawyer(name, list);
        if (result == null) {
            System.out.println("The book is not founded!");
        } else {
            System.out.println(result.toString());
        }

    }
}

