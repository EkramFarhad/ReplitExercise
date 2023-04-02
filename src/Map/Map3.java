package Map;

import java.util.HashMap;

public class Map3 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Street", "Patrick ST");
        map.put("Suite", "265");
        map.put("City", "Vienna");
        map.put("Zip", "22180");
        map.put("Country", "United State");

        var value = map.entrySet();
        for (var key : map.entrySet()) {

            System.out.println(key.getValue().toUpperCase());

        }

    }
}
