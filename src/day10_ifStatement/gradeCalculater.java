package day10_ifStatement;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class gradeCalculater {
    public static void main(String[] args) {
//
//        int score = 105;
//        String grade = "";
//
//        if (score >= 90 && score <= 100) {
//            grade = "A";
//        } else if (score >= 80 && score <= 89) {
//            grade = "B";
//        } else if (score >= 70 && score <= 79) {
//            grade = "C";
//        } else if (score >= 60 && score <= 69) {
//            grade = "D";
//        } else if (score >= 0 && score <= 59){
//            grade = "F";
//        } else{
//            grade = "Invalid Score";
//        }
//        System.out.println(grade);

        /*if grade is bigger than 90 output "excellent"


if the grade is bigger than 70 and smaller then 90 output "good"


if grade is bigger than 60 and smaller than 70 output "pass"


if grade is smaller than 60 output "fail"*/

        int grade = 49;
        String score = "";

        if(grade >= 90){
            score = "excellent";
        } else if(grade >= 70 && grade < 90){
            score = "good";
        } else if(grade >= 60 && grade < 70){
            score = "pass";
        }else if(grade < 60){
            score = "fail";
        }
        System.out.println(score);

        /*in blackjack after the player asks to keep the house 4 things may happen.

1) if the card total is bigger then 21 the player busts.
2)if the house score is bigger then the player, the player loses .
3)if the player score is equal to the house then they are a draw.
4)if the player score is bigger then the house the player wins.

player and house scores are represented by  player and house int variables.

check them using ifs to determine the result.*/

        int house = 8;
        int player = 11;
        String output = "";

        if((house + player) > 21){
            output = "bust";
            //System.out.println("bust");
        }else if(house > player){
            output = "player lose";
            //System.out.println("player lose");
        }else if(house == player){
            output = "its a tie";
            //System.out.println("its a tie");
        }else if(player > house){
            output = "player wins";
           // System.out.println("player wins");
        }
        System.out.println(output);

        int a = 342;
        int b = 234;
        int c = 89;

        String biggerNum = "";

        boolean aIsBigger = a > b && a > c == true;
        boolean bIsBigger = b > a && b > c == true;
        boolean cIsBigger = !aIsBigger & !bIsBigger == true;

        if(aIsBigger){
            biggerNum = a + " is bigger";
        }else if(bIsBigger){
            biggerNum = b + " is bigger";
        }else if(cIsBigger){
            biggerNum = c + " is bigger";
        }

        System.out.println(biggerNum);






    }
    }