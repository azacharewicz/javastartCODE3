package zadanie_5;

public class LiczbyParzyste {
    public static void main(String[] args) {

        int i = 0;
        int suma = 0;

        for (i=0; i<101; i+=2){
            suma += i;
            System.out.print(i + " ");
        }
        System.out.println("\nSuma liczb od 0 do 100 wynosi " + suma);
    }

}
