 public class StoreProduct {
    String label;
    double price;
    String category;
    boolean hasExpiration;
    int stock;

    public StoreProduct(String label, double price, String category, boolean hasExpiration, int stock) {
        this.label = label;
        this.price = price;
        this.category = category;
        this.hasExpiration = hasExpiration;
        this.stock = stock;
    }

    public StoreProduct(String label, double price,String category, int stock) {
        this.label = label;
        this.price = price;
        this.category=category;
        this.stock = stock;
    }

    public StoreProduct(String label, double price) {
        this.label = label;
        this.price = price;
    }

    void display() {
        System.out.println(label +" "+ price +" "+ category +" "+ hasExpiration +" "+ stock);
    }

    public static void main(String[] args) {

        StoreProduct storeProduct1 = new StoreProduct("Eggs",3.0,"Produce",true,10 );
        storeProduct1.display();

        StoreProduct storeProduct2 = new StoreProduct("Paper Towels",2.0,"misc",24 );
        storeProduct2.display();

        StoreProduct storeProduct3 = new StoreProduct("Paper Towels",2.0);
        storeProduct3.display();
    }
}
