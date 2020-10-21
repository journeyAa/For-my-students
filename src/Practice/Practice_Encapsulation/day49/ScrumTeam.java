package Practice.Practice_Encapsulation.day49;

import com.sun.xml.internal.bind.v2.model.core.ID;
import day50_Inheritance_Overriding.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    /*
    create a class called ScrumTeamAttributes:
    ArrayList<Tester> testers = new ArrayList<>(),
    ArrayList<Developer> testers = new ArrayList<>(),
    Actions:addTester(Tester tester): adds the given tester to the testers arraylist
    addTesters(Tester[] testers): adds the given testers to the testers arraylist
    addDeveloper(Developer developer): adds the given developer to the developers arraylist
    addDevelopers(Developer[] developers): adds the given developers to the developers arraylist
    removeTester(long employeeID): removes the given tester from the testers arraylist
    removeDeveloper(long employeeID): removes the developer from the developers arraylist
    create a class called AppleInc:1.  create an array of Testers and store the testers info in your group
     */

    public ArrayList<Tester> testersList = new ArrayList<>();

    public ArrayList<Developer> developersList = new ArrayList<>();

//    public ScrumTeam(Tester[] testers, Developer[] developers){
//       addTesters(testers);
//    }

    public void addTester(Tester tester){
        testersList.add(tester);
    }

    public void addDeveloper(Developer developer){
        developersList.add(developer);
    }

    public void addTesters(Tester testers){
        testersList.addAll(Arrays.asList(testers));
    }

    public void addDevelopers(Developer developers){
        developersList.addAll(Arrays.asList(developers));
    }

    public void removeTester(int ID){
        testersList.removeIf(p->p.ID==ID);
    }

    public void removeDeveloper(int ID){
        developersList.removeIf(p->p.ID==ID);
    }

    public void removeTesterDeveloper(int testerID, int developerID){
        removeTester(testerID);
        removeDeveloper(developerID);
    }

    public String toString(){

        return "============================="+
                "\nDevelopers #"+ developersList.size()+
                "\nTesters #"+ testersList.size()+
                "\nCapacity: "+((developersList.size()+testersList.size()*8) + " point(Dev.Team*8 Days)"+
                "\nVelocity: "+((developersList.size()+testersList.size())*8) +" point for current sprint"+
                "=======================================================================================");

    }










}
