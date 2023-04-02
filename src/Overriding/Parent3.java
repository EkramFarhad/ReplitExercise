package Overriding;

public class Parent3 {

    public void MTD1() {
        System.out.println("I am public method");

    }

    protected void MTD2() {
        System.out.println("I am protected");
    }

    void MTD3() {
        System.out.println("I am default");
    }

    private void MTD4() {
        System.out.println("I am protected");
    }
}

class Child_1 extends Parent3 {

    public void MTD1() {
        System.out.println("I am a child public method");
    }

}

class Child_2 extends Parent3 {

    protected void MTD2() {
        System.out.println("I am a child protected method");
    }
}

class Child_3 extends Parent3 {

    void MTD3() {
        System.out.println("I am a child default method");
    }
}

class main1{
    public static void main(String[] args) {

        Child_1 child1 = new Child_1();
        child1.MTD1();
        Child_2 child2 = new Child_2();
        child2.MTD2();
        Child_3 child3 = new Child_3();
        child3.MTD3();

    }
}
