package HashTable;

public class Entry {
    String key;
    Object value;

    Entry(String key, Object value){
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }
    public void setValue(Object value){
        this.value = value;
    }
}
