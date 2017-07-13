package HashTable;


import java.util.LinkedList;

public class HashTable {
    private static final int DEFAULT_TABLE_SIZE = 8;
    private LinkedList[] data;

    HashTable() {
        data = new LinkedList[DEFAULT_TABLE_SIZE];
    }

    public void put(String key, Object value) {
        if (key == null) {
            throw new IllegalArgumentException("Not null key");
        }

        int index = getHashCode(key);
        Entry entryToAdd = new Entry(key, value);
        if (data[index] == null) {
            data[index] = new LinkedList();
            data[index].add(entryToAdd);
            return;
        }
        for (Object objectEntry : data[index]) {
            Entry entry = (Entry) objectEntry;
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
            }
        }
    }

    public Object get(String key) {
        int index = getHashCode(key);
        LinkedList entries = data[index];
        if (entries == null) {
            return null;
        } else {
            for (Object objectEntry : data[index]) {
                Entry entry = (Entry) objectEntry;
                if (entry.getKey().equals(key)) {
                    return entry.getValue();
                }
            }
            return null;
        }
    }

    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        hashTable.put("google.com", "192.168.0.0");
        hashTable.put("yahoo", "192.168.0.0");
        System.out.println(hashTable.get("yahoo"));
    }

    private int getHashCode(String key) {
        int hashCode = key.hashCode();
        int index = Math.abs(hashCode);
        index = index % DEFAULT_TABLE_SIZE;
        return index;
    }
}