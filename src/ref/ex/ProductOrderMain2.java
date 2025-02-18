package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];
        orders[0] = createOrder("두부", 2000, 2);
        orders[1] = createOrder("김치", 5000, 1);
        orders[2] = createOrder("콜라", 1500, 2);

        printOrders(orders);
        int total = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + total);
    }

    static ProductOrder createOrder(String producName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = producName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder p : orders) {
            System.out.println("상품명: " + p.productName + ", 가격: " + p.price + ", 수량: " + p.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder p : orders) {
            totalAmount += p.price * p.quantity;
        }
        return totalAmount;
    }
}
