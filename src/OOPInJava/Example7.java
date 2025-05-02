package OOPInJava;
class InstagramUser
{
    private Long userId;
    private String fullName;
    private String username;
    private String phone;
    private String password;
    private int numberOfPosts;
    private int numberOfFollowers;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public void setNumberOfPosts(int numberOfPosts) {
        this.numberOfPosts = numberOfPosts;
    }

    public int getNumberOfFollowers() {
        return numberOfFollowers;
    }

    public void setNumberOfFollowers(int numberOfFollowers) {
        this.numberOfFollowers = numberOfFollowers;
    }

    public int getNumberOfFollowing() {
        return numberOfFollowing;
    }

    public void setNumberOfFollowing(int numberOfFollowing) {
        this.numberOfFollowing = numberOfFollowing;
    }

    private int numberOfFollowing;

    public Long getUserId(){
        return this.userId;
    }

    public void setUserId(Long userId){
        this.userId = userId;
    }

    public String getFullName(){
        return this.fullName;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }


}
public class Example7 {
    public static void main(String[] args) {
        InstagramUser user = new InstagramUser();

       user.setUserId(123456789L);
       user.setFullName("Tanvi Deshmukh");
       user.setUsername("Tanvi_Deshmukh");
       user.setPassword("ABC123");
       user.setPhone("9673336599");
       user.setNumberOfFollowers(100);
       user.setNumberOfFollowing(100);
       user.setNumberOfPosts(10);

        System.out.println(user.getUserId());
        System.out.println(user.getFullName());
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        System.out.println(user.getPhone());
        System.out.println(user.getNumberOfFollowers());
        System.out.println(user.getNumberOfFollowing());
        System.out.println(user.getNumberOfPosts());



    }
}
