package ThisKeword;

public class ShoppingStore {
    String item;
    double price;
    int quantity;

    public ShoppingStore(String item, double price, int quantity) {
        this.item = item;
        this.price = price;
        this.quantity = quantity;
        System.out.println(item + " Total Value " + price*quantity);
    }

//    public double itemTotalPrice() {
//
//        double totalPrice = price * quantity;
//        System.out.println("You purchased " + totalPrice + " Today ");
//
//        return totalPrice;
//
//    }
}
class ShoppingStorTest {

    public static void main(String[] args) {

        ShoppingStore shoppingStore = new ShoppingStore("Blanket",99.98,1);


        ShoppingStore shoppingStore1 = new ShoppingStore("Mattress",439.18,1);


        System.out.println("You purchased " +(shoppingStore1.price+shoppingStore.price)+ " Today ");
    }
}
