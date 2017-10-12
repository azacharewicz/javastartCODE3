public class Shop {
    public static void main(String[] args) {

//        Product product1 = new Product();
//        Product product2 = new Product();
//        Product product3 = new Product();
//        Product product4 = product3;
//
//        product1.name = "Mleko";
//        product1.producer = "Łowicz";
//        product1.price = 2.15;
//
//        product2.name = "Masło";
//        product2.producer = "Turek";
//        product2.price = 4.44;
//
//        product3.name = "Pasztet";
//        product4.producer = "Kujawski";
//        product4.price = 8.88;
//
//
//        System.out.println(product1.name + ", " + product1.producer + ", " + product1.price + " PLN");
//        System.out.println(product2.name + ", " + product2.producer + ", " + product2.price + " PLN");
//        System.out.println(product4.name + ", " + product3.producer + ", " + product3.price + " PLN");

        Product product5 = new Product("Czekolada", "Wedel", 5.55);
        Product product6 = new Product("Paluszki", "Milka", 4.56);

        System.out.println(product5.name + ", " + product5.producer + ", " + product5.price + " PLN");
        System.out.println(product6.name + ", " + product6.producer + ", " + product6.price + " PLN");

    }
}


