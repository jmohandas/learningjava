import java.util.Scanner;

class SwapTest {
    public static void main(String args[]) {
        int num1 , num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        num2 = sc.nextInt();

        System.out.println("Before Swap:");
        System.out.println("Number 1:" + num1);
        System.out.println("Number 2:" + num2);

        num1 += num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After Swap:");
        System.out.println("Number 1:" + num1);
        System.out.println("Number 2:" + num2);
    }
}