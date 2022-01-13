package day08_IfStatements;

public class SwapTwoVariables_WithTemporaryVariable {

    public static void main(String[] args) {
        int a = 10;
        int b = 15;
//_______________________________________________________________

        int c = b; // c = 15
        b = a; // b = 10
        a =c;




//_______________________________________________________________
        System.out.println("a = " + a); // 15
        System.out.println("b = " + b); // 10



    }
}
