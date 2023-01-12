package J06DefiningClasses.Exercise.P04RawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Car> carsList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String[] inputData = scanner.nextLine().split("\\s+");
            String model = inputData[0];
            int engineSpeed = Integer.parseInt(inputData[1]);
            int enginePower = Integer.parseInt(inputData[2]);
            int cargoWeight = Integer.parseInt(inputData[3]);
            String cargoType = inputData[4];
            double tirePressure1 = Double.parseDouble(inputData[5]);
            int tire1Age = Integer.parseInt(inputData[6]);
            double tirePressure2 = Double.parseDouble(inputData[7]);
            int tire2Age = Integer.parseInt(inputData[8]);
            double tirePressure3 = Double.parseDouble(inputData[9]);
            int tire3Age = Integer.parseInt(inputData[10]);
            double tirePressure4 = Double.parseDouble(inputData[11]);
            int tire4Age = Integer.parseInt(inputData[12]);


            Car car = new Car(model, enginePower, cargoType, tirePressure1, tirePressure2, tirePressure3, tirePressure4);
            carsList.add(car);

        }

        String command = scanner.nextLine();

        if (command.equals("flamable")) {
            Car.carIsFlamable(carsList);
        } else {
            Car.carIsFragile(carsList);
        }
    }
}
