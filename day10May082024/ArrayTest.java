class ArrayTest {
    public static void main(String[] args) {
        int[] sampleArray = new int[5];
        for (int i = 0;  i < 3; i++) {
            sampleArray[i] = i + 1;
        }

        for (int i : sampleArray) {
            System.out.println(i);
        }
    }
}