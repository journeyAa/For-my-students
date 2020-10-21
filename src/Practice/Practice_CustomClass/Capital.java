package Practice.Practice_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class Capital {
    public static void main(String[] args) {

        BankAccount Beslan = new BankAccount();
        BankAccount Nadir = new BankAccount();
        BankAccount Alim = new BankAccount();
        BankAccount Ben = new BankAccount();
        BankAccount Naz = new BankAccount();

        Beslan.setBankAccountInfo("Checking", "Beslan", "4567890123");
        Nadir.setBankAccountInfo("Checking", "Ahmet", "876543212");
        Alim.setBankAccountInfo("Checking", "Viorel", "963258741");
        Ben.setBankAccountInfo("Checking", "Nurmamet", "741258963");
        Naz.setBankAccountInfo("Checking", "Waqar", "852147963");

        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.addAll(Arrays.asList(Beslan, Nadir, Alim, Ben, Naz ));

        for (BankAccount each: accounts){
            each.deposit(500);
            each.getBankAccountInfo();

        }

        accounts.get(3).deposit(2000);
        accounts.get(3).checkBalance();

        accounts.removeIf(p-> p.balance>2000);

        System.out.println("88888888888888888888888888888888888888888888888888888888888888888");

        for (BankAccount each: accounts){
            each.getBankAccountInfo();
        }






    }
}
