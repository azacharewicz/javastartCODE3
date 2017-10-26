package cwiczenie2_CompareTo;

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
        if (this.cpu > k.cpu)
            return 1;
        else if (this.cpu == k.cpu) {
            if (this.memory > k.memory)
                return 1;
            else if (this.memory == k.memory)
                return this.name.compareTo(k.name);
        }
            return -1;
    }
}
