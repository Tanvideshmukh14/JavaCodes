package exceptionsInJava.exceptions;

public class BookNotAvailableException extends Exception{
    public BookNotAvailableException(String message){
        System.out.println(message);
    }
}
