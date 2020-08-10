package repl.itAssignments;

public class AverageTemperature {
    public static void main(String[] args) {

        double[] temps = {120, 122, 80, 60, 48, 90, 98, 84};
        double total = 0;
        double avgTemp = 0;
        int k1 = temps.length;

        for (double each: temps){
            total += each;
            avgTemp = total/k1;

        }
        System.out.println(avgTemp);







    }
}
