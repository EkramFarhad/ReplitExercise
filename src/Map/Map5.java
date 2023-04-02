package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map5 {
    public static void main(String[] args) {
        // Step 1
        List<Map<String, Object>> dataList = new ArrayList<>();

        // Step 2
        Map<String, Object> appleMap = new HashMap<>();
        appleMap.put("Items", "Apple");
        appleMap.put("Price", 20.0);
        appleMap.put("Quantity", 10.0);

        // Step 3
        dataList.add(appleMap);

        // Step 4
        Map<String, Object> orangeMap = new HashMap<>();
        orangeMap.put("Items", "Orange");
        orangeMap.put("Price", 21.99);
        orangeMap.put("Quantity", 10.0);

        // Step 5
        dataList.add(orangeMap);

        // Step 6
        for (Map<String, Object> item : dataList) {
            // Step 7
            String items = (String) item.get("Items");
            Double price = (Double) item.get("Price");
            Double quantity = (Double) item.get("Quantity");

            // Step 8
            Double subtotal = price * quantity;

            // Step 9
            System.out.println("Items: "+items + " Price: " + price + " Quantity: " + quantity + " SubTotal: " + subtotal);
            System.out.println();

        }

        // Step 10
        Double totalPurchase = 0.0;
        for (Map<String, Object> item : dataList) {
            Double price = (Double) item.get("Price");
            Double quantity = (Double) item.get("Quantity");
            Double subtotal = price * quantity;
            totalPurchase += subtotal;
        }

        // Step 11
        System.out.println("Your Purchase total : " + totalPurchase);
    }
}
