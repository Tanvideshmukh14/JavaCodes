package exceptionsInJava.assignment;

import exceptionsInJava.exceptions.InSufficientFundsException;

class BankAccount{
    private Double bankBalance;

    public BankAccount(){}

    public BankAccount(Double bankBalance) {
        this.bankBalance = bankBalance;
    }

    public Double getBankBalance() {
        return bankBalance;
    }

    public void withdrawMoney(int amount) throws InSufficientFundsException{
        if (bankBalance >= amount){
            bankBalance -= amount;
            System.out.println("Rs. " + amount + " debited successfully!");
        }else {
            throw new InSufficientFundsException("Insufficient bank balance");
        }
    }
}
public class Problem2 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(10000.00);

        try {
           bankAccount.withdrawMoney(100000);
        }catch (InSufficientFundsException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Available balance is : Rs." + bankAccount.getBankBalance());
    }
}
