package repl.itAssignments;

public class ZombieAttack1 {
    public static void main(String[] args) {

        int inhabitants = 8;

        // day 0    8
        // day 1    4
        // day2     2
        //day 3     1

        int day=0;
        while(inhabitants>0){
            System.out.println("Day "+day+" ["+inhabitants+"]");
            inhabitants/=2;
            day++;
        }
        System.out.println("---- EXTINCT ----");













    }
}
