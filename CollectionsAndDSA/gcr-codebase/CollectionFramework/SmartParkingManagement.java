import java.util.*;

public class SmartParkingManagement {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> v = new ArrayList<>();
        while (true) {
            System.out.println("1.Enter 2.Exit 3.Search 4.Display 5.Quit");
            int c = sc.nextInt();
            sc.nextLine();
            if (c == 1)
                v.add(sc.nextLine());
            else if (c == 2)
                v.remove(sc.nextLine());
            else if (c == 3)
                System.out.println(v.contains(sc.nextLine()));
            else if (c == 4) {
                System.out.println(v);
                System.out.println("Occupied: " + v.size());
            } else
                break;
        }
    }
}