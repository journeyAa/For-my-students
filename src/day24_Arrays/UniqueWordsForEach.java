package day24_Arrays;

public class UniqueWordsForEach {
    public static void main(String[] args) {

        String [] words = {"C#", "C#" , "JAVA", "Python", "C++", "C#"};
        // this is only for first lements, so we need to repeat
        String s = words[2];
        int count = 0;
        for(String b: words){ // b represents each elements in the array
            if(s.equals(b)){
                count++;
            }

        }
        if(count==1){
            System.out.println(s);
        }

        // each represents




























    }
}
