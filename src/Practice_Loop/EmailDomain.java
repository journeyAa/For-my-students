package Practice_Loop;

import java.util.Scanner;

public class EmailDomain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email address");
        String email = scan.next();

        String str = email.substring(email.indexOf("@")+1, email.lastIndexOf("."));
        System.out.println(str);



















    }
}
