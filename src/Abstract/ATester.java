package Abstract;

public class ATester {
    public static void main(String[] args) {


        Dog dog = new Dog();
        dog.mt();
        dog.huskeyMd();

        Cat cat = new Cat() {
            @Override
            public void mt() {
                super.mt();
            }
        };
    }
}
