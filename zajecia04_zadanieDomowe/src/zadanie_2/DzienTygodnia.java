package zadanie_2;

public class DzienTygodnia {

    private int numer;
    private String nazwa;
    private String pracujacyCzyNie;

    public DzienTygodnia(int numer, String nazwa, String pracujacyCzyNie) {
        this.numer = numer;
        this.nazwa = nazwa;
        this.pracujacyCzyNie = pracujacyCzyNie;
    }

    public int getNumer() {
        return numer;
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getPracujacyCzyNie() {
        return pracujacyCzyNie;
    }

    public void setPracujacyCzyNie(String pracujacyCzyNie) {
        this.pracujacyCzyNie = pracujacyCzyNie;
    }


}



