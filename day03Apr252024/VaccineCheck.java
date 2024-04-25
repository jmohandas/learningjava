import java.util.Scanner;

class VaccineCheck {
    public static void main(String args[]) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age:");
        age = sc.nextInt();

        if (age > 18) {
            System.out.println("Eligible for vaccination!");
        } else {
            System.out.println("Not eligible!");
        }
    }
}