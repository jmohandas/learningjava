import java.util.Arrays;

class ForEach {
    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3}, {4, 5, 6}};

        for(int[] i: nums) {
            System.out.println(Arrays.toString(i));
        }
    }
}