package Practice.Practice_ArRays;
// write a program that can return the longest string of text from a string array
public class LongestStringArray {
    public static void main(String[] args) {
        String[] str = {"parameter", "alpha", "parentingSkills", "java"};
        int max = str[0].length();
        int min = str[0].length();
        for (int i = 0; i <= str.length-1 ; i++) {
            int each = str[i].length();
            if(each>max) {
                max = each;
            }
            if(each<min){
                min = each;
            }

        }

        System.out.println(max);
        System.out.println(min);

        for (int i = 0; i <= str.length-1 ; i++) {
            if(str[i].length()==max){
                System.out.println(str[i]);
            }
            if(str[i].length()==min){
                System.out.println(str[i]);
            }

        }

        for (String each : str){
            int l = each.length();
            if(l>max){
                max = l;
            }
            if(l<min){
                min=l;
            }
        }

        for(String each: str){
            int l=each.length();
            if(l==max){
                System.out.println(str[max]);
            }
            if(l==min){
                System.out.println(str[min]);
            }
        }































    }
}
