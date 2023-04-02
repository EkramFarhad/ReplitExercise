package Overriding;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.MT1();

        Child child = new Child();
        child.MT1();
    }
}
