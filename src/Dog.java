public class Dog {

    String dogName;
    double dogWeight;
    static  String dogBreed = "Mutt";

    public Dog(String dogName, double dogWeight) {
        this.dogName = dogName;
        this.dogWeight = dogWeight;
    }

    void print(){
        System.out.println(dogName+ " "+dogBreed+ " " +dogWeight);
    }
}

class Main{
    public static void main(String[] args) {
        Dog thisKeyword= new Dog("Tarzan",50.0);
        thisKeyword.print();

        Dog thisKeyword2= new Dog("Lucy",10.0);
        thisKeyword2.print();


    }
}