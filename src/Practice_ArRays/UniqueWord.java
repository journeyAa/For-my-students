package Practice_ArRays;
// write a program that can find the unique word from an array of string
public class  UniqueWord {
    public static void main(String[] args) {
        String[] words = {"C#", "Java", "Python", "Python", "C#"};

        for (int j = 0; j <= words.length-1 ; j++) { // all the index
            String s1 =  words[j]; // C#"
            int count = 0; // to assing the frequency of s
            for (int i = 0; i <= words.length-1 ; i++) {
                String each = words[i];  // C#" , Java
                if (s1.equals(each)) {
                    count++;
                }

            }
            if(count==1){
                System.out.println(s1);
            }

        }




      // this loop is to check if the first index is unique by comparing with all other index
      /* String s1 =  words[1]; // C#"
       int count = 0; // to assing the frequency of s
        for (int i = 0; i <= words.length-1 ; i++) {
            String each = words[i];  // C#" , Java
            if (s1.equals(each)) {
                count++;
            }

        }
        if(count==1){
            System.out.println(s1);
        }

       */


















    }
}
