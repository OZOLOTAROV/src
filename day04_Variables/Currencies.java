package day04_Variables;

public class Currencies {
    public static void main(String[] args) {
        int dollar = 1000;
        double lira = dollar * 9.53;
        double euro = dollar * 0.86;
        double riyal = dollar * 3.75;
        double jpy = dollar * 114.12;
        double pound = dollar * 0.73;
        double peso = dollar * 20.84;
        double cad = dollar * 1.24;
        double rub = dollar * 71.55;
        double dinar = dollar * 1458;
        double EGYpound = dollar * 15.71;

        System.out.println("lira =$ " + lira);
        System.out.println("euro = $" + euro);
        System.out.println("riyal = $" + riyal);
        System.out.println("jpy =$ " + jpy);
        System.out.println("pound $= " + pound);
        System.out.println("EGYpound =$ " + EGYpound);
        System.out.println("dinar =$ " + dinar);
        System.out.println("rub = $" + rub);
        System.out.println("peso = $" + peso);
        System.out.println("cad = $" + cad);

        // jpy, pound, peso, cad, riyal, rub, IQ dinar, EGY pound
    }
}