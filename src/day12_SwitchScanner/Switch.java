package day12_SwitchScanner;

public class Switch {
    public static void main(String[] args) {

        switch(10){

            case 5:
                System.out.println(5);
                break;

            case 8:
                System.out.println("ten");
                break;

            default:
                System.out.println("Invalid Case");

        }
        int day = 3;
        String dayName = "";

        switch(2){
            case 1:
                dayName = ("Monday");
                break;
            case 2:
                dayName = ("Tuesday");
                break;
            case 3:
                dayName = ("Wednesday");
                break;
            case 4:
                dayName = ("Thursday");
                break;
            case 5:
                dayName = ("Friday");
                break;
            case 6:
                dayName = ("Saturday");
                break;
            case 7:
                dayName = ("Sunday");
                break;
            default:
                dayName = ("Invalid");
                break;
        }
        System.out.println(dayName);

        System.out.println("=====================================================");

        String result = "";

        result = (day ==1) ?"Monday" :(day ==2) ? "Tuesday" :(day == 3) ? "Wednesday" :(day ==4) ? "Thursday" :
                (day == 5) ? "Friday" :(day ==6) ? "Saturday" :(day ==7) ? "Sunday" : "invalid";

        System.out.println(result);








    }
}
