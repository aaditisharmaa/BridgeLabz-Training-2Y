import java.util.Scanner;

public class SubstringApp {

    public static String createSubstringUsingCharAt(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end && i < text.length(); i++) {
            result.append(text.charAt(i));
        }
        return result.toString();
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

    public static void runSubstringApp() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a text: ");
            String textInput = scanner.next();
            System.out.print("Enter start index: ");
            int startIndex = scanner.nextInt();
            System.out.print("Enter end index: ");
            int endIndex = scanner.nextInt();

            String customSubstring = createSubstringUsingCharAt(textInput, startIndex, endIndex);
            String builtInSubstring = textInput.substring(startIndex, endIndex);

            boolean isEqual = compareStrings(customSubstring, builtInSubstring);

            System.out.println("Custom Substring: " + customSubstring);
            System.out.println("Built-in Substring: " + builtInSubstring);
            System.out.println("Are both substrings equal? " + isEqual);

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Invalid index: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void main(String[] args) {
        runSubstringApp();
    }
}
