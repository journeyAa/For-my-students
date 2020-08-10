package Practice_Loop;

import java.util.Scanner;
// write a program that ask user to eneter passpword until the correct one
public class UntilCorrectPassword {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your user name");
        String userName = scan.next();
        System.out.println("Enter your password");
        String passWord = scan.next();

        int i = 1;
        while(i>0){
            if(userName.equals("Alper")&&passWord.equals("Alara0905")){
                System.out.println("logged in");
                System.exit(0);
            }
            if(!(userName.equals("Cyber")&&passWord.equals("tek123"))){
                System.out.println("re-Enter your user name ");
                userName = scan.next();
                System.out.println("Re-enter your password");
                passWord = scan.next();
            }

        }









    }
}
