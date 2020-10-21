package Practice.Practice_Constructor.previous;

public class Constructor_Intro {
    public Constructor_Intro(String arr){
        System.out.println("Hello " +arr);
        System.out.println("How are you " + arr);

    }

    public static void main(String[] args) {

        Constructor_Intro obj3 = new Constructor_Intro("Muhtar");
        Constructor_Intro obj4 = new Constructor_Intro("Dawud");
        Constructor_Intro obj5 = new Constructor_Intro("Zaliha");
    }


}
