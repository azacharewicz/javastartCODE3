package cwiczenie_4_kolejka;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Kolejka {
    public static void main(String[] args) {

        Queue<Person> pacjenci = new LinkedList<>();
        pacjenci.offer(new Person("Anna", "Kowalska", "12345678901"));
        pacjenci.offer(new Person("Jagoda", "Nowak", "23456789012"));
        pacjenci.offer(new Person("Malwina", "Wójcik", "34567890123"));

        while (pacjenci.peek() != null){
            Person peek = pacjenci.peek();
            System.out.println(peek.toString() + " proszony do gabinetu");
            Person pool = pacjenci.poll();
            System.out.println(pool.toString() + " obsłużony");

        }
    }
}
