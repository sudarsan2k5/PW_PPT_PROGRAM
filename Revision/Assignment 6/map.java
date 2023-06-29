
import java.util.HashMap;

public class map {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        System.out.println(map.containsKey(sum));
        System.out.println(map.get(sum));
    }
}
