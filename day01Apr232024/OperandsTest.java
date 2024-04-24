import java.util.Scanner;

class OperandsTest {
    public static void main(String args[]) {
        int first, second;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        first = sc.nextInt();
        System.out.println("Enter second number:");
        second = sc.nextInt();
        System.out.println("Addition of ("+first+"+"+second+") = "+(first+second));
        System.out.println("Subtraction of ("+first+"-"+second+") = "+(first-second));
        System.out.println("Division of ("+first+"/"+second+") = "+(first/second));
        System.out.println("Multiplication of ("+first+"*"+second+") = "+(first*second));
        System.out.println("Modulo of ("+first+"%"+second+") = "+(first%second));
    }
}