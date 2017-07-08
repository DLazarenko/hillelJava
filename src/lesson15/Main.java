package lesson15;

public class Main {
    public static void main(String[] args) {
        Map map = new Map();
        map.put("ivanov", "ivan");
        map.put("yyyy", "12");
        System.out.println(map);
        System.out.println(map.get("ivanov"));
    }
}
