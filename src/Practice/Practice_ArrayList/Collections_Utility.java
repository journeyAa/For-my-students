package Practice.Practice_ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collections_Utility {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,2,40,2,2,2,2,2,4,90,10,2));

        Collections.sort(list);
        System.out.println(list);

        System.out.println("the max num in the array is " + list.get(list.size()-1));

        for (int i = list.size()-1; i >= 0 ; i--) {
            Integer each = list.get(i);
            System.out.print(each + " ");

        }
        System.out.println();

        Collections.swap(list,0, list.size()-1);
        System.out.println(list);

        int fr = Collections.frequency(list,2);
        System.out.println(fr);











    }
}
