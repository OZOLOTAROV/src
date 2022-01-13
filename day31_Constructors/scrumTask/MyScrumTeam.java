package day31_Constructors.scrumTask;

public class MyScrumTeam {

    public static void main(String[] args) {
        
        // 4 testers objects 
        Tester tester1 = new Tester("Oleksandr", 11, "SDET", 110000);
        Tester tester2 = new Tester("Alina", 32, "SE", 132000);
        Tester tester3 = new Tester("Oleg", 22, "QA", 106000);
        Tester tester4 = new Tester("Sergey", 44, "SDET", 140000);

        Tester[] testers = { tester2, tester3, tester4};
        
        // 4 developers objects
        Developer developer1 = new Developer("Oksana", 65, "Java Developer", 101000);
        Developer developer2 = new Developer("Stas", 23, "Java Master", 155000);
        Developer developer3 = new Developer("Polina", 33, "Software Developer", 130000);
        Developer developer4 = new Developer("Roman", 82, "Senior Developer", 140000);

        Developer[] developers = { developer2, developer3, developer4};

        // 1 ScrumTeam Object
        ScrumTeam scrum = new ScrumTeam("Viktoria", "Huseyn", "George", 14);
        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);

        scrum.addTesters(testers);
        scrum.addDevelopers(developers);


        System.out.println(scrum);

        System.out.println("_______________________________________________");

        for (Tester eachTester : scrum.testersList) {
            System.out.println( eachTester.name + " : " + eachTester.salary);
        }

        System.out.println("_______________________________________________");

        for (Developer eachDeveloper : scrum.devopsList) {
            System.out.println( eachDeveloper.name + " : " + eachDeveloper.salary);
        }

        System.out.println("_______________________________________________");

        scrum.removeTester(32);
        scrum.removeDeveloper(33);
        System.out.println(scrum);
        
        
    }
}
/*
create a class called MyScrumTeam:
	                    1. create an array of Testers and add the testers from your group
	                    2. create an array of developers add the developers from your group
	                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team



 */