package repl.itAssignments;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

public class SMSMessage {
    public static void main(String[] args) {
//Sender:<Mike Smith>.
// From Number:[202-123-3456].
// Message:{I love programing and problem solving}

        String sender = "<Mike Smith>";
        String phoneNumber = "[202-123-3456]";
        String messageBody = "{I love programing and problem solving}";

        String sender1 = sender.substring(sender.indexOf("<")+1,sender.indexOf(">"));
        String phone = phoneNumber.substring(phoneNumber.indexOf("[")+1,phoneNumber.indexOf("]"));
        String message = messageBody.substring(messageBody.indexOf("{")+1,messageBody.indexOf("}"));

        System.out.println("Sender: " + sender1);
        System.out.println("Phone Number: " + phone);
        System.out.println("Message body: "+ message);
















    }
}
