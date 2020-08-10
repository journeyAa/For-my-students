package day29_CustomMethods;

public class Uniques {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "B", "C", "F", "G"};

        for(String a: arr){ // gets each of the element
            int count = 0;

            for(String each: arr){// get the frequnecy of the element
                if(a.equals(each)){
                    count++;
                }
            }
            if(count==1){
                System.out.println(a);
            }


        }

        // this is just to see if A is unique
      /*  String a = "A";
        int count = 0;

        for(String each: arr){
            if(a.equals(each)){
                count++;
            }
        }
        if(count==1){
            System.out.println(a);
        }


       */























    }
}
