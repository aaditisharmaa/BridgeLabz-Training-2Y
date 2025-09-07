import java.util.*;

class PalindromeChecker {
    public static boolean isPalindrome(String text) {
        String rev = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        System.out.println("Palindrome? " + isPalindrome(text));
    }
}
