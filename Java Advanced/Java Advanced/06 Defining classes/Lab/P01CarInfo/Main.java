package J06DefiningClasses.Lab.P01CarInfo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numCars = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numCars; i++) {
            String[] carsArr = scanner.nextLine().split("\\s+");
            String brand = carsArr[0];
            String model = carsArr[1];
            int horsePower = Integer.parseInt(carsArr[2]);

            Car car = new Car();

            car.setBrand(brand);
            car.setModel(model);
            car.setHorsePower(horsePower);

            System.out.println(car.carInfo());
        }
    }
}
