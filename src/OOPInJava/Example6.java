package OOPInJava;
class Account {
    String accountHolderName;
    long accountNumber;
    String IFSCcode;
    static String brachname;

    String printDetails(){
        System.out.println(accountHolderName);
        System.out.println(accountNumber);
        System.out.println(IFSCcode);
        System.out.println(brachname);
        return "";
    }
    static void bankName(){
        System.out.println("SBI");
    }

}
public class Example6 {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.accountHolderName = "Tanvi";
        acc.accountNumber = 1235267829;
        acc.IFSCcode = "SBI3955";
        Account.brachname = "CHHAONI";

        acc.printDetails();
        Account.bankName();
    }

}
