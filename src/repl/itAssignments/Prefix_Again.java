package repl.itAssignments;

public class Prefix_Again {
    public static void main(String[] args) {
        String str = "abXXabc";
        int n = 3;
        int count = 0;

        String prefix = str.substring(0,n);  // ab
        String rest = str.substring(n,str.length());

        System.out.println(rest.contains(prefix));













    }
}
