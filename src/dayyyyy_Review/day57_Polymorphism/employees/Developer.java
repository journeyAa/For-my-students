package dayyyyy_Review.day57_Polymorphism.employees;

public class Developer extends Employee{
    public Developer(String name, int id, String jobTitle, double salary, char gender) {
        super(name, id, jobTitle, salary, gender);
    }

    @Override
    public void work() {
        System.out.println("Developer " + name+ " is coding");

    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
