package Abstract;

public class Dog extends AbstractAnimal {

    String name = "Huskey";
    int age = 5;

    public void huskeyMd() {
        System.out.println("I like huskey dog");
    }

    @Override
    public void mt()
    {
        System.out.println(" Woof woof woof");
    }
}
