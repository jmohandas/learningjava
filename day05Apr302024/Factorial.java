import java.util.Scanner;

class Factorial {
    public static void main(String args[]) {
        int inputNumber, factorial = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please eneter a number:");
        inputNumber = sc.nextInt();

        while (inputNumber > 1) {
            factorial *= inputNumber;
            inputNumber--;
        }

        System.out.println("Factorial = " + factorial);
    }
}