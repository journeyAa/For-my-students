package day20_WhileLoops;

public class BranchingStatements {
    public static void main(String[] args) {



        char ch = 'A';
        while(ch <= 'E'){
            if(ch == 'C'){
                ch++;
               // continue;// it skips everything even the iterator
                break;

            }

            System.out.println(ch);

            ch++;
        }


        if(true){
            System.exit(0);

        }
        System.out.println("Done");






















    }
}
