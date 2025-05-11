import java.util.Scanner;
public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System,in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swap using a temporary variable
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
/*
Before swapping:
a = 5
b = 10
After swapping:
a = 10
b = 5
*/