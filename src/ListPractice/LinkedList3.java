package ListPractice;

import java.util.LinkedList;

public class LinkedList3 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList= new LinkedList<>();
        int num1 = 0;
        int num2 = 1;
        int nextNum;

        for (int i = 0; i <10 ; i++) {
            if(i<=1){
                nextNum=i;

            } else {
                nextNum = num1 +num2;
                num1 = num2;
                num2 = nextNum;
            }
            linkedList.add(nextNum);

        }
       for(Integer in: linkedList){
           System.out.print(in + " ");
       }

    }
}
