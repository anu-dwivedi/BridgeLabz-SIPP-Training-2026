import java.util.*;

public class ClassroomAttendance {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, ArrayList<String>> m = new HashMap<>();
        while (true) {
            System.out.println("1.Mark 2.Display 3.Exit");
            int c = sc.nextInt();
            sc.nextLine();
            if (c == 1) {
                String sub = sc.nextLine(), stu = sc.nextLine();
                m.putIfAbsent(sub, new ArrayList<>());
                if (!m.get(sub).contains(stu))
                    m.get(sub).add(stu);
            } else if (c == 2) {
                for (String k : m.keySet())
                    System.out.println(k + " " + m.get(k) + " Total:" + m.get(k).size());
            } else
                break;
        }
    }
}