package day44_Constructor;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student("Mike", 18, 'F');
       // student1.setInfo("Mike", 18, 'F');

        Student student2 = new Student("Naz", 20, 'F');
       // student2.setInfo("Naz", 20, 'F');

        Student student3 = new Student("Bella", 30, 'F');
       // student3.setInfo("Bella", 30, 'F');

        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());











    }
}
