package Map;

import java.util.HashMap;

public class HashMap2 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("ONE", "AAA");
        hashMap.put("TWO", "BBB");
        hashMap.put("THREE", "CCC");
        hashMap.put("FOUR", "DDD");
        hashMap.put("FIVE", "EEE");
        System.out.println("HashMap Before Remove :");
        var key = hashMap.entrySet();
        for (var key1 : hashMap.entrySet()) {
            System.out.println(key1.getKey() + ":" + key1.getValue());
        }

        System.out.println("---------------");

        hashMap.replace("FIVE", "SUMAIR");
        hashMap.replace("THREE", "ASEL");

        System.out.println("HashMap After Remove :");
        for (var key1 : hashMap.entrySet()) {
            System.out.println(key1.getKey() + ":" + key1.getValue());
        }
    }
}
