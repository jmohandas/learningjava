import java.util.Scanner;

class MatrixCalculation1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows, cols;
        System.out.println("Please enter number of rows: ");
        rows = sc.nextInt();

        System.out.println("Please enter number of cols: ");
        cols = sc.nextInt();

        int[][] sampleArray = new int[rows][cols];

        for (int i = 0;  i < rows; i++) {
            for (int j = 0;  j < cols; j++) {
                System.out.println("Enter values for the Matrix:");
                sampleArray[i][j] = sc.nextInt();

                sampleArray[i][j] = sampleArray[i][j] * 2;
            }
        }

        for (int i = 0;  i < rows; i++) {
            for (int j = 0;  j < cols; j++) {
                System.out.print(sampleArray[i][j]+ " ");
            }
             System.out.println("");
        }
    }
}