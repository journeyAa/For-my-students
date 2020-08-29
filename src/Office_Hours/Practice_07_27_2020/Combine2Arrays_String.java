package Office_Hours.Practice_07_27_2020;

import java.util.Arrays;

public class Combine2Arrays_String {
    public static void main(String[] args) {

        String[] a1 = {"Tina", "Naz" , "Bilal" , "Ilham"};
        String[] a2 = {"Erfan", "Nabi", "Nur", "Andy", "Subi", "Melek"};

        String[] combine2arr = new String[a1.length + a2.length];

        int index = 0;

        for (int i = 0; i <= a1.length-1; i++) {
            combine2arr[index] = a1[i];
            index++;
        }

        for (int j = 0; j<= a2.length-1; j++){
            combine2arr[index] = a2[j];
            index++;
        }

        System.out.println(Arrays.toString(combine2arr));

















    }
}
