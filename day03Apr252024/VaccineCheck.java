import java.util.Scanner;

class VaccineCheck {
    public static void main(String args[]) {
        int age;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your age:");
        age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Eligible for vaccination!");

            if (age >= 18 && age <= 60) {
                System.out.println("Priority allotment available");
            } else {
                System.out.println("Not eligible for priority allotment");
            }
        } else {
            System.out.println("Not eligible!");
        }
    }
}