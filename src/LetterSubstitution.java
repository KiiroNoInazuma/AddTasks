import java.util.HashMap;
import java.util.Map;

public class LetterSubstitution {
    static Map<Character, String> mapShare(Map<Character, String> map) {
        if (map.containsKey('b') && map.get('a') != null) map.replace('b', map.get('a'));
        if (map.containsKey('c')) map.remove('c', map.get('c'));
        return map;
    }

    public static void main(String[] args) {
        Map<Character, String> map = new HashMap<>();
        map.put('a', "aaa");
        map.put('b', "meh");
        map.put('d', "hi");

        for (Map.Entry<Character, String> next : mapShare(map).entrySet()) {
            System.out.println(next.getKey() + " : " + next.getValue());
        }
    }
}
