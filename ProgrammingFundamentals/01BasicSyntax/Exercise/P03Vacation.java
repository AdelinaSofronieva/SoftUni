package F01BasicSyntax.Exercise;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numPeople = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double totalPrice = 0;

        if (typeOfGroup.equals("Students")) {
            if (dayOfWeek.equals("Friday")) {
                totalPrice = numPeople * 8.45;
            } else if (dayOfWeek.equals("Saturday")) {
                totalPrice = numPeople * 9.8;
            } else {
                totalPrice = numPeople * 10.46;
            }

            if (numPeople >= 30) {
                totalPrice = totalPrice - (totalPrice * 0.15);
            }
        }else if (typeOfGroup.equals("Business")) {

            if (numPeople >= 100) {
                numPeople -= 10;
            }
            if (dayOfWeek.equals("Friday")) {
                totalPrice = numPeople * 10.9;
            } else if (dayOfWeek.equals("Saturday")) {
                totalPrice = numPeople * 15.6;
            } else {
                totalPrice = numPeople * 16.0;
            }
        } else {
            if (dayOfWeek.equals("Friday")) {
                totalPrice = numPeople * 15.0;
            } else if (dayOfWeek.equals("Saturday")) {
                totalPrice = numPeople * 20.0;
            } else {
                totalPrice = numPeople * 22.5;
            }

            if (numPeople >= 10 && numPeople <= 20) {
                totalPrice = totalPrice - (totalPrice * 0.05);
            }
        }



        System.out.printf("Total price: %.2f", totalPrice);
    }
}
