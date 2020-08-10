package day28_Recap;
// write a program that can get the name and domain of any given email address
// ex: cybertek@gmail.com output= name:cybertek   domain: gmail
public class NameDomain {
    public static void main(String[] args) {
        String email = "cybertek@gmail.com";

        String name = email.substring(0,email.indexOf("@"));
        String domain = email.substring(email.indexOf("@") +1, email.lastIndexOf("."));

        System.out.println(name);
        System.out.println(domain);







































    }
}
