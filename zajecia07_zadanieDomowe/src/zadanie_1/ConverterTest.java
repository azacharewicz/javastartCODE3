package zadanie_1;

public class ConverterTest {
    public static void main(String[] args) {
        CalendarConverter converter = new CalendarConverter();

        for (int day = 1; day <= 7; day++) {
            System.out.println(day + ". dzień tygodnia to " + converter.convertDayToString(day));

        }
    }
}
