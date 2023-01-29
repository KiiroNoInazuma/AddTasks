import java.util.HashMap;
import java.util.Map;

public class Zero {
    static Map<Object, Object> word0(Map<Object, Object> map) {
        for (Map.Entry<Object, Object> mp : map.entrySet()) {
            mp.setValue(0);
        }
        return map;
    }
    public static void main(String[] args) {
        Map<Object, Object> map = new HashMap<>();
        map.put("Test", 'c');
        map.put('d', 39);
        map.put(1, "test");
        word0(map);
        System.out.println(map);
    }
}

