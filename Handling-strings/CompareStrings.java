import java.util.Scanner;

public class CompareStrings {
    public static void compareStrings(String str1, String str2) {
        int i = 0;
        while (i < str1.length() && i < str2.length()) {
            if (str1.charAt(i) != str2.charAt(i)) {
                if (str1.charAt(i) < str2.charAt(i))
                    System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\"");
                else
                    System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\"");
                return;
            }
            i++;
        }
        if (str1.length() == str2.length())
            System.out.println("Both strings are equal.");
        else if (str1.length() < str2.length())
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\"");
        else
            System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\"");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        compareStrings(str1, str2);
    }
}
