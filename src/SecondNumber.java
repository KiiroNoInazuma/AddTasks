import java.util.*;

public class SecondNumber {
    static void sNum(Integer... num) {
        List<Integer> list = new ArrayList<>(Arrays.asList(num));
       list.sort(Integer::compareTo);



        System.out.println(list.get(list.size() - 2));

    }

    public static void main(String[] args) {
        sNum(4, 5, 1);
    }
}
