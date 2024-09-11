package week3;

abstract class VehicleFactory {
    public abstract Vehicle createVehicle();

    public static VehicleFactory getFactory(String vehicleType) {
        switch (vehicleType) {
            case "Car":
                return new CarFactory();
            case "Bike":
                return new BikeFactory();
            case "Scooter":
                return new ScooterFactory();
            default:
                throw new IllegalArgumentException("Unknown vehicle type.");
        }
    }
}