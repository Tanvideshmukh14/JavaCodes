package OOPInJava;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

class Product{
    private Long productId;
    private String productName;
    private String productManufacturer;
    private Float productPrice;
    private LocalDateTime productManufacturingDate;
    private String productCategory;
    private String productDescription;

    public Product() {
        System.out.println("No argument constructor called ");
    }

    public Product(Long productId, String productName, String productManufacturer, Float productPrice, LocalDateTime productManufacturingDate, String productCategory, String productDescription) {
        this.productId = productId;
        this.productName = productName;
        this.productManufacturer = productManufacturer;
        this.productPrice = productPrice;
        this.productManufacturingDate = productManufacturingDate;
        this.productCategory = productCategory;
        this.productDescription = productDescription;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductManufacturer() {
        return productManufacturer;
    }

    public void setProductManufacturer(String productManufacturer) {
        this.productManufacturer = productManufacturer;
    }

    public Float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Float productPrice) {
        this.productPrice = productPrice;
    }

    public LocalDateTime getProductManufacturingDate() {
        return productManufacturingDate;
    }

    public void setProductManufacturingDate(LocalDateTime productManufacturingDate) {
        this.productManufacturingDate = productManufacturingDate;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productManufacturer='" + productManufacturer + '\'' +
                ", productPrice=" + productPrice +
                ", productManufacturingDate=" + productManufacturingDate +
                ", productCategory='" + productCategory + '\'' +
                ", productDescription='" + productDescription + '\'' +
                '}';
    }
}
public class Example18 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        int hour = dateTime.getHour();
        System.out.println(hour);

        int nano = dateTime.getNano();
        System.out.println(nano);

        int dayOfMonth = dateTime.getDayOfMonth();
        System.out.println(dayOfMonth);

        DayOfWeek dayOfWeek = dateTime.getDayOfWeek();
        System.out.println(dayOfWeek);

        Product appleIphone16 = null;
        appleIphone16 = new Product(1212121L,"Apple Iphone16","Apple California",99999.9f,LocalDateTime.now(),"Electronic and gadgets","You know what we build");
        System.out.println(appleIphone16.getProductId());
        System.out.println(appleIphone16.getProductName());
        System.out.println(appleIphone16.getProductPrice());

        appleIphone16.setProductPrice(899.99f);
        System.out.println(appleIphone16.getProductPrice());
    }
}
