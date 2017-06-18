package lesson11;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

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
public class LinkedList implements Iterable {
    private Item first;
    private Item last;
    int count = 0;

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {
    }

    @Override
    public Spliterator spliterator() {
        return null;
    }

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

    public void add(Object object) {
        Item item = new Item();
        item.data = object;
        if (last == null) {
            first = item;
            last = item;
        } else {
            last.next = item;
            last = item;
        }
        System.out.println(item.data);
        count++;
    }

    public boolean printAll() {
        Item item = first;
        while (item != null) {
            System.out.println(item.data);
            item = item.next;
        }
        return false;
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

    public void clear() {
        Item item = first;
        while (item != null) {
            item.data = null;
            item = item.next;
        }
        count = 0;
    }
}