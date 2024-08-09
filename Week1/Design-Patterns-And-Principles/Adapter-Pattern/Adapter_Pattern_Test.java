public class Adapter_Pattern_Test {
    public static void main(String[] args) {
        // Create instances of the third-party gateways
        PayPalGateway payPalGateway = new PayPalGateway();
        StripeGateway stripeGateway = new StripeGateway();

        // Create adapters for the gateways
        PaymentProcessor payPalAdapter = new PayPalAdapter(payPalGateway);
        PaymentProcessor stripeAdapter = new StripeAdapter(stripeGateway);

        // Use the adapters to process payments
        payPalAdapter.processPayment(100.0);
        stripeAdapter.processPayment(250.0);
    }
}
