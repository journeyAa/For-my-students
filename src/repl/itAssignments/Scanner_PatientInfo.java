package repl.itAssignments;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Scanner_PatientInfo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");

        System.out.println("Enter your first name");
        String firstName = scan.next();

        System.out.println("Enter your last name");
        String lastName = scan.next();

        scan.nextLine();

        System.out.println("Enter your email");
        String email = scan.nextLine();
        System.out.println("Enter your street");
        String street = scan.nextLine();


        System.out.println("Enter your city");
        String city = scan.nextLine();

        System.out.println("Enter your state");
        String state = scan.nextLine();

        System.out.println("Enter your zip code");
        int zipCode = scan.nextInt();

        System.out.println("Enter your work phone number");
        int workphoneNum = scan.nextInt();

        System.out.println("Enter your personal phone number");
        int personalPhoneNum = scan.nextInt();

        System.out.println("Enter your age");
        int age = scan.nextInt();

        System.out.println("Enter your height");
        double height = scan.nextDouble();

        System.out.println("Enter your weight");
        double weight = scan.nextDouble();


        boolean isMarried = true;

        String contact = "work phone number - " + workphoneNum + ", personal phone number - "
                + personalPhoneNum + ", email:" + email;
        String fullName = firstName + ", " + lastName;
        String address = street + ", " + city + ", "+ state + ", " + zipCode;

        System.out.println("Patient personal information");
        System.out.println(fullName);
        System.out.println(address);
        System.out.println(contact);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight + " pounds");
        System.out.println(isMarried);
















    }
}
