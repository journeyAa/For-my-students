package day51_Exceptions.PetsTask;

public class Tiger extends Pet{
    public Tiger(String name, String breed, char gender, int age, String color) {
        super(name, breed, gender, age, color);
    }

    public void eat(){
        System.out.println(name+" is eating the turkey");
    }

    public void drink(){
        System.out.println(name+ " is drinking mom's milk");
    }

    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
