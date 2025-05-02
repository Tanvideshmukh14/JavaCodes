package exceptionsInJava.assignment;

import exceptionsInJava.exceptions.InvalidEmployeeIDException;

public class Problem1 {
    public static  boolean isFiveCharactersLong(String id) throws InvalidEmployeeIDException {
        if (id.length() != 5){
            throw new InvalidEmployeeIDException("ID must be 5 characters long and the provided length is of " + id.length() + " characters.");
        }else {
            return true;
        }
    }
    public static void main(String[] args) {
        String id = "Tanvid";
        try {
            Boolean result = isFiveCharactersLong(id);
            System.out.println("Is the id 5 characters long : " + result);
        }catch (InvalidEmployeeIDException e){
            System.out.println(e.getMessage());
        }
    }
}
