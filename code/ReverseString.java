import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string to reverse: ");
        String input = scan.nextLine();

        String rev = "";

        // Loop through the string in reverse order
        for (int i = input.length() - 1; i >= 0; i--) {
            rev = rev + input.charAt(i);
        }

        System.out.println("Reversed string: " + rev);
        
        scan.close();
    }
}
/*
Enter a string to reverse: dharshu
Reversed string: uhsrahd
*/