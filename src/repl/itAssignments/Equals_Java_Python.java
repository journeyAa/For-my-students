package repl.itAssignments;

public class Equals_Java_Python {
    public static void main(String[] args) {
        String sentence = "We study java not python";
        sentence = sentence.toLowerCase();
        int count = 0;

        while (sentence.contains("java")){
            count++;
            sentence = sentence.replaceFirst("java", "");
        }
        System.out.println(count);
        System.out.println();


        int count1 = 0;
        while (sentence.contains("python")){
            count1++;
            sentence = sentence.replaceFirst("python", "");
        }
        System.out.println(count1);

        System.out.println(count==1);






    }
}
