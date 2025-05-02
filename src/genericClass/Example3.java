package genericClass;

class Person{
    //data members
    private String name;
    private byte age;
    private String gender;
    private boolean isMarried;

    //constructor
    public Person(){}
    public Person(String name,byte age,String gender,boolean isMarried){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.isMarried = isMarried;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public byte getAge(){
        return this.age;
    }
    public void setAge(byte age){
        this.age = age;
    }
    public String getGender(){
        return this.gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public boolean getIsMarried(){
        return this.isMarried;
    }
    public void isMarried(boolean isMarried){
        this.isMarried = isMarried;
    }

    @Override
    public String toString(){
        return this.name + "..." + this.age + "..." + this.gender + "..." + this.isMarried;
    }

}
class Car{
    //data members
    private String color;
    private String brandName;
    private String type;
    private Double price;
    private boolean isDiesel;

    public Car(){}

    public Car(String color, String brandName, String type, Double price, boolean isDiesel) {
        this.color = color;
        this.brandName = brandName;
        this.type = type;
        this.price = price;
        this.isDiesel = isDiesel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public boolean getIsDiesel() {
        return isDiesel;
    }

    public void setDiesel(boolean diesel) {
        isDiesel = diesel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", brandName='" + brandName + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", isDiesel=" + isDiesel +
                '}';
    }


}
class MyGameProcesor<T> {
    private T object;

    public void printObject(T object){
        System.out.println(this.object);
    }
}
public class Example3 {
    public static void main(String[] args){
        Person p = new Person("Tanvi",(byte) 21,"Female",false);

        Car car = new Car("red","TATA","SUV",121212.12,false);

//        MyGameProcesor<Person> personMyGameProcesor = new MyGameProcesor<Person>(p);

    }
}
