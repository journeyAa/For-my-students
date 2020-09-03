package day47_Encapsulation;

public class myCredentials {
    public static void main(String[] args) {

        Credentials obj1 = new Credentials("Mike", 34);

       obj1.setUserName("Cybertek");
       obj1.setPassword("Cybertek12345");

       // System.out.println(obj1.userName);

        System.out.println(obj1.getUserName());
        System.out.println(obj1.getPassword());















    }
}
