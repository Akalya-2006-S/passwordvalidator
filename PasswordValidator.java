import java.util.Scanner;
public class PasswordValidator {
    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            System.out.println("Password must be at least 8 characters long.");
            return false;
        }
        if (password.contains(" ")) {
            System.out.println("Password should not contain spaces.");
            return false;
        }
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasSpecial = false;
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            }
            else if (Character.isLowerCase(ch)) {
                hasLower = true;
            }
            else if (!Character.isLetterOrDigit(ch)) {
                hasSpecial = true;
            }
        }
        if (!hasUpper || !hasLower || !hasSpecial) {
            System.out.println("Password must contain uppercase, lowercase and special character.");
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Password: ");
        String password = sc.nextLine();
        if (isValidPassword(password)) {
            System.out.println("Password is VALID");
        } else {
            System.out.println("Password is INVALID");
        }
        sc.close();
    }
}
