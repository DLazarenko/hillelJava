package lesson9;

/**
 * +public int size();
 * +public boolean isEmpty();
 * +public boolean contains(Object object);
 * +public boolean add(Object object);
 * +public boolean remove(Object object);
 * +public boolean addAll(MyCollection collection);
 * +public void clear();
 * -public boolean retainAll(MyCollection collection);
 * public boolean removeAll(MyCollection collection);
 * -public boolean containsAll(MyCollection collection);
 */
public class MyCollection {
    private Object[] objects = new Object[0];

    public int size() {
        return objects.length;
    }

    public boolean isEmpty() {
        if (objects.length == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean contains(Object object) {
        for (Object objectElement : objects) {
            if (objectElement.equals(object))
                return true;
        }
        return false;
    }

    public boolean add(Object object) {
        Object[] newObject = new Object[objects.length + 1];
        for (int i = 0; i < objects.length; i++) {
            newObject[i] = objects[i];
        }
        newObject[newObject.length - 1] = object;
        objects = newObject;
        return true;
    }

    public boolean remove(Object object) {
        boolean result = false;
        for (int i = 0; i < objects.length; i++) {
            if (objects[i].equals(object)) {
                objects[i] = null;
                result = true;
            }
        }
        Object[] newObject = new Object[objects.length - 1];
        for (int i = 0; i < objects.length; i++) {
            int index = 0;
            if (objects != null) {
                newObject[index] = objects[i];
                index++;
            }
        }
        objects = newObject;
        return result;
    }

    public boolean addAll(MyCollection collection) {
        Object[] newObject = new Object[objects.length + collection.size()];
        for (int i = 0; i < objects.length; i++) {
            newObject[i] = objects[i];
        }
        int size = objects.length;
        for (int j = 0; j < collection.size(); j++) {
            newObject[size] = collection.get(j);
            size++;
        }
        objects = newObject;
        return true;
    }

    public void clear() {
        objects = null;
    }

    public boolean removeAll(MyCollection collection) {
        for (int i = 0; i < collection.size(); i++) {
            for (int k = 0; k < objects.length; k++) {
                if (collection.get(i).equals(objects[k])) {
                    objects[k] = null;
                }
            }
        }
        int sizeNewObject = objects.length - collection.size();
        Object[] newObject = new Object[sizeNewObject];
        int index = 0;
        for (int z = 0; z < objects.length; z++) {
            if (objects != null) {
                newObject[index] = objects[z];
                index++;
            }
        }
        objects = newObject;

        if (objects.length == sizeNewObject) {
            return true;
        } else {
            return false;
        }
    }

    // TO DO
    // public boolean retainAll(MyCollection collection) {
    //  return false;
    // }

    public boolean containsAll(MyCollection collection) {
        for (int i = 0; i < collection.size(); i++) {
            for (int j = 0; j < objects.length; j++) {
                if (!(collection.get(i).equals(objects[j]))) {
                    return false;
                }
            }
        }
        return true;
    }

    public void print() {
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
    }

    public Object get(int index) {
        return objects[index];
    }
}
