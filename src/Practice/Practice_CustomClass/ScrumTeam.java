package Practice.Practice_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

/*
 create a class called ScrumTeam
                    Attributes:
                            PO, BA, SM,
                            ArrayList<Tester> testers = new ArrayList<>(),
                            ArrayList<Developer> testers = new ArrayList<>(),
                    Actions:
                            setInfo(): sets the names of: PO, BA, SM
                            toString(): prints number of tester,& developers,  PO name, SM name, BA name
 */
public class ScrumTeam {
    String PO;
    String BA;
    String SM;
    ArrayList<Tester> testers = new ArrayList<>();
    ArrayList<Developer> developers = new ArrayList<>();

    public void setInfo(String PO, String BA, String SM){
        this.PO= PO;
        this.BA = BA;
        this.SM = SM;
    }

    //  addTester(Tester tester): adds the given tester to the testers arraylist
    public void addTester(Tester tester){
        testers.add(tester);
    }

    //  addTesters(Tester[] testers): adds the given testers to the testers arraylist
    public void addTesters(Tester[] testers){
        if(testers.length==0){
            return;
        }
        this.testers.addAll(Arrays.asList(testers));  // calling instance variable
    }

    // removeTester(long employeeID): removes the given tester from the testers arraylist
    public void removeTester(long employeeID){ // argument, 007
        testers.removeIf(p->p.employeeID==employeeID);
        //                    each employeeID
    }

    // addDeveloper(Developer developer): adds the given developer to the developers arraylist
    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    //  addDevelopers(Developer[] developers): adds the given developers to the developers arraylist
    public void addDeveloper(Developer[] developers){
        if(developers.length==0){
            return;
        }
        this.developers.addAll(Arrays.asList(developers));
    }

    // removeDeveloper(long employeeID): removes the developer from the developers arraylist
    public void removeDeveloper(long employeeID){
        developers.removeIf(p-> p.employeeID==employeeID);
            //        each employee       given employee ID and if they match, this specific employee will be removed
        }


     public String toString(){
        return testers.size()+ " Testers,  " + developers.size()+" Developers, PO: " + PO + ", BA: " + BA + ", SM: " + SM;
     }



    }











