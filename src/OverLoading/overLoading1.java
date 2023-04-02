package OverLoading;

public class overLoading1 {
    public static void main(String[] args) {


        Over.display(100);
        Over.display("Syntax Technologies");
        Over.display(100.09);

    }

    static class Over{


        public static void display(int num) {
            System.out.println(num);

        }

        public  static void display(String name) {
            System.out.println(name);

        }

        public static void display(double num2) {
            System.out.println(num2);

        }
    }

}