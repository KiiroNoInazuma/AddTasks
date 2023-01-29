import java.util.HashMap;
import java.util.Map;

public class Eat {


    static Map<String, String> topping(Map<String, String> map) {
        if (map.containsKey("ice cream") && !map.get("ice cream").isBlank())
            map.replace("ice cream", map.get("yogurt"));
        if (map.containsKey("spinach") && !map.get("spinach").isBlank()) map.replace("spinach", "nuts");
        return map;
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("ice cream", "s");
        map.put("yogurt", "salt");
        map.put("spinach", "dirt");
        topping(map);
        System.out.println(map);

    }
}
