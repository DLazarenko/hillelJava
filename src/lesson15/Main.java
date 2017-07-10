package lesson15;

public class Main {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("ivanov", "ivan");
        System.out.println(map.get("ivanov"));

        map.put("yyyy", "12");
        map.put(12, "vlad");
        System.out.println(map);
        System.out.println(map.get(12));
    }
}
