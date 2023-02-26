package class30;

public class Entry {
    private int Key;
    private String value;

    public Entry(int key, String value) {
        Key = key;
        this.value = value;
    }

    public int getKey() {
        return Key;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "Key=" + Key +
                ", value='" + value + '\'' +
                '}';
    }
}
