package day47_Encapsulation;
/*
create the class
instance variables
public name
public age
private userName
private password

getter & setter

add a constructor to set name and age
 */
public class Credentials {

    public static String name ;
    public int age;

    private  String userName;
    private  String password;

    public static String companyName;

    static {
        companyName = "Facebook";
    }


    public Credentials(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setUserName(String userName){
        this.userName = userName;
        this.age = age;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getUserName(){
        return userName;
    }

    public String getPassword(){
        return password;
    }










}
