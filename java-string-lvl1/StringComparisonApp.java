import java.util.Scanner;

public class StringComparisonApp {

    public static boolean compareStringsCharAt(String firstText, String secondText) {
        if (firstText.length() != secondText.length()) {
            return false;
        }
        for (int i = 0; i < firstText.length(); i++) {
            if (firstText.charAt(i) != secondText.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void runStringComparison() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter first string: ");
            String firstInput = scanner.next();
            System.out.print("Enter second string: ");
            String secondInput = scanner.next();

            boolean customResult = compareStringsCharAt(firstInput, secondInput);
            boolean builtInResult = firstInput.equals(secondInput);

            System.out.println("Comparison using charAt(): " + customResult);
            System.out.println("Comparison using equals(): " + builtInResult);
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void main(String[] args) {
        runStringComparison();
    }
}
