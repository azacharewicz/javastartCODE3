package zadanie_2_2;

public class Cars {

        public static void main(String[] args) {

            Car car1 = new Car("BMW", "M5", 2007, 2.6);

            //marka, model, rocznik, pojemność silnika
            //brand, model, year, capacity

            Car car2 = new Car("Opel", "Vectra", 2004, 1.8);



            System.out.println("Samochód 1:");
            System.out.printf("%s %s d% %f.1 \n", "Marka: ", car1.brand, ", model: ", car1.model,
                    ", rocznik: ", car1.year, ", pojemność: ", car1.capacity);

            System.out.println("Samochód 2:");
            System.out.printf("%s %s d% %f.1 \n", "Marka: ", car2.brand, ", model: ", car2.model,
                    ", rocznik: ", car2.year, ", pojemność: ", car2.capacity);


        }
    }


// %f - liczby zmiennoprzecinkowe
// %d - liczby całkowite
// %b - wartości logiczne
// %.1f - liczba miejsc po przecinku = 1