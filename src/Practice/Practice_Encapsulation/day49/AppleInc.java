package Practice.Practice_Encapsulation.day49;

public class AppleInc {
    public static void main(String[] args) {

        Developer developer1 = new Developer("Ebrahim", 31, 'M', 130000, 8765432, "SDET");
        Developer developer2 = new Developer("Ahmet",30,'M',150_000,10711453,"Lead Developer");
        Developer developer3 = new Developer("Yadigarjan", 40,'M', 120000, 3212313,"SDET");
        Developer developer4= new Developer("fatime",30,'F', 150000,123456,"softwareEngineer");

        Developer[] developers = {developer1,developer2,developer3,developer4};

        Tester tester1 = new Tester("Rakhat", 30, 'F', 125000, 123456, "SDET");
        Tester tester2 = new Tester("Murat",30,'M',110_000,10711453,"SDET");
        Tester tester3 = new Tester("Milovan",33,'M',125000,1,"SDET");

        Tester[] testers = {tester1, tester2, tester3};

    //    ScrumTeam scrumTeam1 = new ScrumTeam(developers, testers);




















    }
}
