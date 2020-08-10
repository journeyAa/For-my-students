package repl.itAssignments;

public class Methods_PrintUniqueWords {
    public static void main(String[] args) {
       /*
        Complete a void method printUniqueWords() that will print only unique words
        from an array of strings. Every single unique word should be printed from the new line.
        Example:
input:[java, code, python, code, rust, code, rust]
output:
java
python
        */
        String[] w = {"java", "code", "python", "code", "rust", "code", "rust"};
        int count = 0;
        String word1 = w[0];

        for (String every : w){
            for (String each : w){
                if(each.equals(word1)){
                    count++;
                }

            }
            if(count==1){
                System.out.println(word1);
            }


        }




    }
    public static void printUniqueWords(String[] words){



    }
}
