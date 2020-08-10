package repl.itAssignments;

public class ThreeNums {
    public static void main(String[] args) {

        int n1 = 19;
        int n2 = 32;
        int n3 = 47;

        String biggerNum = "";

        boolean n1IsBigger = (n1 > n2 && n1 > n3) == true;
        boolean n2IsBigger = (n2 > n1 && n2 > n3) == true;
        boolean n3IsBigger = !n1IsBigger && !n2IsBigger;

        if(n1IsBigger){
            biggerNum = n1 + " is bigger";
        }else if(n2IsBigger){
            biggerNum = n2 + " is bigger";
        }else if(n3IsBigger){
            biggerNum = n3 + " is bigger";
        }

        System.out.println(biggerNum);















    }
}
