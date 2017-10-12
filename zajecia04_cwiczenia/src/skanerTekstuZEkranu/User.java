package skanerTekstuZEkranu;

public class User {
    private String pesel;
    private int wiek;
    private String imie;
    private String nazwisko;

    public User(){}

    public User(String pesel, int wiek, String imie, String nazwisko) {
        this.pesel = pesel;
        this.wiek = wiek;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }


    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    void info(){
        System.out.println("pesel: " + pesel + ", " + "wiek: " + wiek + " lat, " + "imię i nazwisko: " + imie + " " + nazwisko);
    }
}
