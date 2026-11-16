public class Main {

    public static void main(String[] args) {
        OrderCalculator calculator = new OrderCalculator();
        OrderRepository repository = new OrderRepository();
        EmailSender emailSender = new EmailSender();

        int total = calculator.calculateTotal(3000, 2);

        repository.saveOrder("Наушники", total);
        emailSender.sendEmail("buy@example.com", total);
    }
}