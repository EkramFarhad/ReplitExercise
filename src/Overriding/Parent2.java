package Overriding;


public class Parent2 {

    public void hello() {
        System.out.println("method in Parent class");
    }
}

class Child1 extends Parent2 {
    public void hello() {
        System.out.println("method in Child1 class");
    }
}

class Child2 extends Parent2 {
    public void hello() {
        System.out.println("method in Child2 class");
    }
}

class Child3 extends Parent2 {
    public void hello() {
        System.out.println("method in Child3 class");
    }

}

class Main1 {

    public static void main(String[] args) {

        Parent2[] childObject = {new Child1(), new Child2(), new Child3()};
        for (Parent2 child : childObject) {
            child.hello();
        }


    }

}
