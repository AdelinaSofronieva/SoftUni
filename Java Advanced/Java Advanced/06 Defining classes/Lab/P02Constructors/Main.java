package J06DefiningClasses.Lab.P02Constructors;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numCars = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numCars; i++) {
            String[] carsArr = scanner.nextLine().split("\\s+");
            String brand = carsArr[0];
            Car car;

            if (carsArr.length == 1) {
                car = new Car(brand);
            } else {
                String model = carsArr[1];
                int horsePower = Integer.parseInt(carsArr[2]);
                car = new Car(brand, model, horsePower);

            }

            System.out.println(car.carInfo());
        }
    }
}
