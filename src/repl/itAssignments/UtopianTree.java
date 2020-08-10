package repl.itAssignments;

public class UtopianTree {
    public static void main(String[] args) {

        /*year 1 - growth 1 cm
tree size: 1cm
year 2 - growth 1 cm
tree size: 2cm
year 3 - growth 1 cm
tree size: 3cm
year 4 - growth 2 cm
tree size: 5cm
year 5 - growth 2 cm
tree size: 7cm
year 6 - growth 2 cm
tree size: 9cm
year 7 - growth 2cm
tree size: 11cm
year 8 - growth 2cm
tree size: 13cm

         */

        int size = 0;
        for (int i = 1; i <= 10 ; i++) {
            if(i<=3){
                size++;
                System.out.println("year " + i + " - growth " + 1 + " cm");
                System.out.println("tree size: "+size+"cm");
            }
            if(i>3){
                size+=2;
                System.out.println("year " + i + " - growth " + 2 + " cm");
                System.out.println("tree size: "+size+"cm");
            }

        }



    }
}
