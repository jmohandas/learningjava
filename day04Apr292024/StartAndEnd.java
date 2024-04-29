import java.util.Scanner;

class StartAndEnd {
    public static void main(String args[]) {
        int start, end;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the start of the loop: ");
        start = sc.nextInt();
        
        System.out.println("Enter the end of the loop: ");
        end = sc.nextInt();

        while (start <= end) {
            System.out.println("Value : " + start);
            start++;
        }

    }
}