import java.util.*;

public class SpaceMissionManager {
    HashMap<String, List<Astronaut>> map = new HashMap<>();
    HashMap<String, HashSet<String>> set = new HashMap<>();

    public void addMission(String m) {
        map.putIfAbsent(m, new ArrayList<>());
        set.putIfAbsent(m, new HashSet<>());
    }

    public void assign(String m, Astronaut a) {
        addMission(m);
        if (set.get(m).add(a.id))
            map.get(m).add(a);
    }

    public void display() {
        for (String m : map.keySet())
            System.out.println(m + " " + map.get(m) + " Total:" + map.get(m).size());
    }
}