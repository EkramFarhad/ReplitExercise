package HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSet3 {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Pink");
        hashSet.add("White");
        hashSet.add("Yellow");
        hashSet.add("Black");

        System.out.println("Original Hash Set: "+ hashSet);
        System.out.println("Size of the Hash Set: " + hashSet.size());
    }
}
