package repl.itAssignments;

public class CatsAndDogs {
    public static void main(String[] args) {
        String word = "catdogdogcatcat";
        int countOfCats = 0;
        int countOfDogs = 0;

       while(word.contains("dog")){
           countOfDogs++;
           word = word.replaceFirst("dog","");
       }
        System.out.println(countOfDogs);

       while(word.contains("cat")){
           countOfCats++;
           word= word.replaceFirst("cat","");
           word = word.replaceFirst("cat", "");
       }
        System.out.println(countOfCats);

        System.out.println(countOfCats==countOfDogs);










    }
}
