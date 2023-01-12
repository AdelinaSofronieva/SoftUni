package J06DefiningClasses.Exercise.P05CarSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numEngine = Integer.parseInt(scanner.nextLine());
        List<Engine> enginesList = new ArrayList<>();

        while (numEngine-- > 0) {
            String[] inputData = scanner.nextLine().split("\\s+");
            String model = inputData[0];
            int power = Integer.parseInt(inputData[1]);
            String efficiency = "n/a";
            String displacement = "n/a";

            if (inputData.length == 3) {
                String displacementOrEfficiency = inputData[2];
                if (Character.isDigit(displacementOrEfficiency.charAt(0))) {
                    displacement = inputData[2];
                } else {
                    efficiency = inputData[2];
                }
            } else if (inputData.length == 4) {
                displacement = inputData[2];
                efficiency = inputData[3];
            }

            Engine engine = new Engine(model, power, displacement, efficiency);
            enginesList.add(engine);
        }

        int numCars = Integer.parseInt(scanner.nextLine());
        List<Car> carsList = new ArrayList<>();

        while (numCars-- > 0) {
            String[] inputData = scanner.nextLine().split("\\s+");
            String model = inputData[0];
            String engine = inputData[1];
            String weight = "n/a";
            String color = "n/a";

            if (inputData.length == 3) {
                String weightOrColor = inputData[2];
                if (Character.isDigit(weightOrColor.charAt(0))) {
                    weight = inputData[2];
                } else {
                    color = inputData[2];
                }
            } else if (inputData.length == 4) {
                weight = inputData[2];
                color = inputData[3];
            }

            Car car = new Car(model, engine, weight, color);
            carsList.add(car);
        }

        List<FullCar> fullCarList = new ArrayList<>();

        for (Car car : carsList) {
            String model = car.getModel();
            String engine = car.getEngine();
            int power = 0;
            String displacement = null;
            String efficiency = null;
            String weight = car.getWeight();
            String color = car.getColor();
            FullCar fullCar = new FullCar(model, engine, power, displacement, efficiency, weight, color);
            fullCarList.add(fullCar);
        }

        for (Engine engine : enginesList) {
            String engineModel = engine.getModel();
            int power = engine.getPower();
            String displacement = engine.getDisplacement();
            String efficiency = engine.getEfficiency();

            for (int i = 0; i < fullCarList.size(); i++) {
                FullCar currentFulCar = fullCarList.get(i);

                if (fullCarList.get(i).getEngine().equals(engineModel)) {
                    fullCarList.get(i).setPower(power);
                    fullCarList.get(i).setDisplacement(displacement);
                    fullCarList.get(i).setEfficiency(efficiency);
                }

                fullCarList.set(i, currentFulCar);
            }


        }

        fullCarList.forEach(System.out::println);

    }
}
