package day28_Recap;

public class FrequencyOfWord2 {
    public static void main(String[] args) {
      String str = "pythoncatdogdogpythonpython";
      //(0,3)==> (i, i+3)

        // replace python, with character #
        // assign this to the new one
        // loop==> how many #



      int count = 0; //
        for (int i = 0; i <= str.length()-6 ; i++) {
            String a = str.substring(i,i+6);
            if(a.equalsIgnoreCase("python")){
                count+=1;
            }
        }
        System.out.println(count);






















    }
}
