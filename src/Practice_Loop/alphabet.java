package Practice_Loop;

public class alphabet {
    public static void main(String[] args) {

        for (char i = 'z'; i >= 'a'; i--) {
            if(i=='f'){
                continue;
            }
            System.out.print(i+ " ");
        }
        System.out.println();
        System.out.println("====================================================================");

        char ch = 'z';

        while(ch>='a'){
            if(ch=='c'|| ch=='f'||ch=='z'){
                ch--;
                continue;// skips eveything coming after it even the iterator
            }
            System.out.print(ch + " ");
            ch--;
        }

        if(true){
            System.exit(0);
        }










    }
}
