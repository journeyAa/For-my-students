package WarmUpTasks;

public class Array_Practice1 {
    public static void main(String[] args) {
      //  String stduents = "Alper","Aliya";
        String [] students= {"Aliya", "Muhtar", "Alper", "Nadir"};
        //                      0       1           2       3
        String name1 = students[3];
        System.out.println(students);

        String [] name = {"Mike", "Adam", "Tonny", "John", "Amy"};
        int [] scores = {85, 70, 95, 90, 100};

       /* System.out.println(name[0] + " : " + scores[0]);
        System.out.println(name[1] + " : " + scores[1]);
        System.out.println(name[2] + " : " + scores[2]);
        System.out.println(name[3] + " : " + scores[3]);

        */

        for (int i = 0; i <= 4; i++) {
            System.out.println(name[i] + " : " + scores[i]);

        }

        System.out.println("=========================================================================");

        String[] classmates = new String[5];
        classmates[0] = "Brayn";
        classmates[1] = "Hzel";
        classmates[2] = "lolly";
        classmates[3] = "Mira";
        classmates[4] = "Lala";

        for (int i = 0; i <= classmates.length-1; i++) {
            System.out.println(classmates[i]);

        }





















    }
}
