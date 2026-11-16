public class MarketplaceGodObject {

    public int calculateTotal(int price, int quantity) {
        return price * quantity;
    }

    public void saveOrder(String product, int total) {
        System.out.println(
                "Сохранён заказ: " + product
                        + ", сумма: " + total + " руб."
        );
    }

    public void sendEmail(String email, int total) {
        System.out.println(
                "Письмо на " + email
                        + ": заказ оформлен на сумму "
                        + total + " руб."
        );
    }
}