import java.util.Scanner;

class CalculationMenu {
    public static void main(String args[]) {
        int opNumber1, opNumber2, menuOption;
        char continueChoice;
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Menu");
            System.out.println("==================================");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Divide");
            System.out.println("4. Multiply");
            System.out.println("==================================");

            System.out.println("Enter the menu option:");
            menuOption = sc.nextInt();

            System.out.println("Please enter first numbers:");
            opNumber1 = sc.nextInt();

            System.out.println("Please enter second numbers:");
            opNumber2 = sc.nextInt();

            switch (menuOption) {
                case 1:
                    System.out.println("Sum: " + (opNumber1 + opNumber2));
                    break;
                case 2:
                    System.out.println("Difference: " + (opNumber1 - opNumber2));
                    break;
                case 3:
                    System.out.println("Division result: " + (opNumber1 / opNumber2));
                    break;
                case 4:
                    System.out.println("Multiplication result: " + (opNumber1 * opNumber2));
                    break;
                default:
                    System.out.println("Please enter a vali input!");
                    break;
            }

            System.out.println("Do you want to continue? (Y/N):");
            continueChoice = sc.next().charAt(0);

            if (continueChoice == 'y' || continueChoice == 'Y') {
                continue;
            } else if (continueChoice == 'n' || continueChoice == 'N') {
                break;
            } else {
                System.out.println("Do you want to continue? (Y/N):");
                continueChoice = sc.next().charAt(0);
            }

        }

    }
}