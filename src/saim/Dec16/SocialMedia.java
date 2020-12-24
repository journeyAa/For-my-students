package saim.Dec16;

public abstract class SocialMedia {
    /*
    Social Media
(*) Create an abstract class for Social Media that has the following features:
    - Direct messaging(String username, String message)
    - Post(String body)
    - Notifications(int time)
(*) The Social Media will also have the following fields:

    - Personal URl (String)
    - Account length (int)
    - Platform (static String)
-----------------------------------
Facebook User:
(*) Create a class for a facebook user which inherits the Social Media class and additional instance variables: username, password, full name, age, and number of friends
(*) Encapsulate all the variables.
(*) Create a constructor which will create a facebook user by taking username and password.
    - If the password contains the username then it is not a valid password and should not be saved. In this case Print “Password contained username. Default password created: ‘password’” and set the password for the user to the default value.
    - Create and assign the the user's person url by taking 'facebook.com/' and adding their username
    - Set the account length to 0
    - Set the platform for "Facebook" using static block
(*) Overload the constructor to accept username, password, and the user’s name.
    - If the name entered has any characters that are not letters from the alphabet, then the name is invalid. In this case print “invalid name” and assign the name value to be ‘no name’
(*) Overload the constructor to accept username, password, the user’s name, age and number of friends.
    - Only store the age and number of friends into the variables if they are valid numbers ( No negative numbers ). If they are invalid print “Invalid (age/number of friends) and keep the values as the default of 0.
(*) Implement all methods coming from Social Media class
    (*) Direct messaging(String username, String message)
        - print = %message sent to %username
    (*) Post(String body)
        - Should be added to the the ArrayList of Posts of the user
    (*) Notifications(int time)
        - Checks the current time. If the time is between 8 am - 5 pm print "Notification", otherwise print "Sleep mode"
(*) Override the toString method to print all of the information of a Facebook user when they are searched.
(*) Create a sendFriendRequest method that will accept a Facebook user object and send them a friend request. The method should return a boolean of if the friend request was sent (true) or if the friend request was not sent (false).
    - If your friend list is at the 5000 limit then do not send the request and print “You have reached the limit of friends.”
    - If the user you are trying to send the request to has already hit the limit then print “theUsersName cannot accept any more friend request.
    - If both you and the user are under the limit print “Friend request sent to theUsersName” and increase your number of friends by one.
-----------------------------------
Post class
(*) Create a class that has the following instance vaible:
    String body, and String dateTime
    - Encapsulate body. Provide a public getter and setter(update)
    - Make dateTime final and read only (getter)
(*) Create a constructor that will take the body and initialize store it to the instance variable. Upon creation of the post the current time should be taken and stored into the dateTime variable
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM dd, yyyy | hh:mm a");
        System.out.println(dt.format(format));

(*) Implement post method to create a post by the given body and store it to the ArrayList of Posts of the user
-----------------------------------
Groups interface
(*) Create an interface Groups with the following actions:
    - joinGroup(String group);
    - leaveGroup(String group);
(*) Add a variable in FacebookUser to count the number of groups they are in and implement the 2 methods from Groups interface.
    - joinGroup prints "%usersName as join %group" and increment the total number of groups
    - leaveGroup prints "%usersName as left %group" and decrement the total number of groups
----------------------------------
     */

    protected String url;
    protected int accountLength;
    protected static String platform;



    public abstract void directMessage(String username, String message);

    public abstract void post(String body);

    public abstract void notification(int time);











}
