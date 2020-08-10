package day12_SwitchScanner;

public class biggerNum {
    public static void main(String[] args) {
        // find the biggest number among 3 numbers

        double n1 = 383;
        double n2 = 3834;
        double n3 = 26346;

        boolean n1Biggest = n1 > n2 && n1 > n3;
        boolean n2Biggest = n1Biggest == false && n2 > n3;
                           // n2 > n1 && n2 > n3;
        boolean n3Biggest = !n1Biggest && !n2Biggest;
                     //    n1Biggest == false && n2Biggest == false;
        String result = "";

        if(n1Biggest){
            result = "n1 is biggest";
        }else if(n2Biggest){
            result = "n2 is biggest";
        }else{
            result = "n3 is the biggest";
        }

        System.out.println(result);

        String result1 = (n1Biggest) ? "n1 is biggest" : (n2Biggest) ? "n2 is biggest" : "n3 is biggest";

        System.out.println(result1);






    }
}
