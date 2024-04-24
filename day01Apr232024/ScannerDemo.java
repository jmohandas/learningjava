import java.util.Scanner;

class ScannerDemo {
    public static void main(String args[]) {
        int first, second;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        first = sc.nextInt();
        System.out.println("Enter second number: ");
        second = sc.nextInt();
        System.out.println("first = "+first);
        System.out.println("second = "+second);
    }
}