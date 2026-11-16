public class EmailSender {

    public void sendEmail(String email, int total) {
        System.out.println(
                "Письмо на " + email
                        + ": заказ оформлен на сумму "
                        + total + " руб."
        );
    }
}