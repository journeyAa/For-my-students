package day12_SwitchScanner;

public class switchScanner {
    public static void main(String[] args) {

        String productName = "Macbook";

        switch(productName){
            case"galaxy":
                System.out.println("Samsung");
                break;

            case"iphone":
            case"iPad":
            case"Macbook":
                System.out.println("Apple");
                break;

            }
        }







    }
