package exceptionsInJava.assignment;

import exceptionsInJava.exceptions.InSufficientFundsException;
import exceptionsInJava.exceptions.InvalidPassportException;
import exceptionsInJava.exceptions.UnderAgeException;

class FlightBookingSystem{
    private int age;
    private String passportNumber;
    private int bankBalance;

    public FlightBookingSystem() {
    }

    public FlightBookingSystem(int age, String passportNumber, int bankBalance) {
        this.age = age;
        this.passportNumber = passportNumber;
        this.bankBalance = bankBalance;
    }

    public boolean isEligibleForBookingTicket() throws UnderAgeException, InvalidPassportException, InSufficientFundsException {
        if (age < 18){
            throw new UnderAgeException("Passenger is Underage");
        } else if (passportNumber.length() != 8) {
            throw new InvalidPassportException("Passport number is Invalid");
        } else if (bankBalance < 1500000) {
            throw new InSufficientFundsException("Insufficient bank balance");
        }
        else {
            return true;
        }
    }
}
public class Problem5 {
    public static void main(String[] args) {
        FlightBookingSystem passenger = new FlightBookingSystem(22, "1235678", 160000);

        try {
            System.out.println("Can this passenger book tickets : " + passenger.isEligibleForBookingTicket());
        }catch (UnderAgeException e){
            System.out.println(e.getMessage());
        }catch (InvalidPassportException e){
            System.out.println(e.getMessage());
        }catch (InSufficientFundsException e){
            System.out.println(e.getMessage());
        }
    }
}
