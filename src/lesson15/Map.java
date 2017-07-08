package lesson15;

public class Map {
    Entry[] list = new Entry[0];

    public void put(Object key, Object value) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].getKey().equals(key)) {
                list[i].setValue(value);
            } else {
                Entry[] newList = new Entry[list.length + 1];
                for (int k = 0; k < list.length; k++) {
                    newList[k] = list[k];
                }
                Entry entry = new Entry();
                entry.setKey(key);
                entry.setValue(value);
                newList[list.length] = entry;
                list = newList;
            }
        }

    }

    public Object get(Object key) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].getKey().equals(key)) {
                return list[i].getValue();
            }
        }
        return null;
    }
}
