package OOPInJava;

import java.time.LocalDateTime;

class FiverrUserAccount{
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String username;
    private String password;
    private LocalDateTime createdAt;

    public FiverrUserAccount(){
        System.out.println("Creating FiverrUserAccount");
    }
    //Required Argument Constructor
    public FiverrUserAccount(
            String firstName,
            String lastName,
            String email,
            String phoneNumber,
            String username,
            String password
    ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.username = username;

    }
    public void displayFiverrUserAccount (){
        System.out.println("First Name : " + this.firstName);
        System.out.println("Last Name : " + this.lastName);
        System.out.println("Email : " + this.email);
        System.out.println("PhoneNumber : " + this.phoneNumber);
        System.out.println("Username : " + this.username);
        System.out.println("CreatedAt : " + this.createdAt);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String toString() {
        return String.format(this.firstName + "...." + this.username + "...." + this.lastName);
    }
}
public class Example9 {
    public static void main(String[] args) {
        FiverrUserAccount user = new FiverrUserAccount();
        System.out.println(user);

        user.setUsername("thisistanvideshmukh");
        System.out.println(user);
    }
}
