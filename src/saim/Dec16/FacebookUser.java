package saim.Dec16;

import day36_ArrayList.ArrayList_Method;

import java.util.ArrayList;

public class FacebookUser extends SocialMedia{

    private String username;
    private String password;
    private String fullName;
    private int age;
    private int numberOfFriends;
    private ArrayList<Post> allPosts;

    static {
        platform = "Facebook";
    }



    public FacebookUser(String username, String password){

        if(password.contains(username)){
            System.out.println("Password contains username. Default password set: password");
            this.password = "password";
        }else{
            this.password = password;
        }

        this.username= username;
        this.url = "facebook.com/" + this.username;
        this.accountLength=0;
        allPosts = new ArrayList<>();


    }

    public FacebookUser(String username, String password, String fullName){
        this(username,password);

        boolean isValidName = true;


        for (int i = 0; i < fullName.length(); i++) {

            if(fullName.charAt(i) ==' ')
                continue;

            if (!Character.isLetter(fullName.charAt(i))){
                isValidName =false;
                break;
            }

        }

        if (isValidName){
            this.fullName=fullName;
        }else{
            System.out.println("Invalid name");
            this.fullName= "no name";
        }
    }

    public FacebookUser(String username, String password, String fullName, int age, int numberOfFriends){
        this(username, password, fullName);

        if(age<0){
            System.out.println("Invalid age");
        }else {
            this.age=age;
        }

        if(numberOfFriends < 0){
            System.out.println("Invalid num of friends");
        }else {
            this.numberOfFriends = numberOfFriends;
        }
    }

    public boolean sendFriendRequest(FacebookUser otherUser) {
        boolean valid = false;
        if (this.numberOfFriends > 5000) {
            System.out.println("You have reached the max number of friends");
        } else if (otherUser.numberOfFriends > 5000) {
            System.out.println(otherUser.fullName + " has reached the max number of friends");
        } else {
            System.out.println("Friend request send to " + otherUser.fullName);
            this.numberOfFriends++;
            otherUser.numberOfFriends++;
            valid = true;
        }
        return valid;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public int getNumberOfFriends() {
        return numberOfFriends;
    }

    @Override
    public void directMessage(String username, String message) {
        System.out.println(message + " was sent to: " + username);

    }

    @Override
    public void post(String body) {
        allPosts.add(new Post(body));

    }

    @Override
    public void notification(int time) { // time will be 24 format
        // 8 am to 5 pm
        if(time >= 8 && time <= 17){
            System.out.println("Notification");
        }else {
            System.out.println("sleep mode");
        }
    }

    public void setAllPosts(ArrayList<Post> allPosts) {
        this.allPosts = allPosts;
    }

    public ArrayList<Post> getAllPosts() {
        return allPosts;
    }

    @Override
    public String toString() {
        return "FacebookUser{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", numberOfFriends=" + numberOfFriends +
                '}';
    }
}
