package day14_Recap;

/*task:
1. gender (next() )
2. age (nextInt())
3. country name  ( nextLine() )
4. zipcode  ( nextInt()  )
5. full name (nextLine() )
6. full company name ( nextLine() )*/

import java.util.Scanner;

public class nextLine_VS_rest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = input.nextInt(); // 19

        input.nextLine();  // it takes "Enter"

        System.out.println("Enter your full name:");
        String fullName = input.nextLine();// takes everything that scanner has

        System.out.println("Enter your company name: ");
        String companyName = input.nextLine();

        System.out.println(fullName + " is " +age + " years old");

        input.close();




    }
}
