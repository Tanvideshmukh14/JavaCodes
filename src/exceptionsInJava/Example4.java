package exceptionsInJava;

import exceptionsInJava.exceptions.InvalidAgeException;

public class Example4 {
    public static boolean isEligibleForVoting(int age) throws InvalidAgeException
    {
        if (age < 0){
            throw new InvalidAgeException("Age cannot be negative");
        }

        if (age >= 18){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        try{
          Boolean result = isEligibleForVoting(-22);
            System.out.println(result);
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
