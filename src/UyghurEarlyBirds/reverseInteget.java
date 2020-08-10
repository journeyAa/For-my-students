package UyghurEarlyBirds;

public class reverseInteget {
    public static void main(String[] args) {
       int num = 2223454;
       int lastDigit = num%10;// always get the last digit
        int firstDigit;

/*
* 123/10=10
* 12/10=1
*
*
*
* */
        while(num>1){
            num/=10;
        }
        System.out.println(num);

















    }
}
