public class OrderRepository {

    public void saveOrder(String product, int total) {
        System.out.println(
                "Сохранён заказ: " + product
                        + ", сумма: " + total + " руб."
        );
    }
}