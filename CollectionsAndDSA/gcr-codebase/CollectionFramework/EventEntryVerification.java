import java.util.*;

public class EventEntryVerification {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> s = new HashSet<>();
        while (true) {
            System.out.println("1.Register 2.Display 3.Exit");
            int c = sc.nextInt();
            sc.nextLine();
            if (c == 1)
                System.out.println(s.add(sc.nextLine()) ? "Registered" : "Duplicate");
            else if (c == 2) {
                System.out.println(s);
                System.out.println("Total: " + s.size());
            } else
                break;
        }
    }
}