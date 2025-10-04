import java.util.*;

class Order {
    String item;
    int qty;
    Order(String item, int qty){ this.item=item; this.qty=qty; }
}

public class Restaurant {
    static Map<String, Integer> menu = Map.of("Pizza",10,"Burger",5,"Cola",2);
    static List<Order> orders = new ArrayList<>();

    public static void placeOrder(String item, int qty) {
        if(menu.containsKey(item)) orders.add(new Order(item, qty));
    }

    public static void bill() {
        int total = 0;
        for(Order o: orders) total += menu.get(o.item)*o.qty;
        System.out.println("Bill: $" + total);
    }

    public static void main(String[] args){
        placeOrder("Pizza",2);
        placeOrder("Cola",3);
        bill();
    }
}
