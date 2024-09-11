package week3;

class PayPalPaymentFactory implements PaymentMethodFactory {
    @Override
    public PaymentMethod createPaymentMethod() {
        return new PayPalPayment();
    }
}