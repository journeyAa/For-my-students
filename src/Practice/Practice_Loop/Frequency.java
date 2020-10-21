package Practice.Practice_Loop;

public class Frequency {

    public static void main(String[] args) {
       String str= "abaanbskfzabca";
       char ch = 'a';
       int count = 0;
       // need to compare char to everyhing single str

        for (int i = 0; i <= str.length()-1; i++) {
            char each = str.charAt(i); // a b a b c a
            if(each == ch){ // a== a , so count +1
                count+=1;
            }
            
        }
        System.out.println(count);


        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
