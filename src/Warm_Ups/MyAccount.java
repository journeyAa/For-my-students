package Warm_Ups;

import java.lang.reflect.AccessibleObject;

public class MyAccount {
    public static void main(String[] args) {

        BankAccount hisAccount = new BankAccount("123456789", 0.00, "Naz",
                "Naz@gmail.com", 6478541235L);

        System.out.println(hisAccount.getAccountNumber());
        System.out.println(hisAccount.getBalance());
        System.out.println(hisAccount.email);


    /*    hisAccount.setAccountNumber("123456789");
        hisAccount.setBalance(0.00);
        hisAccount.setCustomerName("Naz");
        hisAccount.setEmail("Naz@gmail.com");
        hisAccount.setPhoneNumber(6478541235L);

     */


        hisAccount.withdraw(100);

        hisAccount.deposit(50);
        hisAccount.withdraw(100);

        hisAccount.deposit(51.0);
        hisAccount.withdraw(100.0);
















    }
}
