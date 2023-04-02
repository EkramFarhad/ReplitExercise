package ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Temperature");
        int temp = scanner.nextInt();


        try {
            if (temp < 32) {
                System.out.println(new RuntimeException("It is freezing"));

            } else {
                System.out.println("It is a nice weather!!");
            }

        } catch (RuntimeException RTE) {
            System.out.println(RTE);
        }


    }

}
