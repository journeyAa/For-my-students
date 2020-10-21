package Practice.Practice_Encapsulation.day48;

public class BankAccount {
    /*
     create custom  class called BankAccount for Bank of America
            public variables:  bankName, firstName, lastName
            private variables: accountHolder, accountNumber, balance
            encapsulate all the private data
                    (DO NOT USE SHORTCUT)
            create a constructor that can initialize firstName and lastName
                    (DO NOT USE SHORTCUT)
            action:
                    deposit
                    withdraw
                    availableBalance

     */

    public static String bankName;
    public String firstName;
    public String lastName;

    private String accountHolder;
    private long accountNumber;
    private double balance;

    static {
        bankName="Bank of America";
    }

    public BankAccount(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public void setAccountHolder(String accountHolder){
        this.accountHolder=accountHolder;
    }

    public String getAccountHolder(){
        return accountHolder;
    }

    public void setAccountNumber(long accountNumber){
        this.accountNumber=accountNumber;
    }

    public long getAccountNumber(){
        return accountNumber;
    }

    public void setBalance(double balance){
        this.balance=balance;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        System.out.println("Depositing: "+ amount);
        balance+=amount;
    }

    public void withdraw(double amount){
        if(amount<= 0){
            System.out.println("Invalid withdrawing");
            return;
        }
        if(amount>balance){
            System.out.println("Not enough balance");
            return;
        }

        System.out.println("Withdrawing: "+ amount);
        balance-= amount;
    }

    public double availableBalance(){
        return getBalance();
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
