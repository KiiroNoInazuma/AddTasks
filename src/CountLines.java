import java.util.*;

public class CountLines {
    private static final Scanner sc = new Scanner(System.in);

    CountLines(String text) {
        numberOfRepeatedWords(text);
    }

    private void numberOfRepeatedWords(String text) {
        List<String> list = List.of(text.toUpperCase().split(" "));
        Map<String, Integer> map = new HashMap<>();
        for (String s : list) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        for (Map.Entry<String, Integer> next : map.entrySet()) {
            System.out.println(next.getKey() + " : " + next.getValue());
        }
    }

    public static void main(String[] args) {
        new CountLines(sc.nextLine());
    }
}





