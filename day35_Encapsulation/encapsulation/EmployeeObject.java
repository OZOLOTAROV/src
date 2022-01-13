package day35_Encapsulation.encapsulation;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Oleksandr",'M',28, 110000);

        employee1.setAge(32);

        Employee employee2 = new Employee("Alina",'F',24, 100000);
        employee2.setSalary(employee2.getSalary() + 15000);
        System.out.println(employee1);
        System.out.println(employee2);






    }
}
