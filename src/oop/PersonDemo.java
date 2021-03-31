package oop;

public class PersonDemo {
    public static void main(String[] args) {
        Person ivan = new Person();
        ivan.name = "Ivan";
        ivan.age = 35;
        ivan.personalNumber = "88072535";
        ivan.weight = 75.5;


        Person maria= new Person();
        maria.name = "Maria";
        maria.age = 19;
        maria.personalNumber = "88072535";
        maria.weight = 55.5;
        maria.friend = ivan;

        System.out.println(ivan);
        System.out.println(maria);
    }
}
