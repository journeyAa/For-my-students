package day51_Exceptions.PetsTask;

public class House {
    public static void main(String[] args) {

        Dog dog1 = new Dog("kara", "Huski", 'M', 1, "white",300);
        System.out.println(dog1);

        Tiger tiger1 = new Tiger("Sertlan", "rare", 'F',2,"orange");

        Cat cat1 = new Cat("Winie", "British short hair", 'F',2, "black");

        tiger1.drink();
        tiger1.eat();

        System.out.println(cat1);
        System.out.println(tiger1);










    }
}
