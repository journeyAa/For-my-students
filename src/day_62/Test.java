package day_62;

public class Test {

    public static void main(String[] args) {

        Color faveCol = Color.Blue;

        Color hisCol = Color.Green;

        System.out.println(faveCol + " " + hisCol);

        Browser myBrowser = Browser.chrome;
        System.out.println(myBrowser);


        Browser browserName = Browser.chrome;

        switch (browserName) {
            case chrome:
                System.out.println();
                break;
            case edge:
                System.out.println();
                break;
            case firefox:
                System.out.println();
                break;
            default:
        }


        WeekDays faveDay = WeekDays.Friday;
        WeekDays funDay = WeekDays.Saturday;






    }
}
