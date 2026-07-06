public class Contact implements Comparable<Contact> {
    private String name, phone, email;

    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int compareTo(Contact o) {
        return name.compareToIgnoreCase(o.name);
    }

    public String toString() {
        return name + " | " + phone + " | " + email;
    }
}