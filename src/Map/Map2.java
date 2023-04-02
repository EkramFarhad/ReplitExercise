package Map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map2 {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("Street", "Patrick ST");
        map.put("Suite", "265");
        map.put("City", "Vienna");
        map.put("Zip", "22180");
        map.put("Country", "United State");

        var value = map.entrySet();
        for (var key : map.entrySet()) {

            System.out.println(key.getValue());

        }

    }
}
