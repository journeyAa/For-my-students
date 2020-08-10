package day23_Arrays;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter two numbers");
            double num1 = input.nextInt();
            double num2 = input.nextInt();
            System.out.println("Enter the math operator");
            char o = input.next().charAt(0);

            switch ('0') {
                case '+':
                    System.out.println(num1 + num2);
                    break;
                case '-':
                    System.out.println(num1 - num2);
                    break;
                case '*':
                    System.out.println(num1 * num2);
                    break;
                case '/':
                    System.out.println(num1 / num2);
                    break;
                case '%':
                    System.out.println(num1 % num2);
                    break;
                default:
                    System.out.println("Invalid Operator");
            }

            System.out.println("Do you want to continue");
            String a = input.next().toLowerCase(); // yes

            while (!(a.equals("yes") || a.equals("no"))) {
                System.out.println("Invalid answer, please enter yes or no");
                System.out.println("Do you want to continue?");
                a = input.next().toLowerCase();
            }
            if (a.equals("no")) {
                break;
            }

            System.out.println("Thanks for using Cybertek' Calculator");
            System.exit(0);

        }
    }
}


