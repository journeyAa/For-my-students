package Practice.Practice_Loop;

public class WhileLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("================================================");
        int num = 0;
        while(num <= 10){
            System.out.println(num);
           num++;
        }
        System.out.println("===================================================");
        int name = 0;
        while(name <= 20){
            if(name==10){
                break;
            }
            System.out.println("Alara");
            name+=1;
        }

        String str = "Aliya and Alper got married";
        String result = "";
        int c = str.length()-1;
        // index =    01234
        //charAt(4).....
        for (int i = str.length()-1; i >= 0; i--) {
            String reverse = "" + str.charAt(i);// 4,3,2,1,0
            result += reverse;
        }
        System.out.println(result);
        System.out.println("=======================================================");

        while(c>=0){
            String reverse = "" + str.charAt(c);
            result += reverse;

            c--;

        }
        System.out.print(result + " ");



















    }
}
