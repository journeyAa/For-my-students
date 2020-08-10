package repl.itAssignments;

public class NumOfBedrooms {

    public static void main(String[] args) {

        int numberOfBedroom = 3;
        int startingPrice = 0;
        String printS = "";

        if(numberOfBedroom == 1){
            startingPrice = 1100;
            printS = "One Bedroom Selected";
        }else if(numberOfBedroom == 2){
            startingPrice = 1850;
            printS = "Two Bedroom Selected";
        }else if(numberOfBedroom == 3){
            startingPrice = 2550;
            printS = "Three Bedroom Selected";
        }else{
            printS = "No such Bedrooms available";
        }
        System.out.println(printS);

        System.out.println("Starting Prince:" + startingPrice);





    }
}
