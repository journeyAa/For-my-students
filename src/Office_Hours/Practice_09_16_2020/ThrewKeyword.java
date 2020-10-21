package Office_Hours.Practice_09_16_2020;

public class ThrewKeyword {
    public static void main(String[] args) {

        String browser = "Cybertek";

        if(!browser.equals("chrome")){
            throw new RuntimeException("There is no such a browser name: "+ browser);
        }

        System.out.println("Test started on: "+browser+" browser");








    }
}
