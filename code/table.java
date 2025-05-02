import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        
        // Loop 3 times to accept 3 inputs
        for (int i = 0; i < 3; i++) {
            // Read the string (word) and integer (number) in a single line
            String s1 = sc.next();
            int x = sc.nextInt();
            
            // Format and print the output
            System.out.printf("%-15s%03d\n", s1, x);
        }

        System.out.println("================================");
    }
}
