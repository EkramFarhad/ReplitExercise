package ListPractice;

import java.util.LinkedList;

public class LinkedList2 {

    public static void main(String[] args) {
        LinkedList <Integer>linkedList = new LinkedList <>();
        for (int i = 50; i <=100 ; i++) {
            linkedList.add(i);
        }
      //  linkedList.removeIf(x ->x % 3 !=0);
        System.out.println(linkedList);



    }
}
