package exceptionsInJava.exceptions;

import java.awt.print.Book;

public class BookAlreadyReturnedException extends Exception{
    public BookAlreadyReturnedException(String message){
        super(message);
    }
}
