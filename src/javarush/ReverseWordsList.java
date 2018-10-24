package javarush;

import java.io.*;
import java.util.*;

/*
Обращенные слова
*/
public class ReverseWordsList {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        String fileName = fileName();
        ArrayList<String> listLines = splitTextFromFileToLine(fileName);
        ArrayList<String> listWords = splitLineFromFileToWords(listLines);
        LinkedHashSet<Pair> set = new LinkedHashSet<>();
        for (int i = 0; i < listWords.size() - 1; i++) {
            String st = listWords.get(i);
            String reverseWord = new StringBuilder(st).reverse().toString();
            for (int j = i + 1; j < listWords.size(); j++) {
                if (reverseWord.equals(listWords.get(j))) {
                    Pair pair = new Pair();
                    pair.first = st;
                    pair.second = reverseWord;
                    set.add(pair);
                    break;
                }
            }
        }
        result.addAll(set);
    }

    public static class Pair {
        String first;
        String second;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null && second != null ? second :
                            second == null && first != null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }

    }

    private static String fileName() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        return fileName;

    }

    private static ArrayList<String> splitTextFromFileToLine(String fileName) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String stroka;
        while ((stroka = bufferedReader.readLine()) != null) {
            list.add(stroka);
        }
        bufferedReader.close();
        return list;
    }

    private static ArrayList<String> splitLineFromFileToWords(ArrayList<String> list) {
        ArrayList<String> listWords = new ArrayList<String>();
        String[] massWords;
        for (int i = 0; i < list.size(); i++) {
            massWords = list.get(i).split(" ");
            for (int j = 0; j < massWords.length; j++) {
                listWords.add(massWords[j]);
            }
        }

        return listWords;
    }

}
