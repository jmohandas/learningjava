import java.util.Scanner;

class TwoDimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, col;

        System.out.println("Enter the number of rows:");
        row = sc.nextInt();

        System.out.println("Enter the number of rows:");
        col = sc.nextInt();

        int[][] twoDimenionalArray = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Eneter value ["+i+"]["+j+"] :");
                twoDimenionalArray[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(twoDimenionalArray[i][j]);
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}