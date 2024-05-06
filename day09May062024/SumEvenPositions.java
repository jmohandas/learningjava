import java.util.Scanner;

class SumEvenPositions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int sum = 0;
        int[] numberArray = new int[10];

        System.out.println("Please enter the size of array : ");
        size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.println("Please enter an integer value : ");
            numberArray[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            if (numberArray[i] % 2 == 1) {
                sum += numberArray[i];
            }
        }

        System.out.println("Sum  = " + sum);
    }
}