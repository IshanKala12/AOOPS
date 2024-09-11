package week3;

public class RideSharingApp {
    public static void main(String[] args) {
        
        UserAuthentication auth = UserAuthentication.getInstance();
        auth.login("john_doe", "password123");

        
        VehicleFactory vehicleFactory = VehicleFactory.getFactory("Car");
        Vehicle vehicle = vehicleFactory.createVehicle();
        vehicle.book();

        
        PaymentMethodFactory paymentFactory = new CreditCardPaymentFactory();
        PaymentMethod paymentMethod = paymentFactory.createPaymentMethod();
        paymentMethod.pay(250.0);

        
        auth.logout();
    }
}