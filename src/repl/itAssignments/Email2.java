package repl.itAssignments;

public class Email2 {
    public static void main(String[] args) {


       String email =  "craig_federighi@apple.com";

       int underScore = email.indexOf("_");
       int at = email.indexOf("@");
       int dot = email.lastIndexOf(".");

       String firstName = email.substring(0,1).toUpperCase()+email.substring(1,underScore);
        String last= email.substring(underScore+1,underScore+2).toUpperCase();
        String remainLast = email.substring(underScore+2 , at);
        String lastName = last +remainLast;

        String Domain = email.substring(at+1,dot);
        String topDomain = email.substring(dot + 1);

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Domain: " + Domain);
        System.out.println("Top-Level Domain: " + topDomain);







    }
}
