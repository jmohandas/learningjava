import java.util.Scanner;

class Multiply {
    public static void main(String args[]) {
        int multiplier, start, end;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enetr the multiplier :");
        multiplier = sc.nextInt();

        System.out.println("Enter the start of multiplication table :");
        start = sc.nextInt();

        System.out.println("End value of multiplication table :");
        end = sc.nextInt();

        while (start <= end) {
            System.out.println(start + " X " + multiplier + " = " + (start * multiplier));
            start++;
        }
    } 
}