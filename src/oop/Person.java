package oop;

public class Person {
    public String name;
    public int age;
    public String personalNumber;
    public boolean isMale;
    public double weight;
    public Person friend;

    @Override
    public String toString() {
        return "oop.Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", personalNumber='" + personalNumber + '\'' +
                ", isMale=" + isMale +
                ", weight=" + weight +
                ", friend=" + friend +
                '}';
    }
}

