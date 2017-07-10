package lesson15;

public class HashMap {
    private final int CONST = 16;
    private final Entry[] list;

    public HashMap() {
        list = new Entry[CONST];
    }

    public void put(Object key, Object value) {
        int objectHashCode = Math.abs(key.hashCode());
        objectHashCode = objectHashCode % CONST;

        Entry entry = new Entry(key, value);
        list[objectHashCode] = entry;
    }

    public Object get(Object key) {
        int keyHashCode = Math.abs(key.hashCode());
        keyHashCode = keyHashCode % CONST;
        if (list[keyHashCode] == null) {
            return null;
        }
        if (list[keyHashCode].getKey().equals(key)) {
            return list[keyHashCode].getValue();
        }
        return null;
    }
}
