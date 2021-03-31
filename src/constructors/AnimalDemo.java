package constructors;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.name = "Maca";
        cat.age = 3;

        Animal dog = new Animal("Balkan", 13, 2);
        Animal horse = new Animal(null, 4, 3);

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(horse);
    }
}
