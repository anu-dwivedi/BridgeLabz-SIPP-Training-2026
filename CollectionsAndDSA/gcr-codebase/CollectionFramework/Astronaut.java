public class Astronaut {
    String id, name, specialization;

    public Astronaut(String id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    public String toString() {
        return id + " " + name + " " + specialization;
    }
}