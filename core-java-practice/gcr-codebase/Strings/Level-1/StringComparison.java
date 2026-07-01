import java.util.*;

public class StringComparison {
    static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String second = sc.next();

        System.out.println("Custom Result : " + compareStrings(first, second));
        System.out.println("Built-in Result : " + first.equals(second));
    }
}