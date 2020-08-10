package Office_Hours.Practice07_14_2020;

public class Unique {
    public static void main(String[] args) {
        String str = "ABABC";
        String expectedResult = "";
        // str = "ABAABC"
        for (int j = 0; j <= str.length()-1 ; j++) {  // getting each of the character and pass it to str

            char ch = str.charAt(j); // "A"
            int count = 0;// frequeency of ch
            for (int i = 0; i <= str.length()-1 ; i++) {//helps us calculate the frequency of ch and assign
                char each = str.charAt(i);
                if (each==ch){
                    count+=1;
                }
            }
            if(count==1){
                expectedResult += ch;
            }

        }
        System.out.println(expectedResult);











    }
}
