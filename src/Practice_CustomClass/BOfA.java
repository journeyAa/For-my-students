package Practice_CustomClass;

public class BOfA {
    public static void main(String[] args) {
        BankAccount Dawud = new BankAccount();
        Dawud.setBankAccountInfo("Saving", "Dawud", "12345678");

        Dawud.getBankAccountInfo();

        Dawud.deposit(1000);

        Dawud.checkBalance();

        Dawud.withdraw(500);

        Dawud.checkBalance();

        Dawud.withdraw(20000);

        Dawud.checkBalance();

    }
}
