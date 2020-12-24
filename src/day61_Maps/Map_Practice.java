package day61_Maps;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Map_Practice {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> students = new LinkedHashMap<>();

        students.put("Shakhzod", 89);
        students.put("Ceren", 95);
        students.put("Fatime", 85);
        students.put("Kalbinur", 98);
        students.put("Hanna",94);
        students.put("Jesus",74);
        students.put("Elmira",97);
        students.put("Ali",92);
        students.put("Mikri",95);
        students.put("John",85);
        students.put("Bob",90);
        students.put("Lewis",64);
        students.put("Anna",70);
        students.put("Hannah",50);


        LinkedHashMap<String, Integer> earlyBirds = new LinkedHashMap<>();

        LinkedHashMap<String, Integer> angryBirds = new LinkedHashMap<>();

        for (String eachKey : students.keySet()){
            Integer eachValue = students.get(eachKey);

            if(eachValue >= 95){
                earlyBirds.put(eachKey, eachValue);
            } else{
                angryBirds.put(eachKey, eachValue);
            }
        }

        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angryBirds = " + angryBirds);


    }
}
