package project;

import java.util.*;

public class AgricultureManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for SensorData
        System.out.println("Enter soil moisture (%):");
        int soilMoisture = scanner.nextInt();
        System.out.println("Enter temperature (°C):");
        int temperature = scanner.nextInt();

        SensorData sensorData = new SensorData(soilMoisture, temperature);

        // User input for ImageData
        System.out.println("Enter image path:");
        scanner.nextLine();  // Consume the newline
        String imagePath = scanner.nextLine();

        ImageData imageData = new ImageData(imagePath);

        // Crop Monitoring
        CropMonitoring cropMonitoring = new CropMonitoring(sensorData, imageData);
        cropMonitoring.analyzeCropHealth();

        // User input for ResourceManagement
        System.out.println("Enter water usage (liters):");
        int waterUsage = scanner.nextInt();
        System.out.println("Enter fertilizer usage (kg):");
        int fertilizerUsage = scanner.nextInt();
        System.out.println("Enter pesticide usage (liters):");
        int pesticideUsage = scanner.nextInt();

        ResourceManagement resourceManagement = new ResourceManagement(waterUsage, fertilizerUsage, pesticideUsage);
        resourceManagement.optimizeResources();

        // User input for YieldForecasting
        System.out.println("Enter growth rate (%):");
        double growthRate = scanner.nextDouble();
        System.out.println("Enter expected yield (tons):");
        int expectedYield = scanner.nextInt();

        YieldForecasting yieldForecasting = new YieldForecasting(growthRate, expectedYield);
        yieldForecasting.forecastYield();

        scanner.close();
    }
}