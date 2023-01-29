import java.util.HashMap;
import java.util.Map;

public class Combination {
    static Map<String, String> combo(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", (map.get("a") + map.get("b")));
        }
        return map;
    }


    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "Hi");
       // map.put("b", "There");
        combo(map);
        System.out.println(map);
    }
}
