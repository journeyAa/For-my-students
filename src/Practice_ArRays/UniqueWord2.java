package Practice_ArRays;

public class UniqueWord2 {
    public static void main(String[] args) {
        String[] words = {"C#", "Java", "Python", "Python", "C#"};

        for (String each: words) {
            String s = each;
            int count = 0;
            for(String b : words){ // represents each element in the array
                if(s.equals(b)){
                    count++;
                }
            }
            if(count==1){
                System.out.println(s);
            }



        }

     /* for(String each : words){ // represents each element in the array
            if(s.equals(each)){
                count++;
            }
        }
        if(count==1){
            System.out.println(s);
        }

      */


















    }
}
