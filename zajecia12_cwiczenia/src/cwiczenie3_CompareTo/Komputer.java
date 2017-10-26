package cwiczenie3_CompareTo;

public class Komputer implements Comparable<Komputer> {
    String name;
    int cpu;
    int memory;

    public Komputer(String name, int cpu, int memory) {
        this.name = name;
        this.cpu = cpu; //predkosc procesora
        this.memory = memory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Komputer{" +
                "name='" + name + '\'' +
                ", cpu=" + cpu +
                ", memory=" + memory +
                '}' + "\n";
    }

    @Override
    public int compareTo(Komputer k) {
        //napisów nie możemy porównać przez znak większości tylko przez compareTo()
        if(this.name.compareTo(k.name) > 0)
            return 1;
        else if(this.name == k.name)
            return 0;
        else return -1;
    }

}
