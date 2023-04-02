package ListPractice;

import java.util.LinkedList;

public class LinkedList4 {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(111);
        linkedList.add(222);
        linkedList.add(333);
        linkedList.add(444);
        linkedList.add(555);
        linkedList.add(666);

        int sum = 0;
        for (int i = 0; i < linkedList.size(); i++) {
            sum = sum + linkedList.get(i);
        }
        System.out.println(sum);

    }
}
