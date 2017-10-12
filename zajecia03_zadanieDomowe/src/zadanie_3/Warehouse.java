package zadanie_3;

    public class Warehouse {
        public static void main(String[] args) {
            Device device1 = new Device("QE65Q7FAM", "Samsung", "TV", 9499.99); //code, producer, type, price
            Device device2 = new Device("P9 Lite", "Huawei", "Smatyphone"); //code, producer, type
            Device device3 = new Device("Playstation 4", "Sony", "Smatyphone", 1899.99); //code, producer, type, price

            String allDevices =
                            device1.getInfo() + "\n" +
                            device2.getInfo() + "\n" +
                            device3.getInfo();
            System.out.println(allDevices);
        }
    }

//        $ java Warehouse
//        Kod: QE65Q7FAM, producent: Samsung, typ: TV, cena: 9499.99
//        Kod: P9 Lite, producent: Huawei, typ: Smatyphone, cena: 0.0
//        Kod: Playstation 4, producent: Sony, typ: Smatyphone, cena: 1899.99