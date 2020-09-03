package day48_Inheritance;

public class BofA {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount("Ali", "Nadim");
        obj.setAccountHolder(obj.firstName + " " + obj.lastName);
        obj.setAccountNumber(1234587);
        obj.setBalance(50);
        obj.availableBalance();
        obj.deposit(500);
        obj.availableBalance();
        obj.withdraw(600);
        obj.withdraw(-200);
        obj.withdraw(0);
        obj.withdraw(200);
        obj.availableBalance();
        System.out.println(obj);














    }
}
