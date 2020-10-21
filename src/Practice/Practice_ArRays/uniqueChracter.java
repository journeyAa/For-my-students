package Practice.Practice_ArRays;
/*Write a program that can find the unique chracters from a string*/
public class uniqueChracter {
    public static void main(String[] args) {
        // this method is only applicale for String
        String str = "aabccddfgh";  // output = bd
        String unique = "";
        for (int i = 0; i <= str.length()-1 ; i++) {
            char ch = str.charAt(i); //       a a b c c c
            int first = str.indexOf(ch); //   0 1 2 3 3 5
            int last = str.lastIndexOf(ch);// 1 1 2 4 4 4

            if(first==last){
                unique+=ch;
            }
        }
        System.out.println(unique);

























    }
}
