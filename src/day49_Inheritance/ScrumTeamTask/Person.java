package day49_Inheritance.ScrumTeamTask;
/*
 create a class called Person
                attributes:  name, age, gender
                methods: eat, walk, sleep, setPersonInfo

 */
public class Person {
    public String name;
    public int age;
    public char gender;

    private long ssn;

    public long getSsn(){
        return ssn;
    }  // read ssn only

    public void setSsn(long ssn){
        this.ssn = ssn;
    } // set ssn only

    private void eat(){ // we don't want this to be inherited in sub classes
        System.out.println(name + " is eating");
    } // not to be inherited

    private void walk(){
        System.out.println(name + " is walking");
    }  //not to be inherited

    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    public void setInfo(String name, int age, char gender){// only sets name age and gender
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}

/*


        create a class called AppleInc:
                    1. create an array of Testers and store the testers info in your group
                    2. create an array of developers store the developers info in your group
                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team
 */
