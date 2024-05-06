class LabledLoop {
    public static void main(String args[]) {
        firstLoop:
            for (int i = 1; i <= 3; i++) {
                secondLabel:
                    for (int j = 1; j <= 3; j++) {
                        if  (i == 2 && j == 2) {
                            break firstLoop;
                        }
                        System.out.println("i : "+ i);
                        System.out.println("j : "+ j);
                    }
            }
    }
}