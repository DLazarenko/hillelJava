package lesson11;


public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();


        String a = "gggg";
        String b = "qqqq";
        list1.add(a);
        list1.add(b);
        list1.add("ccc");
        list1.add("eee");
        list1.add("eee1");


        list2.add("qqqq");
        list2.add("eee");
        list2.add("eee1");


         list1.printAll();
        System.out.println("result");
        list1.remove(2);
        list1.printAll();
        list1.reversePrint();
    }
}