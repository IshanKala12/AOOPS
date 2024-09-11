package week3;

class CreditCardPaymentFactory implements PaymentMethodFactory {
    @Override
    public PaymentMethod createPaymentMethod() {
        return new CreditCardPayment();
    }
}