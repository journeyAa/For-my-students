package Practice.Practice_Encapsulation.day48;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

public class BOA {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("Alper", "Bryan");

        bankAccount.withdraw(50);

        bankAccount.setAccountHolder(bankAccount.firstName + " " + bankAccount.lastName);

        bankAccount.deposit(5000);

        bankAccount.setBalance(50);












    }
}
