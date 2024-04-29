import java.util.Scanner;
class Colors {
    public static void main(String args[]) {
        char c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the color character: ");
        c = sc.next().charAt(0);
        System.out.println("Entered Character is " + c);
        switch(c) {
            case 'v':
            case 'V':
                System.out.println("Violot");
                break;
            case 'i':
            case 'I':
                System.out.println("Indigo");
                break;
            case 'b':
            case 'B':
                System.out.println("Blue");
                break;
            case 'g':
            case 'G':
                System.out.println("Green");
                break;
            case 'y':
            case 'Y':
                System.out.println("Yellow");
                break;
            case 'o':
            case 'O':
                System.out.println("Orange");
                break;
            case 'r':
            case 'R':
                System.out.println("Red");
                break;
            default:
                System.out.println("Not a color from rainbow!");
                break;
        }
    }
}