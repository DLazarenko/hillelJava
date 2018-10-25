package javarush.compareFiles;

import java.io.*;
import java.util.*;

public class CompareTwoFiles {
    public static List<LineItem> lines = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();
        ArrayList<String> list1 = readText(file1);

        ArrayList<String> list2 = readText(file2);

        Queue<String> q1 = new LinkedList<String>(list1);
        Queue<String> q2 = new LinkedList<String>(list2);
        while (q1.iterator().hasNext() || q2.iterator().hasNext()) {
            LineItem item;
            String s1 = q1.poll();
            String s2 = q2.poll();
            if (s1 != null && s1.equals(s2)) {
                item = new LineItem(Type.SAME, s1);
                lines.add(item);
            } else {
                if (s1 == null && s2 != null) {
                    item = new LineItem(Type.ADDED, s2);
                    lines.add(item);
                    continue;
                }
                if (s1 != null && s2 == null) {
                    item = new LineItem(Type.REMOVED, s1);
                    lines.add(item);
                    continue;
                }

                if (q1.peek() != null && q1.peek().equals(s2)) {
                    String s1next = q1.poll();
                    item = new LineItem(Type.REMOVED, s1);
                    lines.add(item);
                    item = new LineItem(Type.SAME, s1next);
                    lines.add(item);
                }
                if (q2.peek() != null && q2.peek().equals(s1)) {
                    String s2next = q2.poll();
                    item = new LineItem(Type.ADDED, s2);
                    lines.add(item);
                    item = new LineItem(Type.SAME, s2next);
                    lines.add(item);
                }
            }
        }
        for (LineItem s : lines) {
            System.out.println(s.type + s.line);
        }
    }

    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }

    private static ArrayList<String> readText(String fileName) throws IOException {
        BufferedReader bufferedReader1 = new BufferedReader(new FileReader(fileName));
        String stroka;
        ArrayList<String> list = new ArrayList<>();
        while ((stroka = bufferedReader1.readLine()) != null) {
            list.add(stroka);
        }
        bufferedReader1.close();
        return list;
    }
}
