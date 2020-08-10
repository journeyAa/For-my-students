package day24_Arrays;
// write a program that can find the unique chracters from a String
// ex: input  aaccdc        output: bd
public class Unique {
    public static void main(String[] args) {

        String str = "aabcc";
        //during the 1 execu, first var retursn 0, and second returns 1
        // a a b   c   c
        // 0 0  2  3   3
        // 1  1 2  4   4
        String uniques="";

        for (int i = 0; i <= str.length()-1 ; i++) {
            char ch = str.charAt(i);
            int firstOccured = str.indexOf(ch);// first returns 0// second time the index of b is 2
            int lastOccured = str.lastIndexOf(ch);// last index will be 1// and second time index of b is 2 again, meaning they're one and only

            if(firstOccured==lastOccured){
                uniques+=ch;
            }
        }
        System.out.println(uniques);




















    }
}
