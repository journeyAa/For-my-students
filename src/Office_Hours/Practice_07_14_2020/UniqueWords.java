package Office_Hours.Practice_07_14_2020;

public class UniqueWords {
    public static void main(String[] args) {
        String[] words = {"C#", "C#", "Python", "Python", "Java"};

      /*  String s = words[0];// represents the first element in the Array// and this comparions takes 5 times
        int count = 0;

       */
// this is used to check if the first element is unique or not, and to check each element, I need a loop
        /*
        String s = words[0];
        int count = 0;
        for(String a: words){
            if(a.equals(s)){
                count+=1;
            }
        }
       // System.out.println(count);

        if(count==1){
            System.out.println(s);
        }

         */

        for(String b: words){//
      //      String s = words[b];
            int count = 0;
            for(String a: words){
                if(a.equals(b)){
                    count+=1;
                }
            }
            // System.out.println(count);

            if(count==1){
                System.out.println(b);
            }
        }





















    }
}
