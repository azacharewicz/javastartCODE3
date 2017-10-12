package product;

public class Product {
    String name;
    String producer;
    double price;
    int category;


    public Product(String name, String producer, double price, int category) {
        this(name, producer, category);
        this.price = price;
    }

    public Product(String name, String producer, int category) {
        this.name = name;
        this.producer = producer;
        this.category = category;
    }
}



