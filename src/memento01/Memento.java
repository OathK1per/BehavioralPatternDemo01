package memento01;

public class Memento {
    private String name;
    private int age;

    public Memento() {
        super();
    }

    public Memento(Originator originator) {
        this.name = originator.getName();
        this.age = originator.getAge();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
