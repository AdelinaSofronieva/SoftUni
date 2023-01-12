package J03SetsAndMapsAdvanced.Lab;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P01ParkingLot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        Set<String> carNumbersSet = new LinkedHashSet<>();

        while (!inputLine.equals("END")) {
            String command = inputLine.split(", ")[0];
            String currentCarNumber = inputLine.split(", ")[1];

            if (command.equals("IN")) {
                carNumbersSet.add(currentCarNumber);
            } else {
                carNumbersSet.remove(currentCarNumber);
            }

            inputLine = scanner.nextLine();
        }

//        if (carNumbersSet.size() == 0) {
//            System.out.println("Parking Lot is Empty");
//        } else {
//            for (String car : carNumbersSet) {
//                System.out.println(car);
//            }
//        }

        String printParkingLot = carNumbersSet.isEmpty() ?
                "Parking Lot is Empty" :
               String.join(System.lineSeparator(), carNumbersSet);

        System.out.println(printParkingLot);
    }
}
