package lesson11;


import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Односвязный (next) список:
 * public int size();
 * public boolean isEmpty();
 * public boolean contains(Object o);
 * public boolean add(Object o);
 * public boolean remove(Object o);
 * public boolean addAll(MyCollection c);
 * public void clear();
 * public boolean retainAll(MyCollection c);
 * public boolean removeAll(MyCollection c);
 * public boolean containsAll(MyCollection c);
 */
public class LinkedList implements List {
    private Item first;
    private Item last;
    int count = 0;


    private static class Item {
        Item next;
        Object data;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean contains(Object object) {
        Item item = first;
        while (item != null) {
            if (item.data.equals(object)) {
                return true;
            }
            item = item.next;
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return new MyIterator();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    class MyIterator implements Iterator {

        private Item item;

        MyIterator() {
            item = first;
        }

        @Override
        public boolean hasNext() {
            return item != null;
        }

        @Override
        public Object next() {
            Object element = item.data;
            item = item.next;
            return element;
        }
    }

    @Override
    public boolean add(Object o) {
        Item item = new Item();
        item.data = o;
        if (last == null) {
            first = item;
            last = item;
        } else {
            last.next = item;
            last = item;
        }
        count++;
        return true;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }


    public boolean printAll() {
        Item item = first;
        while (item != null) {
            System.out.println(item.data);
            item = item.next;
        }
        return true;
    }

    public boolean remove(Object object) {
        if (first == null) {
            return false;
        }
        if (first.data.equals(object)) {
            Item nextItem = first.next;
            first.data = null;
            first.next = null;
            first = nextItem;
            count--;
            return true;
        }
        Item previousItem = first;
        Item nItem = first.next;
        while (nItem != null) {
            if (nItem.data.equals(object)) {
                previousItem.next = nItem.next;
                nItem.data = null;
                nItem.next = null;
                count--;
                return true;
            }
            previousItem = nItem;
            nItem = previousItem.next;
        }

        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        Iterator iterator = c.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            add(next);
        }
        return true;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        Object[] list = new Object[c.size()];
        int index = 0;
        Iterator iteratorCollection = c.iterator();
        while (iteratorCollection.hasNext()) {
            Object nextCollection = iteratorCollection.next();
            Iterator iteratorLinked = iterator();
            while (iteratorLinked.hasNext()) {
                Object nextLinked = iteratorLinked.next();
                if (nextCollection.equals(nextLinked)) {
                    list[index] = nextLinked;
                    index++;
                }
            }
        }
        clear();
        for (int i = 0; i < index; i++) {
            add(list[i]);
        }
        return true;

    }

    @Override
    public boolean removeAll(Collection c) {
        Iterator iterator = c.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            Iterator iteratorLinkedList = iterator();
            while (iteratorLinkedList.hasNext()) {
                Object nextLinked = iteratorLinkedList.next();
                if (next.equals(nextLinked)) {
                    remove(nextLinked);
                    break;
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

    public void clear() {
        Item item = first;
        while (item != null) {
            item.data = null;
            item = item.next;
        }
        count = 0;
        first = null;
        last = null;
    }

    @Override
    public Object get(int index) {
        return null;
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
        Iterator iterator = iterator();
        int i = 0;
        Object result = null;
        while (iterator.hasNext()) {
            result = iterator.next();
            if (i == index) {
                remove(result);
                break;
            }
            i++;
        }
        return result;
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
}