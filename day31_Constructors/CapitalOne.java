package day31_Constructors;

public class CapitalOne {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.setInfo("Oleksandr Zolotarov", 121452543);
        System.out.println(account1);

        account1.deposit(1000);
        account1.checkBalance();

        account1.withdraw(900);
        account1.checkBalance();
        System.out.println(account1);

        System.out.println("___________________________________");

        BankAccount account2 = new BankAccount();
        account2.setInfo("Oleg Skibo", 973753422);
        System.out.println(account2);

        account2.deposit(10000);
        account2.checkBalance();






    }
}
