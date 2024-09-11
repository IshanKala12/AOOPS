package week3;

class UPIPaymentFactory implements PaymentMethodFactory {
    @Override
    public PaymentMethod createPaymentMethod() {
        return new UPIPayment();
    }
}