package OverLoading;

public class PrivetOverLoad {

    private static void m1(){
        System.out.println("private m1 method");
    }

    private static void m1(String name){
        System.out.println("private m1 method with int parameter");
    }


    public static void main(String[] args) {
        m1();
        m1("name");
    }
}
