package saim.Dec16;

public class Test {
    public static void main(String[] args) {
        FacebookUser userOne = new FacebookUser("Jame", "007");

        FacebookUser userTwo = new FacebookUser("Kevin", "pass89", "Kevin Monday", 30, 50);

        System.out.println(userTwo);

        System.out.println(userOne.url);

        System.out.println(userTwo.getNumberOfFriends());

        userOne.sendFriendRequest(userTwo);
        System.out.println(userTwo.getNumberOfFriends());
















    }
}
