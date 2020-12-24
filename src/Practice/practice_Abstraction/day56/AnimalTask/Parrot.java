package Practice.practice_Abstraction.day56.AnimalTask;

public class Parrot extends Animal implements Playable, Flyable, Talk {
    @Override
    public void eat() {
        System.out.println("Parrot is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Parrot is sleeping");
    }

    @Override
    public void play() {
        System.out.println("Parrot is playing");
    }

    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }

    @Override
    public void talk() {

    }
}
