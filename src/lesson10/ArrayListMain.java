package lesson10;

import java.util.Collection;

public class ArrayListMain {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();
        String line1 = "qqq";
        String line2 = "eee";
        String line3= "ttt";
        String line4 = "iii";
        String line5 = "ttt";
        String line6 = "ppp";
        list1.add(line1);
        list1.add(line2);
        list1.add(line3);
        list1.add(line4);
        list1.add(line5);
        list1.add(line6);
        list2.add(line2);
        list2.add(line5);
        list2.add(line4);
        list1.removeAll(list2);

        //boolean a = list1.containsAll(list2);
        //System.out.println(a);
        list1.print();

    }
}
