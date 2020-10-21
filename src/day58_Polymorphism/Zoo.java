package day58_Polymorphism;

public class Zoo {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Charlie", 2, 'F');
        dog1.sleep();
        dog1.eat();
        dog1.bark();

        System.out.println("===================================================================");
        Animal animal1 = new Dog("Charlie", 2, 'F');
        animal1.sleep();
        animal1.eat();
        //animal1.bark();

        Cat cat1 = new Cat("Simba", 1, 'M');














    }
}
