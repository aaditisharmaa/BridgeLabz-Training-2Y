import java.util.Scanner;

class CharArrayDemo {
    public static char[] customToCharArray(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) chars[i] = text.charAt(i);
        return chars;
    }

    public static boolean compareArrays(char[] a1, char[] a2) {
        if (a1.length != a2.length) return false;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        char[] custom = customToCharArray(text);
        char[] builtin = text.toCharArray();

        System.out.println("Compare arrays: " + compareArrays(custom, builtin));
        sc.close();
    }
}

