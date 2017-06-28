package lesson11;


public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList j = new LinkedList();


        String a = "gggg";
        String b = "qqqq";
        list.add(a);
        list.add(b);
        list.add("ccc");
        list.add("eee");
        list.add("eee1");


        j.add("qqqq");
        j.add("eee");
        j.add("eee1");


         list.printAll();
        System.out.println("result");
        list.remove(2);
        list.printAll();
    }
}