package day_62;

import java.util.*;

public class UniqueCharacter {
    public static void main(String[] args){

        String str = "abacbdeefj";

        // you should get c=1, d=1, f=1

        Map<String, Integer> map = new LinkedHashMap<>();

        List<String> list = Arrays.asList(str.split(""));
        System.out.println(list);

        for (String each: list){
            if(Collections.frequency(list,each) ==1){
                map.put(each, 1);
            }
        }
        System.out.println(map);

        System.out.println(map.containsKey("j"));





    }
}
