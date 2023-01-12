package J05Polymorphism.Exercise.vehicles;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Vehicle> vehicleMap = new LinkedHashMap<>();

        vehicleMap.put("Car", createVehicle(scanner));
        vehicleMap.put("Truck", createVehicle(scanner));
        vehicleMap.put("Bus", createVehicle(scanner));

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        while (numberOfCommands-- > 0) {
            String[] commandData = scanner.nextLine().split("\\s+");
            String commandName = commandData[0];
            String vehicleType = commandData[1];
            double argument = Double.parseDouble(commandData[2]);

            switch (commandName) {
                case "DriveEmpty" :
                    System.out.println(vehicleMap.get(vehicleType).drive(argument));
                    break;
                case "Drive" :
                    System.out.println(vehicleMap.get(vehicleType).driveWithAC(argument));
                    break;
                case "Refuel" :
                    try {
                        vehicleMap.get(vehicleType).refuel(argument);
                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
            }
        }

        vehicleMap.values().forEach(System.out::println);

    }

    private static Vehicle createVehicle(Scanner scanner) {
        String[] vehicleData = scanner.nextLine().split("\\s+");
        String vehicleType = vehicleData[0];
        double fuelAmount = Double.parseDouble(vehicleData[1]);
        double fuelConsumption = Double.parseDouble(vehicleData[2]);
        double tankCapacity = Double.parseDouble(vehicleData[3]);

        switch (vehicleType) {
            case "Car" :
                return new Car(fuelAmount, fuelConsumption, tankCapacity);
            case "Truck" :
                return new Truck(fuelAmount, fuelConsumption, tankCapacity);
            case "Bus" :
                return new Bus(fuelAmount, fuelConsumption, tankCapacity);
            default:
                throw new IllegalArgumentException("Missing car");
        }

    }
}
