package repl.itAssignments;

import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String output = "";

        int house = s.nextInt();
        int player = s.nextInt();

        if((house + player) > 21){
            output = "bust";
        }else if(house > player){
            output = "player loss";
        }else if(house < player){
            output = "player wins";
        }else {
            output = "its a tie";
        }
        System.out.println(output);



















    }
}
