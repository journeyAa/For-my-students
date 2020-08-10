package repl.itAssignments;

public class Print2SameLine {
    public static void main(String[] args) {
       String[] arr = {"apple", "banana","kiwi", "grape","milk", "soda","juice", "coffee"};



        for (int j=0 ; j<=7 ; j+=2){
            System.out.print(arr[j]+" , "+arr[j+1]);
            System.out.println();
        }


        String str = "abc hi how hi";
        int count = 0;
        while(str.contains("hi")){
            count++;
            str = str.replaceFirst("hi","");

        }
        System.out.println(count);






    }
}
