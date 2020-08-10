package day09_IfStatement;

public class warmupTask {
    public static void main(String[] args) {
        /*
         * 1. write a java program that accepts three numbers and returtn the max num
         * assume none of them are equal
         * 2. write a java that accepts three numbers and return the min num
         * 3. write a java that accepts 3 numers and return the medium num
         * 4. write a java that can identify if a person is eligible to nuy aclohol.

         */
        // taks 4

        boolean hasID = true;
        int age = 19;

        boolean eligible = hasID && age > 21;

        if(eligible == true) {
            System.out.println("Eligible to buy alcohol");
        }

        if(eligible == false) {
            System.out.println("You can't get alcohol");
        }

        // String result = " Eligible to buy alcohol";
        //

    }
}