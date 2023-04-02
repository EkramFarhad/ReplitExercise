package ListPractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List5 {

    public static void main(String[] args) {
        List<String> countries = new LinkedList<>();
        countries.add("Armenia");
        countries.add("USA");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");
        countries.add("Azerbaijan");


        List<String> newList = removeA(countries);
        System.out.println(newList);

    }

        public static List<String> removeA(List<String> list) {
            List<String> newList = new ArrayList<>();
            for (String str : list) {
                if (!str.startsWith("A")) {
                    newList.add(str);
                }
            }
            return newList;
        }


}
