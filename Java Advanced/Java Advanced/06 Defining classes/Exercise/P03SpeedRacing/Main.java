package J06DefiningClasses.Exercise.P03SpeedRacing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Car> carsMap = new LinkedHashMap<>();

        while (n-- > 0) {
            String[] data = scanner.nextLine().split("\\s+");
            String model = data[0];
            double fuelAmount = Double.parseDouble(data[1]);
            double fuelCostFor1km = Double.parseDouble(data[2]);

            Car currentCar = new Car(model, fuelAmount, fuelCostFor1km);
            carsMap.put(model, currentCar);

        }

        String commands = scanner.nextLine();
        while (!commands.equals("End")) {
            String model = commands.split("\\s+")[1];
            int amountOfkm = Integer.parseInt(commands.split("\\s+")[2]);

            Car carToDrive = carsMap.get(model);
            carToDrive.calculateDistance(model, amountOfkm);

            commands = scanner.nextLine();
        }

        carsMap.values().forEach(System.out::println);
    }
}
