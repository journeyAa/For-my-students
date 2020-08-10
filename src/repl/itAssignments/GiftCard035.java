package repl.itAssignments;

import java.util.Scanner;

public class GiftCard035 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String item = input.nextLine();

        int balance = 0;
        int smartPhone = 300;
        int laptop = 400;
        int charger = 15;
        int headphones = 30;
        int pants = 50;
        int hat = 25;
        int socks = 5;
        int blanket = 60;
        int pillow = 40;
        String result = "";
        String greeting = "Thank you for your purchase!";

        if(item.equalsIgnoreCase("smartPhone") || item.equalsIgnoreCase("laptop")){
            result = "Sorry, not enough funds on your gift card!";
        }else if(item.equalsIgnoreCase("charger")){
            result = greeting + "\nYour current balance is: " + (100 - charger) + "$";
        }else if(item.equalsIgnoreCase("USB cable")) {
            result = greeting + "\nYour current balance is: " + (100 - 10) + "$";
        }else if(item.equalsIgnoreCase("headphones")){
            result = greeting + "\nYour current balance is: " + (100 - headphones) + "$";
        }else if(item.equalsIgnoreCase("pants")){
            result = greeting + "\nYour current balance is: " + (100 - pants) + "$";
        }else if(item.equalsIgnoreCase("hat")){
            result = greeting + "\nYour current balance is: " + (100 - hat) + "$";
        }else if(item.equalsIgnoreCase("socks")){
            result = greeting + "\nYour current balance is: " + (100 - socks) + "$";
        }else if(item.equalsIgnoreCase("blanket")){
            result = greeting + "\nYour current balance is: " + (100 - blanket) + "$";
        }else if(item.equalsIgnoreCase("pillow")){
            result = greeting + "\nYour current balance is: " + (100 - pillow) + "$";
        }else{
            result = "Invalid item";
        }
        System.out.println(result);

        }

    }
