package lesson11;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        String a = "gggg";
        String b = "qqqq";
        list.add(a);
        list.add(b);
        list.add("ccc");
        String eee = "eee";
        list.add(eee);

        list.remove(eee);
        System.out.println("result");

        System.out.println(list.size());
    }
}