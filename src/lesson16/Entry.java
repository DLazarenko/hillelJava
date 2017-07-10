package lesson16;

public class Entry {
    private String key;
    private Object value;
    private Entry left;
    private Entry right;

    public Object getKey() {
        return key;
    }

    public Entry(String key, Object value, Entry left, Entry right) {
        this.key = key;
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public Entry getLeft() {
        return left;
    }

    public Entry getRight() {
        return right;
    }

    public void setRight(Entry right) {
        this.right = right;
    }

    public void setLeft(Entry left) {
        this.left = left;
    }

}