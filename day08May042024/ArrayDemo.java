import java.util.Scanner;

class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        for ( int i = 0; i < 5; i++ ) {
            System.out.println("Enter a number:");
            arr[i] = sc.nextInt();
        }

        for ( int i = 0; i < 5; i++ ) {
            System.out.println(arr[i]);
        }
    }
}