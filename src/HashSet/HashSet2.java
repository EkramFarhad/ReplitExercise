package HashSet;

import java.util.HashSet;

public class HashSet2 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("third");
        hashSet.add("first");
        hashSet.add("second");

        System.out.println(hashSet);

        hashSet.clear();

        System.out.println(hashSet);


    }
}
