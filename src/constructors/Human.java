package constructors;

public class Human {
    String name;
    int age;
    public Human() {
    }
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
