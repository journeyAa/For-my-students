package day38_JavaRecap;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class GradeReport {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(100,90,85,75,55,45,73,74,47,83,67,87,93,47,93,24,95,67,75,46,62));

        System.out.println(list);

        ArrayList<Integer> gradeA = new ArrayList<>(); // 90--100
        gradeA.addAll(list); // first store all the grades
        gradeA.removeIf(each -> each<90);// remove the grades that are not A
        // only retain the grade A
        System.out.println("Grade A : " + gradeA);

        ArrayList<Integer> gradeB = new ArrayList<>(); // 80--89
        gradeB.addAll(list); // first store al the grades
        gradeB.removeIf(P -> P<80 || P > 89);// remove grades that are not B
        System.out.println("Grade B : " + gradeB);

        ArrayList<Integer> gradeC = new ArrayList<>(); // 70--80
        gradeC.addAll(list);
        gradeC.removeIf(each -> each<70 || each>79);
        System.out.println("Grade C : " + gradeC);

        ArrayList<Integer> gradeD = new ArrayList<>(); // 60 --70
        gradeD.addAll(list);
        gradeD.removeIf(each -> each<60 || each>69);
        System.out.println("Grade D : " + gradeD);

        ArrayList<Integer> gradeF = new ArrayList<>();
        gradeF.addAll(list);
        gradeF.removeIf(each-> each> 59);
       /* gradeF.addAll(list);
        gradeF.removeAll(gradeA);
        gradeF.removeAll(gradeB);
        gradeF.removeAll(gradeC);
        gradeF.removeAll(gradeD);

        */
        System.out.println("Grade F : " + gradeF);

        System.out.println(gradeA.size() + " students made A");
        System.out.println(gradeB.size() + " students made B");
        System.out.println(gradeC.size() + " students made C");
        System.out.println(gradeD.size() + " students made D");
        System.out.println(gradeF.size() + " students made F");























    }
}
