package constructors;

public class HumanDemo {
    public static void main(String[] args) {
        // This part new Human is using the default constructor of the class Human
        Human pesho = new Human();
        Human kiril = new Human("Kiril", 18);
        System.out.println(pesho);
        System.out.println(kiril);
    }
}
