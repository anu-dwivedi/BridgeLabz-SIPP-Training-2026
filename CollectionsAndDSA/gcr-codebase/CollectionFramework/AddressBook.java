import java.util.*;

public class AddressBook {
    private ArrayList<Contact> contacts = new ArrayList<>();
    private HashMap<String, Contact> map = new HashMap<>();
    private HashSet<String> phones = new HashSet<>();

    public boolean add(Contact c) {
        if (!phones.add(c.getPhone()))
            return false;
        contacts.add(c);
        map.put(c.getName(), c);
        return true;
    }

    public Contact search(String name) {
        return map.get(name);
    }

    public boolean delete(String name) {
        Contact c = map.remove(name);
        if (c == null)
            return false;
        contacts.remove(c);
        phones.remove(c.getPhone());
        return true;
    }

    public void display() {
        Collections.sort(contacts);
        for (Contact c : contacts)
            System.out.println(c);
    }
}