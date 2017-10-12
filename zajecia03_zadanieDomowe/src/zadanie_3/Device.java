package zadanie_3;

public class Device {

    //("QE65Q7FAM", "Samsung", "TV", 9499.99); //code, producer, type, price

    String code;
    String producer;
    String type;
    double price;


    public Device(String code, String producer, String type) {
        this.code = code;
        this.producer = producer;
        this.type = type;
    }

    public Device(String code, String producer, String type, double price) {
        this(code, producer, type);
        this.price = price;
    }

    String getInfo() {
        return "Kod: " + code + ", producent: " + producer + ", typ: " + type + ", cena: " + price;
    }

}