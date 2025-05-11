import java.util.Scanner;

public class Arithmeticop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();
        System.out.print("Enter operation (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        double result = 0;
        boolean valid = true;

        switch (op) {
            case '+': result = a + b; break;
            case '-': result = a - b; break;
            case '*': result = a * b; break;
            case '/': 
                if (b != 0) result = a / b;
                else {
                    System.out.println("Cannot divide by zero.");
                    valid = false;
                }
                break;
            default:
                System.out.println("Invalid operator.");
                valid = false;
        }

        if (valid)
            System.out.println("Result: " + result);

        scanner.close();
    }
}
/*
Enter first number: 5
Enter second number: 3
Enter operation (+, -, *, /): +
Result: 8.0*/