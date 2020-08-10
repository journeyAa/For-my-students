package repl.itAssignments;

public class WeekNames {

    public static void main(String[] args) {
        int day = 9;
        String dayOfWeek = "";

        if(day==1){
            dayOfWeek = "It's a Monday!";
        }else if(day==2){
            dayOfWeek = "It's a Tuesday!";
        }else if(day==3){
            dayOfWeek = "It's a Wednesday!";
        }else if(day==4){
            dayOfWeek = "It's a Thursday!";
        }else if(day==5){
            dayOfWeek = "It's a Friday!";
        }else if(day==6){
            dayOfWeek = "It's a Saturday!";
        }else if(day==7){
            dayOfWeek = "It's a Sunday!";
        }else{
            dayOfWeek = "There is no such a day!";
        }

        System.out.println(dayOfWeek);


    }
    }

