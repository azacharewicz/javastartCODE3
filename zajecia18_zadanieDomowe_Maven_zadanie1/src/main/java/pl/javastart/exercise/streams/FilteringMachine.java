package pl.javastart.exercise.streams;

import java.util.ArrayList;
import java.util.List;

public class FilteringMachine {

    public List<Integer> filterOutNotEvenNumbers(List<Integer> numberList) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer number : numberList) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }

    public List<Integer> filterOutLowerNumbersThan20(List<Integer> numberList) {
        List<Integer> biggerOrEqualThan20Numbers = new ArrayList<>();
        for (Integer number : numberList) {
            if (number >= 20) {
                biggerOrEqualThan20Numbers.add(number);
            }
        }
        return biggerOrEqualThan20Numbers;
    }

    public List<Book> convertToBooks(List<String> titles) {
        List<Book> bookList = new ArrayList<>();
        for (String title : titles) {
            bookList.add(new Book(title));
        }
        return bookList;
    }

    // Metoda powinna przekształcić tytuły na książki i zwrócić tylko te które rozpoczynają się od słowa "Gra"
        public List<Book> convertToBooksAndReturnOnlyStartingWithGra(List<String> titles) {
            List<Book> bookList = new ArrayList<>();
            for (String title : titles) {
                if(title.startsWith("Gra")) {
                    bookList.add(new Book(title));
                }
            }
            return bookList;
        }
}


