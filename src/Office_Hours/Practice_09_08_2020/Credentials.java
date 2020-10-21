package Office_Hours.Practice_09_08_2020;

public class Credentials {
    private String userName = "Cybertek";
    private String password = "Cybertek123";

    public String getUserName(){
        return userName;
    }
    // read only and a return method. return type must be the same as the private data

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }
}
