package constructors;

public class Animal {
    String name;
    int age;
    int weight;

    public Animal() {
    }

    public Animal(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
