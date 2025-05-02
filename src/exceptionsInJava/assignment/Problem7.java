package exceptionsInJava.assignment;

import exceptionsInJava.exceptions.BookAlreadyReturnedException;
import exceptionsInJava.exceptions.BookNotAvailableException;
import exceptionsInJava.exceptions.InvalidBookException;

import java.util.HashMap;
import java.util.Scanner;

public class Problem7 {
    public static void Borrow(HashMap Books,String BookName,int BookNo,Boolean bookAvailable) throws BookNotAvailableException, InvalidBookException {

        if (Books.containsValue(BookName) && bookAvailable) {
            System.out.println("Success! You have borrowed '" + BookName + "'.");
            bookAvailable = false;
        } else if (!Books.containsValue(BookName)) {
            throw new InvalidBookException("Book doesn't exist");
        } else {
            throw new BookNotAvailableException("'" + BookName + "' is currently unavailable.");
        }

    }
    public static void Return(HashMap Books,String BookName,int BookNo,Boolean bookAvailable) throws BookAlreadyReturnedException {
        if (Books.containsValue(BookNo) && bookAvailable){
            throw new BookAlreadyReturnedException("Book is already returned");

        }else if (Books.containsValue(BookNo) && !bookAvailable){
            bookAvailable = true;
            System.out.println("Success! You have returned '" + BookName + "'.");
        }
    }
    public static void main(String[] args) {

        int BookNo;
        boolean exit = false;
        int exitProgramOption ;
        Boolean bookAvailable = true;
        HashMap<Integer,String> Books = new HashMap<>(4);

        Books.put(1,"JavaProgramming");
        Books.put(2,"DataStructures");
        Books.put(3,"AIBasics");
        Books.put(4,"PythonCrashCourse");

        System.out.println(Books);

        Scanner Input = new Scanner(System.in);
        while(!exit) {
            System.out.println("Select one option");
            System.out.println("1.Borrow books");
            System.out.println("2.Return books");
            int option = Input.nextInt();

            System.out.println("Enter the book name");
            String BookName = Input.next();

            System.out.println("Enter book number");
            BookNo = Input.nextInt();

            try {
                switch (option) {
                    case 1:
                        Borrow(Books, BookName, BookNo, bookAvailable);
                        break;
                    case 2:
                        Return(Books, BookName, BookNo,bookAvailable);
                        break;
                    default:
                        System.out.println("Invalid option");
                }
            } catch (BookNotAvailableException e) {
                System.out.println(e.getMessage());
            } catch (BookAlreadyReturnedException e) {
                System.out.println(e.getMessage());
            } catch (InvalidBookException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("Choose 1.exit or 2.continue");
             exitProgramOption = Input.nextInt();
             if (exitProgramOption == 1){
                 exit = true;
                 
             }
        }

    }
}
