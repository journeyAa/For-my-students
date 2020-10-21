package Practice.Practice_Encapsulation.day49;

public class Person {
    /*
    create a class called Person attributes:
     name, age, gender methods: eat, walk, sleep, setPersonInfo
     */

    public String name;
    public int age;
    public char gender;
    private long ssn;

    public long getSsn(){
        return ssn;
    }

    public void setSsn(long ssn){
        this.ssn=ssn;
    }

    public void setInfo(String name, int age, char gender){ // only sets name, age, gender
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    private void eat(){
        System.out.println(name + " is eating");
    }

    private void walk(){
        System.out.println(name + " is walking");
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }




}
