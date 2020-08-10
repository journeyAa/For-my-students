package repl.itAssignments;

public class GettingSandwich {
    public static void main(String[] args) {

        String str = "xxbreadyy";
        int firstBread = str.indexOf("bread");
        int lastBread = str.lastIndexOf("bread");

        if(str.contains("bread")){
            if(firstBread==lastBread){  // only one bread
                System.out.println("nothing");
            }else
            System.out.println(str.substring(firstBread+5,lastBread));

        }else{
            System.out.println("nothing");
        }










    }
}
