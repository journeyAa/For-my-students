package day49_Inheritance.ScrumTeamTask;

import Office_Hours.Practice_08_12_2020.Arraylist_ShortQuiz;
import day47_Encapsulation.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/*
   create a class called ScrumTeam
Attributes:
    ArrayList<Tester> testers = new ArrayList<>(),
    ArrayList<Developer> testers = new ArrayList<>(),
Actions:
     addTester(Tester tester): adds the given tester to the testers arraylist
     addTesters(Tester[] testers): adds the given testers to the testers arraylist
     addDeveloper(Developer developer): adds the given developer to the developers arraylist
     addDevelopers(Developer[] developers): adds the given developers to the developers arraylist
     removeTester(long employeeID): removes the given tester from the testers arraylist
     removeDeveloper(long employeeID): removes the developer from the developers arraylist
 */
public class ScrumTeam {

    public ArrayList<Tester> testers = new ArrayList<>();
    public ArrayList<Developer> developers = new ArrayList<>();

    public ScrumTeam(Tester[] testers, Developer[] developers){
        addTesters(testers);// adds the array of testers to the list
        addDevelopers(developers); // adds the array of developers to the list
    }


    public void addTester(Tester tester){
        testers.add(tester);
    }

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    public void addTesters(Tester[] testers){
        this.testers.addAll(Arrays.asList(testers));
    }

    public void addDevelopers(Developer[] developers){
        this.developers.addAll(Arrays.asList(developers));
    }

    public void removeTester(int ID){
        testers.removeIf(p->p.ID==ID);
    }

    public void removeDeveloper(int ID){
        developers.removeIf(p->p.ID==ID);
    }

    public void removeTesterDeveloper(int testerID, int developerID){
        removeTester(testerID);
        removeDeveloper(developerID);
    }

    public String toString(){
        return "================================"+
                "\nDevelopers #"+developers.size()+
                "\nTesters #"+testers.size()+
                "\nCapacity: "+((developers.size()+testers.size())*8)+ " point (Dev.Team * 8 Days)"+
                "\nVelocity: "+((developers.size()+testers.size())*8)+ " point for current Sprint (No days Off)"+
                "================================";
    }





}
