import java.util.Scanner;

class SwitchDemo {
    public static void main(String args[]) {
        int dayNumber;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the day no of the week:");
        dayNumber = sc.nextInt();

        switch (dayNumber) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Not a vlid week day number");
                break;
        }
    }
}