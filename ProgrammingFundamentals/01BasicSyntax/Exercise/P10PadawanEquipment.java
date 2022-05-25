package F01BasicSyntax.Exercise;

import java.util.Scanner;

public class P10PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountMoney = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double priceLightsablers = Double.parseDouble(scanner.nextLine());
        double priceRobes = Double.parseDouble(scanner.nextLine());
        double priceBelts = Double.parseDouble(scanner.nextLine());

        double calculatedPrice = 0;
        double allLightSabersPrice = priceLightsablers * (Math.ceil(countStudents + (countStudents * 0.1)));
        double allRobesPrice = priceRobes * countStudents;
        countStudents = countStudents - (countStudents / 6);
        double allLightBeltsPrice = priceBelts * countStudents;

        calculatedPrice = allLightSabersPrice + allRobesPrice + allLightBeltsPrice;

        if (calculatedPrice <= amountMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.", calculatedPrice);
        } else {
            calculatedPrice -= Math.abs(amountMoney);
            System.out.printf("George Lucas will need %.2flv more.", calculatedPrice);
        }

    }
}
