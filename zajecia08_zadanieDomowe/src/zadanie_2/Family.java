package zadanie_2;

public class Family {
    private String pesel_mother;
    private String pesel_father;
    private int number_of_children;

    public Family(String pesel_mother, String pesel_father, int number_of_children) {
        this.pesel_mother = pesel_mother;
        this.pesel_father = pesel_father;
        this.number_of_children = number_of_children;
    }

    public String getPesel_mother() {
        return pesel_mother;
    }

    public void setPesel_mother(String pesel_mother) {
        this.pesel_mother = pesel_mother;
    }

    public String getPesel_father() {
        return pesel_father;
    }

    public void setPesel_father(String pesel_father) {
        this.pesel_father = pesel_father;
    }

    public int getNumber_of_children() {
        return number_of_children;
    }

    public void setNumber_of_children(int number_of_children) {
        this.number_of_children = number_of_children;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family)) return false;

        Family family = (Family) o;

        if (number_of_children != family.number_of_children) return false;
        if (pesel_mother != null ? !pesel_mother.equals(family.pesel_mother) : family.pesel_mother != null)
            return false;
        return pesel_father != null ? pesel_father.equals(family.pesel_father) : family.pesel_father == null;
    }

    @Override
    public int hashCode() {
        int result = pesel_mother != null ? pesel_mother.hashCode() : 0;
        result = 31 * result + (pesel_father != null ? pesel_father.hashCode() : 0);
        result = 31 * result + number_of_children;
        return result;
    }
}

//PESELE
//92040104437
//36111410133
//82081101414
//67052819875
//82020715791