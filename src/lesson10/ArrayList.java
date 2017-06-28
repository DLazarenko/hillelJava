package lesson10;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList implements List {
    private Object[] objects = new Object[0];

    @Override
    public int size() {
        return objects.length;
    }

    @Override
    public boolean isEmpty() {
        return objects.length == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (Object objectElement : objects) {
            if (objectElement.equals(o))
                return true;
        }
        return false;
    }

    class MyIterator implements Iterator {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < objects.length;
        }

        @Override
        public Object next() {
            Object element = objects[index];
            index++;
            return element;
        }
    }

    @Override
    public Iterator iterator() {
        return new MyIterator();
    }

    @Override
    public Object[] toArray() {
        return objects.clone();
    }

    @Override
    public boolean add(Object o) {
        Object[] newObject = new Object[objects.length + 1];
        for (int i = 0; i < objects.length; i++) {
            newObject[i] = objects[i];
        }
        newObject[objects.length] = o;
        objects = newObject;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        boolean result = false;
        for (int i = 0; i < objects.length; i++) {
            if (objects[i].equals(o)) {
                objects[i] = null;
                result = true;
                break;
            }
        }
        Object[] newObject = new Object[objects.length - 1];
        int index = 0;
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] != null) {
                newObject[index] = objects[i];
                index++;
            }
        }
        objects = newObject;
        return result;
    }

    @Override
    public boolean addAll(Collection c) {
        Iterator iterator = c.iterator();
        Object[] newObject = new Object[objects.length + c.size()];
        for (int i = 0; i < objects.length; i++) {
            newObject[i] = objects[i];
        }
        int size = objects.length;
        while (iterator.hasNext()) {
            newObject[size] = iterator.next();
            size++;
        }
        objects = newObject;
        return true;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {
        objects = null;
    }

    @Override
    public Object get(int index) {
        return objects[index];
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        Iterator iterator = c.iterator();
        Object[] arrayObject = new Object[0];
        Object[] newArrayObject = new Object[0];
        while (iterator.hasNext()) {
            Object next = iterator.next();
            for (int i = 0; i < objects.length; i++) {
                if (next.equals(objects[i])) {
                    newArrayObject = new Object[arrayObject.length + 1];
                    for (int j = 0; j < arrayObject.length; j++) {
                        newArrayObject[j] = arrayObject[j];
                    }
                    newArrayObject[arrayObject.length] = next;
                }
                arrayObject = newArrayObject;
            }
        }
        objects = arrayObject;
        if (objects.length <= c.size()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean removeAll(Collection c) {
        Iterator iterator = c.iterator();
        Object[] newObject;

        while (iterator.hasNext()) {
            Object next = iterator.next();
            int index = 0;
            for (int k = 0; k < objects.length; k++) {
                if (next.equals(objects[k])) {
                    objects[k] = null;
                    newObject = new Object[objects.length - 1];
                    for (int i = 0; i < objects.length; i++) {
                        if (objects[i] != null) {
                            newObject[index] = objects[i];
                            index++;
                        }
                    }
                    objects = newObject;
                }
            }
        }
        return true;
    }

    @Override
    public boolean containsAll(Collection c) {
        Iterator iterator = c.iterator();
        while (iterator.hasNext())
            if (!(contains(iterator.next()))) {
                return false;
            }
        return true;
    }

    public void print() {
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}