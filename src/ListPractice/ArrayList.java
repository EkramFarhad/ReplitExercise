package ListPractice;

import java.util.Scanner;

public class ArrayList<B> {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        java.util.ArrayList arrayList = new java.util.ArrayList();
       // scanner.nextInt();
        arrayList.add(4);
       // scanner.nextInt();
        arrayList.add(62);
        //scanner.nextInt();
        arrayList.add(8);
        //scanner.nextInt();
        arrayList.add(5);
       // scanner.nextInt();
        arrayList.add(4);

       for(Object arr:arrayList){
           System.out.print(arr+" ");
       }

    }
}
