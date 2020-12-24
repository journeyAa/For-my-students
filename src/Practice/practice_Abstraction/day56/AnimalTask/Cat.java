package Practice.practice_Abstraction.day56.AnimalTask;

public class Cat extends Animal implements Playable {
    @Override
    public void eat() {
        System.out.println("The cat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("The cat is sleeping");
    }

    @Override
    public void play() {
        System.out.println("The cat is playing");
    }
}
