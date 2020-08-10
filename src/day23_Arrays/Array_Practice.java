package day23_Arrays;

public class Array_Practice {
    public static void main(String[] args) {

        String[] myFriends = {"Gulzar", "Shapket", "Mihri", "Nunu"};
        // index number         0          1          2       3

        String str1 = myFriends[1];
        System.out.println(myFriends[2]);

        String[] names = {"Mike", "Adam", "ton", "Jon", "Amy"};
        int[] scores  = {85,70, 95, 90, 100};


        System.out.println(names[0] + " has got " + scores[0]);
        System.out.println(names[1] + " has got " + scores[1]);

        System.out.println("====================================================================");

        for (int i = 0; i <=4; i++) {
            System.out.println(names[i] + " has got " + scores[i]);
        }

        System.out.println("=====================================================================");

        String[] classmates = new String[5];
        classmates[0] = "Nuri";
        classmates[4]= "Nadir";
        classmates[2] = "Mehdi";
        classmates[3] = "Ema";
        classmates[1]= "Salim";

        for (int i = 0; i <= 4; i++) {
            System.out.println(classmates[i]);

        }



























    }
}
