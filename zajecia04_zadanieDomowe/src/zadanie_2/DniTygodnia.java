package zadanie_2;

public class DniTygodnia {

    DzienTygodnia poniedzialek = new DzienTygodnia(1, "Poniedziałek", "dzień pracujący");
    DzienTygodnia wtorek = new DzienTygodnia(2, "Wtorek", "dzień pracujący");
    DzienTygodnia sroda = new DzienTygodnia(3, "Środa", "dzień pracujący");
    DzienTygodnia czwartek = new DzienTygodnia(4, "Czwartek", "dzień pracujący");
    DzienTygodnia piatek = new DzienTygodnia(5, "Piątek", "dzień pracujący");
    DzienTygodnia sobota = new DzienTygodnia(6, "Sobota", "dzień wolny od pracy");
    DzienTygodnia niedziela = new DzienTygodnia(7, "Niedziela", "dzień wolny od pracy");


    public void info1() {
        System.out.println("Podany numer dnia tygodnia: " + poniedzialek.getNumer());
        System.out.println(poniedzialek.getNazwa() + " to: " + poniedzialek.getPracujacyCzyNie());
    }

    public void info2() {
        System.out.println("Podany numer dnia tygodnia: " + wtorek.getNumer());
        System.out.println(wtorek.getNazwa() + " to: " + wtorek.getPracujacyCzyNie());
    }

    public void info3() {
        System.out.println("Podany numer dnia tygodnia: " + sroda.getNumer());
        System.out.println(sroda.getNazwa() + " to: " + sroda.getPracujacyCzyNie());
    }

    public void info4() {
        System.out.println("Podany numer dnia tygodnia: " + czwartek.getNumer());
        System.out.println(czwartek.getNazwa() + " to: " + czwartek.getPracujacyCzyNie());
    }

    public void info5() {
        System.out.println("Podany numer dnia tygodnia: " + piatek.getNumer());
        System.out.println(piatek.getNazwa() + " to: " + piatek.getPracujacyCzyNie());
    }

    public void info6() {
        System.out.println("Podany numer dnia tygodnia: " + sobota.getNumer());
        System.out.println(sobota.getNazwa() + " to: " + sobota.getPracujacyCzyNie());
    }

    public void info7() {
        System.out.println("Podany numer dnia tygodnia: " + niedziela.getNumer());
        System.out.println(niedziela.getNazwa() + " to: " + niedziela.getPracujacyCzyNie());
    }


    public void komunikatPoczatkowy() {
        System.out.println("Podaj numer tygodnia (od 1 do 7)");
    }

    public void komunikatPodsumowujacy(int numerDniaTygodnia) {
        switch (numerDniaTygodnia) {

            case 1:
                info1();
                break;
            case 2:
                info2();
                break;
            case 3:
                info3();
                break;
            case 4:
                info4();
                break;
            case 5:
                info5();
                break;
            case 6:
                info6();
                break;
            case 7:
                info7();
        }

    }
}
