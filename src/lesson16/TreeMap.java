package lesson16;

public class TreeMap {
    private Entry root;

    public void put(String key, Object value) {
        Entry entry = new Entry(key, value, null, null);
        put(entry);
    }

    private void put(Entry newEntry) {
        if (root == null) {
            root = newEntry;
        } else {
            put(root, newEntry);
        }
    }

    private void put(Entry entry, Entry newEntry) {
        Object entryObject = entry.getKey();
        Object newEntryObject = newEntry.getKey();
        Comparable entryComparable = (Comparable) entryObject;
        Comparable newEntryComparable = (Comparable) newEntryObject;
        if (entryComparable.compareTo(newEntryComparable) > 0) {
            if (entry.getLeft() == null) {
                entry.setLeft(newEntry);
            } else {
                put(entry.getLeft(), newEntry);
            }
        } else if (entryComparable.compareTo(newEntryComparable) < 0) {
            if (entry.getRight() == null) {
                entry.setRight(newEntry);
            } else {
                put(entry.getRight(), newEntry);
            }
        } else put(entry.getRight(), newEntry);
    }

    public Object get(Object key) {
        if (root == null) {
            return null;
        }
        if (root.getKey().equals(key)) {
            return root.getValue();
        } else {
            return get(root, key);
        }
    }

    private Object get(Entry entry, Object key) {
        Object entryObject = entry.getKey();
        Comparable entryComparable = (Comparable) entryObject;
        Comparable keyComparable = (Comparable) key;
        if (entryComparable.compareTo(key) > 0) {
            if (entry.getLeft() == null) {
                return null;
            } else if (entry.getLeft().getKey().equals(key)) {
                return entry.getLeft().getValue();
            } else return get(entry.getLeft(), key);
        } else if (entryComparable.compareTo(key) < 0) {
            if (entry.getRight() == null) {
                return null;
            } else if (entry.getRight().getKey().equals(key)) {
                return entry.getRight().getValue();
            } else return get(entry.getRight(), key);
        } else return null;
    }
}