import java.util.*;

public class SmartTrafficMonitoring {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> h = new HashMap<>();
        while (true) {
            System.out.println("1.Add/Update 2.Report 3.Exit");
            int c = sc.nextInt();
            sc.nextLine();
            if (c == 1)
                h.put(sc.nextLine(), sc.nextInt());
            else if (c == 2) {
                TreeMap<String, Integer> t = new TreeMap<>(h);
                System.out.println(t);
                String b = "";
                int mx = -1;
                for (var e : h.entrySet())
                    if (e.getValue() > mx) {
                        mx = e.getValue();
                        b = e.getKey();
                    }
                System.out.println("Busiest: " + b + " " + mx);
                System.out.println("Roads: " + h.size());
            } else
                break;
        }
    }
}