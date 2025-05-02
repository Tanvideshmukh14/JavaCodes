package OOPInJava;

class UserAccount {
    private String fullName;
    private String phoneNumber;
    private String email;
    private String dob;
    private Boolean isFemale;
    private String password;

    public String getFullName(){
        return this.fullName;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public String getPhoneNumber (){
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getIsFemale() {
        return isFemale;
    }

    public void setIsFemale( Boolean isFemale) {
       this.isFemale = isFemale;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
public class Example8 {
    public static void main(String[] args) {
     UserAccount u1 =  new UserAccount();

     u1.setDob("14-14-14");
     u1.setFullName("tanvidesh");
     u1.setEmail("fbivdklnace");
     u1.setIsFemale(true);
     u1.setPassword("dvww");
     u1.setPhoneNumber("349682733218");

        System.out.println( u1.getDob());
        System.out.println(  u1.getFullName());




    }
}
