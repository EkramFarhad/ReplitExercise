package ListPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist2 {
    public static void main(String[] args) {

        ArrayList<Boolean> listA = new ArrayList<>();
        listA.add(true);
        listA.add(false);
        listA.add(false);

//        System.out.println(listA);

        ArrayList <Boolean> listB = new ArrayList<>();
        listB = listA;
//        System.out.println(listB);

        Iterator <Boolean> itr = listB.iterator();
        for (Iterator<Boolean> x = itr; x.hasNext(); ) {
            Boolean b = x.next();
            System.out.println(b);
        }
    }
}
