package Practice.Practice_NestedLoop;

import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) {
        /*
        * user name = Cyber
        * password = tek123
        *
        * */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your user name");
        String userName = scan.next();
        System.out.println("Enter your password");
        String passWord = scan.next();

        int attempt = 0;
        while(!(userName.equals("cyber")&& passWord.equals("tek123"))){
            if(attempt>2){
                System.out.println("Your account has been locked");
                System.exit(0);
            }


            System.out.println("Invalid entry, plz re-enter");
            System.out.println("Enter your user name");
            userName = scan.next();

            System.out.println("Enter your password");
            passWord = scan.next();


            attempt++;


        }

        System.out.println("Logged in");






        /*for (int i = 1; i <= 3; i++) {
            int attempt = 0;
            if(!(userName.equals("cyber") && passWord.equals("tek123"))){
                System.out.println("Invalid entry, please re-enter your user name");
                userName = scan.next();
                System.out.println("Wrong password, please re-enter your password");
                passWord= scan.next();
                attempt+=1;

                System.out.println("Your account is locked");
                System.exit(0);
            }else{
                System.out.println("logged in");
            }
        }

         */









    }
}
