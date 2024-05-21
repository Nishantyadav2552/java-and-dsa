
import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            default:
                System.out.println("hello");
                break;
        }
    }
}
