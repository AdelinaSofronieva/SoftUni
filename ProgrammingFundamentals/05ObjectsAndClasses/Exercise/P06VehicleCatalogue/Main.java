package F08ObjectsAndClasses.Exercise.P06VehicleCatalogue;

import com.sun.source.tree.WhileLoopTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<VehicleCatalogue> inputVehicleCatalogueList = new ArrayList<>();
        double averageCarsHorsePower = 0.0;
        double averageTrucksHorsePower = 0.0;
        int sumCarsHorsePower = 0;
        int sumTrucksHorsePower = 0;
        int countCarsHorsePower = 0;
        int countTrucksHorsePower = 0;

        String inputVehicleCatalogue = scanner.nextLine();
        while (!inputVehicleCatalogue.equals("End")) {
            String[] inputVehicleCatalogueArr = inputVehicleCatalogue.split(" ");
            //{typeOfVehicle} {model} {color} {horsepower}
            String typeOfVehicle = inputVehicleCatalogueArr[0];
            //String typeOfVehiclechange = typeOfVehicle.substring(0, 1).toUpperCase() + typeOfVehicle.substring(1);
            //typeOfVehicle = typeOfVehiclechange;
            String model = inputVehicleCatalogueArr[1];
            String color = inputVehicleCatalogueArr[2];
            int horsepower = Integer.parseInt(inputVehicleCatalogueArr[3]);

            VehicleCatalogue currentVehicleInput = new VehicleCatalogue(typeOfVehicle, model, color, horsepower);
            inputVehicleCatalogueList.add(currentVehicleInput);

            inputVehicleCatalogue = scanner.nextLine();
        }

        String carOrTruckModel = scanner.nextLine();
        while (!carOrTruckModel.equals("Close the Catalogue")) {

            for (VehicleCatalogue item : inputVehicleCatalogueList) {
                if (carOrTruckModel.equals(item.getModel())) {
                    String typeOfVehiclechange = item.getTypeOfVehicle().substring(0, 1).toUpperCase() + item.getTypeOfVehicle().substring(1);
                    System.out.printf("Type: %s%n", typeOfVehiclechange);
                    System.out.printf("Model: %s%n", item.getModel());
                    System.out.printf("Color: %s%n", item.getColor());
                    System.out.printf("Horsepower: %d%n", item.getHorsepower());
                }
            }

            carOrTruckModel = scanner.nextLine();
        }

        boolean ifContainsCar = false;
        boolean ifContainsTruck = false;
        for (VehicleCatalogue item : inputVehicleCatalogueList) {
            if (item.getTypeOfVehicle().equals("car")) {
                sumCarsHorsePower += item.getHorsepower();
                countCarsHorsePower++;
                ifContainsCar = true;
            } else if (item.getTypeOfVehicle().equals("truck")) {
                sumTrucksHorsePower += item.getHorsepower();
                countTrucksHorsePower++;
                ifContainsTruck = true;
            }
        }

            if (ifContainsCar) {
                averageCarsHorsePower = sumCarsHorsePower / (countCarsHorsePower * 1.0);
            }

            if (ifContainsTruck) {
                averageTrucksHorsePower = sumTrucksHorsePower / (countTrucksHorsePower * 1.0);
            }

        System.out.printf("Cars have average horsepower of: %.2f.%n", averageCarsHorsePower);
        System.out.printf("Trucks have average horsepower of: %.2f.%n", averageTrucksHorsePower);

    }
}
