package Practice_ArRays;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/*
write a program that return the frequency of a word from a string
ex:         str = "javaJavaJAVA"
            word = "java"
            output = 3;
 */
public class FrequencyOfWord_fromString {
    public static void main(String[] args) {
        String str = "javaJavaJAVA";
        str = str.toLowerCase();
        String word = "java";
        int count = 0;

        for (int i = 0; i <= str.length()-1 ; i++) {
            if(str.contains(word)){
               str = str.replaceFirst(word, " ");
                count++;
            }

        }
        System.out.println(count);

        System.out.println("===========================================================");

        for (int i = 0; i <=str.length()-4 ; i++) { // 0 1 3 4 5 6 7 8 9 10 11
          //  str = str.substring(0,4);
            String  s = str.substring(i,i+4);
            if (s.equals(word)) {
                count++;
            }

        }
        System.out.println(count);


        String str1 = "catcatdogdogcatanddogandcatdogdogdog";
        int countDog = 0;
        int countCat = 0;

        for (int i = 0; i <= str1.length()-3; i++) {
            if(str1.substring(i,i+3).equals("cat")){
                countCat++;
            }
            if(str1.substring(i,i+3).equals("dog")){
                countDog++;
            }
        }
        System.out.println(countCat);
        System.out.println(countCat);


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string of words");
        String strUser = scan.nextLine();
        System.out.println("Enter the word you wish to see how many times it occured");
        String wordUser = scan.next();
        int l = wordUser.length();

        int countUser = 0;
        for (int j = 0; j <= strUser.length()-l; j++) {
            if(strUser.substring(j, j+l).equals(wordUser)){
                countUser++;

            }

        }
        System.out.println(countUser);



    }
}
