
class CarObjects {

    String model;
    double price;
    int quantity;

    public CarObjects(String model, double price, int quantity) {
        this.model = model;
        this.price = price;
        this.quantity = quantity;
    }


    void carStockValue() {

        System.out.println(model + "Stock Value " + price);

    }
    public static void main(String[] args) {
        CarObjects carObjects1 = new CarObjects("Toyota 2019 ",2500000,2019);
        carObjects1.carStockValue();

        CarObjects carObjects2 = new CarObjects("BMW 2919 ",65298.0,2019);
        carObjects2.carStockValue();


    }

}



