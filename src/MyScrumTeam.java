package src;

import java.util.ArrayList;
import java.util.Arrays;

public class MyScrumTeam {

    public static void main(String[] args) {

        // 4 testers objects
        day31_Constructors.scrumTask.Tester tester1 = new day31_Constructors.scrumTask.Tester("Oleksandr", 11, "SDET", 110000);
        day31_Constructors.scrumTask.Tester tester2 = new day31_Constructors.scrumTask.Tester("Alina", 32, "SE", 132000);
        day31_Constructors.scrumTask.Tester tester3 = new day31_Constructors.scrumTask.Tester("Oleg", 22, "QA", 106000);
        day31_Constructors.scrumTask.Tester tester4 = new day31_Constructors.scrumTask.Tester("Sergey", 44, "SDET", 140000);

        day31_Constructors.scrumTask.Tester[] testers = { tester2, tester3, tester4};

        // 4 developers objects
        day31_Constructors.scrumTask.Developer developer1 = new day31_Constructors.scrumTask.Developer("Oksana", 65, "Java Developer", 101000);
        day31_Constructors.scrumTask.Developer developer2 = new day31_Constructors.scrumTask.Developer("Stas", 23, "Java Master", 155000);
        day31_Constructors.scrumTask.Developer developer3 = new day31_Constructors.scrumTask.Developer("Polina", 33, "Software Developer", 130000);
        day31_Constructors.scrumTask.Developer developer4 = new day31_Constructors.scrumTask.Developer("Roman", 82, "Senior Developer", 140000);

        day31_Constructors.scrumTask.Developer[] developers = { developer2, developer3, developer4};

        // 1 ScrumTeam Object
        day31_Constructors.scrumTask.ScrumTeam scrum = new day31_Constructors.scrumTask.ScrumTeam("Viktoria", "Huseyn", "George", 14);
        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);

        scrum.addTesters(testers);
        scrum.addDevelopers(developers);


        System.out.println(scrum);

        System.out.println("_______________________________________________");

        for (day31_Constructors.scrumTask.Tester eachTester : scrum.testersList) {
            System.out.println( eachTester.name + " : " + eachTester.salary);
        }

        System.out.println("_______________________________________________");

        for (day31_Constructors.scrumTask.Developer eachDeveloper : scrum.devopsList) {
            System.out.println( eachDeveloper.name + " : " + eachDeveloper.salary);
        }

        System.out.println("_______________________________________________");

        scrum.removeTester(32);
        scrum.removeDeveloper(33);
        System.out.println(scrum);


    }
}

class Tester{

    public String name;
    public  int employeeID;
    public String jobTitle;
    public double salary;

    public Tester(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }


    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }

    public void smokeTesting(){
        System.out.println( name + " is smoke testing");
    }
    public void creatingTicket(){
        System.out.println( name + " is creating ticket");
    }

}

class Developer{

    public String name;
    public  int employeeID;
    public String jobTitle;
    public double salary;

    public Developer(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }


    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }

    public void coding(){
        System.out.println(name+ " is coding");
    }

    public void unitTesting(){
        System.out.println(name+ " is unit testing");
    }

    public void fixingBug(){
        System.out.println(name+ " is fixing bug");
    }

}

class ScrumTeam{

    public String PO, BA, SM;
    public ArrayList<day31_Constructors.scrumTask.Tester> testersList = new ArrayList<>();
    public ArrayList<day31_Constructors.scrumTask.Developer> devopsList = new ArrayList<>();
    public int daysOfSprint;

    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSprint = daysOfSprint;
    }

    public void addTester(day31_Constructors.scrumTask.Tester tester){
        testersList.add(tester);
    }

    public void addTesters(day31_Constructors.scrumTask.Tester[] testers){
        testersList.addAll(Arrays.asList(testers));
    }

    public void addDeveloper(day31_Constructors.scrumTask.Developer developer){
        devopsList.add(developer);
    }

    public void addDevelopers(day31_Constructors.scrumTask.Developer[] developers){
        devopsList.addAll(Arrays.asList(developers));
    }

    public void removeTester(int employeeID){
        testersList.removeIf( p -> p.employeeID ==  employeeID );
    }

    public void removeDeveloper(int employeeID){
        devopsList.removeIf( p -> p.employeeID == employeeID);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total number of testers =" + testersList.size() +
                ", total number of developers =" + devopsList.size() +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }

}
