import java.util.*;

public class MusicPlaylist {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> l = new LinkedList<>();
        while (true) {
            System.out.println("1.Play 2.Search 3.Display 4.Exit");
            int c = sc.nextInt();
            sc.nextLine();
            if (c == 1) {
                l.addFirst(sc.nextLine());
                if (l.size() > 10)
                    l.removeLast();
            } else if (c == 2)
                System.out.println(l.contains(sc.nextLine()));
            else if (c == 3)
                System.out.println(l);
            else
                break;
        }
    }
}