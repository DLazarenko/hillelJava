package lesson9;

public class MyCollectionMain {
    public static void main(String[] args) {
        MyCollection collection = new MyCollection();
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = new Object();
        Object o4 = new Object();
        Object o5 = new Object();
        Object o6 = new Object();
        Object o7 = new Object();

        MyCollection collection1 = new MyCollection();
        Object o11 = new Object();
        Object o21 = new Object();
        Object o31 = new Object();
        Object o41 = new Object();
        Object o51 = new Object();
        Object o61 = new Object();
        Object o71 = new Object();
        collection.add(o1);
        collection.add(o2);
        collection.add(o3);
        collection.add(o4);
        collection.add(o51);
        collection.add(o61);
        collection.add(o71);

        collection1.add(o11);
        collection1.add(o21);
        collection1.add(o3);
        collection1.add(o41);
        collection1.add(o51);
        collection1.add(o61);
        collection1.add(o71);
        //collection.retainAll(collection1);
        System.out.println(collection.add(collection1.get(4)));
    }
}
