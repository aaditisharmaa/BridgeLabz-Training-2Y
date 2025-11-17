interface SecurityUtils {
    static boolean isStrong(String password) {
        return password.length() >= 8 &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*[0-9].*");
    }
}

public class PasswordStrengthValidator {
    public static void main(String[] args) {
        String pass = "Lavanya123";

        if (SecurityUtils.isStrong(pass))
            System.out.println("Strong Password");
        else
            System.out.println("Weak Password");
    }
}
