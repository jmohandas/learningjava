import java.util.Scanner;

class Factorial {
    public static void main(String args[]) {
        int inputNumber, counter = 1, factorial = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please eneter a number:");
        inputNumber = sc.nextInt();

        while (counter <= inputNumber) {
            factorial *= counter;
            counter++;
        }

        System.out.println("Factorial = " + factorial);
    }
}