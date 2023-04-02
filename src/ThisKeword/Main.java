package ThisKeword;

public class Main {
        String item;
        double price;
        int quantity;

        public Main(String item, double price, int quantity) {
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

    class MainTest{

        public static void main(String[] args) {

            Main shoppingStore = new Main("Blanket",99.98,1);


            Main shoppingStore1 = new Main("Mattress",439.18,1);


            System.out.println("You purchased " +(shoppingStore1.price+shoppingStore.price)+ " Today ");
        }

    }
