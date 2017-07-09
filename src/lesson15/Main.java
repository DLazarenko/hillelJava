package lesson15;

public class Main {
    public static void main(String[] args) {
        Map map = new Map();
        map.put("ivanov", "ivan");
        System.out.println(map.get("ivanov"));

        map.put("yyyy", "12");
        map.put("ivanov", "vlad");
        System.out.println(map);
        System.out.println(map.get("yyyy"));
    }
}
