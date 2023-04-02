package HashSet;

import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet <Integer> hashSet = new HashSet<>();
        hashSet.add(111);
        hashSet.add(111);
        hashSet.add(111);
        hashSet.add(999);
        hashSet.add(999);
        hashSet.add(999);

        for(Integer hash : hashSet){
            System.out.println(hash);
        }


    }
}
