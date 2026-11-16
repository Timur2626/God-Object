public class Main {

    public static void main(String[] args) {
        MarketplaceGodObject marketplace = new MarketplaceGodObject();

        int total = marketplace.calculateTotal(3000, 2);

        marketplace.saveOrder("Наушники", total);
        marketplace.sendEmail("buyer@example.com", total);
    }
}