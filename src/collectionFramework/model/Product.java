package collectionFramework.model;

public class Product {
    //Data members
    private Long id;
    private String name;
    private String description;

    //Constructor
    public Product(){
        System.out.println("Product Constructor called ");
    }
    public Product(Long id ,String name,String description){
        this.id = id;
        this.name = name;
        this.description = description;
    }
    public void setId(Long id){
        this.id = id;
    }
    public long getId(){
        return this.id;
    }
    public void setName(){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setDescription(){
        this.description = description;
    }
    public String getDescription(){
        return this.description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
