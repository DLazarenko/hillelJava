
/**
 * Реализовать простой контейнер для int на базе массива. Здесь можно проявить мастерство архитектора :).
 * Первым делом нужно подумать, что должен делать контейнер, а потом реализовывать.
 * Например:
 * добавлять (add),
 * доставать по индексу (get),
 * проверять наличие элемента (contains),
 * добавлять все элементы из другого контейнера (addAll)
 * проверять на равенство (equals)
 * очищать (clear)
 * находить индекс элемента (find or indexOf)
 * узнавать размер (getSize)
 * сортировать (sort) (это очень важный вопрос его нужно
 */

public class IntList {

    private int[] ints = new int[0];

    public void add(int number) {
        int[] newInts = new int[ints.length + 1];
        for (int i = 0; i < ints.length; i++) {
            newInts[i] = ints[i];
        }
        newInts[newInts.length - 1] = number;
        ints = newInts;
    }

    public int get(int index) {
        return ints[index];
    }

    public boolean contains(int number) {
        for (int i = 0; i < ints.length; i++) {
            if (number == i)
                return true;
        }
        return false;
    }

    public int[] addAll(int[] container) {
        int[] newInts = new int[ints.length + container.length];
        for (int i = 0; i < ints.length; i++) {
            newInts[i] = ints[i];
        }
        int size = ints.length;
        for (int i = 0; i < container.length; i++) {
            newInts[size] = container[i];
            size++;
        }
        ints = newInts;
        return ints;
    }

    public boolean equals(int[] newIntList) {
        if (ints.length != newIntList.length) {
            return false;
        }
        for (int i = 0; i < ints.length; i++) {
            if (newIntList[i] != ints[i]) {
                return false;
            }
        }
        return true;
    }

    public void clear() {
        ints = null;
    }

    public int find(int number) {
        for (int i = 0; i < ints.length; i++) {
            if (number == ints[i]) {
                return i;
            }
        }
        return -1;
    }

    public int getSize() {
        return ints.length;
    }

    public void sort() {
        for (int i = ints.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (ints[j] > ints[j + 1]) {
                    int x = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = x;
                }
            }
        }
    }

    public void print() {
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}