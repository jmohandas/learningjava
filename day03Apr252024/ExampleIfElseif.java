import java.util.Scanner;

class ExampleIfElseif {
    public static void main(String args[]) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        num = sc.nextInt();

        if (num < 10 && num >= 0) {
            System.out.println("Single digit number");
        } else if (num < 100 && num >= 10) {
            System.out.println("Double digit number");
        } else if (num < 1000 && num >= 100) {
            System.out.println("Three digit number");
        } else if (num < 10000 && num >= 1000) {
            System.out.println("Four digit number");
        } else {
            System.out.println("Five or more digits number");
        }
    }
}