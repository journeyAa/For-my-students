package Practice.practice_Abstraction.day56.AnimalTask;

public class Dog extends Animal implements Playable, Swimmable, Talk {
    @Override
    public void eat() {
        System.out.println("The dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("The dog is sleeping");
    }

    @Override
    public void play() {
        System.out.println("The dog is playing");
    }

    @Override
    public void swim() {
        System.out.println("The dog is swimming");
    }

    @Override
    public void talk() {
        System.out.println("The dog is talking");
    }
}
