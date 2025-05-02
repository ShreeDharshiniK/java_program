import java.util.Scanner;

// User-defined exception class
class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
        super(message);
    }
}

public class Username {  // Class name is "Username" (capitalized)
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an 8-character username: ");
        String name = s.nextLine();

        try {
            validateUsername(name);
            System.out.println("Username is valid.");
            System.out.println("Username created successfully");
        } catch (InvalidUsernameException e) {
            System.out.println("Invalid Username: " + e.getMessage());
            System.out.println("Try Again");
        } finally {
            s.close();
            System.out.println("Program Exiting......");
        }
    }

    public static void validateUsername(String name) throws InvalidUsernameException {
        if (name.length() < 8) {
            throw new InvalidUsernameException("Username must be at least 8 characters long.");
        }

        int splCh = 0, alpha = 0;

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                throw new InvalidUsernameException("Username must not contain capital letters.");
            }

            if (ch >= 'a' && ch <= 'z') {
                alpha++;
            } else {
                splCh++;
            }
        }

        if (alpha < 5) {
            throw new InvalidUsernameException("Username must contain at least 5 letters.");
        }

        if (splCh < 3) {
            throw new InvalidUsernameException(
                "Username must contain at least 3 digits or special characters."
            );
        }
    }
}
