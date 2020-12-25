package day_62;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;

public class ListOfMaps {
    public static void main(String[] args) {

        Map<String, String> scrum1 = new LinkedHashMap<>();
        scrum1.put("Azat","Senior SoftwareDeveloper");
        scrum1.put("Nurahmet","SDET");
        scrum1.put("Arman","QA");
        scrum1.put("Abide","SDET");
        scrum1.put("Jeniffer","BA");

        Map<String, String> scrum2 = new LinkedHashMap<>();
        scrum2.put("Hajar", "Developer");
        scrum2.put("Dania", "SDET");
        scrum2.put("Rani", "PO");
        scrum2.put("Jak", "SM");
        scrum2.put("Michel", "SDET");

        Map<String, String> scrum3 = new LinkedHashMap<>();
        scrum3.put("Imran", "Senior SoftwareDeveloper");
        scrum3.put("Dilfinar", "SDET");
        scrum3.put("Atilla", "QA");
        scrum3.put("Aidana", "SDET");
        scrum3.put("Kamran", "BA");

        List<Map<String, String>> team = new ArrayList<>();
        team.addAll(Arrays.asList(scrum1, scrum2, scrum3));

        for (Map<String, String> eachMap : team){

            for (Map.Entry<String, String> eachMember : eachMap.entrySet()){
                String names = eachMember.getKey();
                String jobTitle = eachMember.getValue();
                if(jobTitle.equals("SDET")){
                    System.out.println(names);
                }
            }

        }

















    }
}
