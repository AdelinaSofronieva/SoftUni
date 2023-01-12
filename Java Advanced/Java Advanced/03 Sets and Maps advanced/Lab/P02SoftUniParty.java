package J03SetsAndMapsAdvanced.Lab;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P02SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputReservationList = scanner.nextLine();

        Set<String> guestListVIP = new TreeSet<>();
        Set<String> guestListRegular = new TreeSet<>();

        while (!inputReservationList.equals("PARTY")) {
           //String firstLetter = String.valueOf(inputReservationList.charAt(0));
            //String firstLetter = Character.toString(inputReservationList.charAt(0));

            boolean isNumber = Character.isDigit(inputReservationList.charAt(0));
            if (isNumber) {
                guestListVIP.add(inputReservationList);
            } else {
                guestListRegular.add(inputReservationList);
            }

            inputReservationList = scanner.nextLine();
        }

        while (!inputReservationList.equals("END")) {

            boolean isNumber = Character.isDigit(inputReservationList.charAt(0));
            if (isNumber) {
                guestListVIP.remove(inputReservationList);
            } else {
                guestListRegular.remove(inputReservationList);
            }

            inputReservationList = scanner.nextLine();
        }

        System.out.println(guestListVIP.size() + guestListRegular.size());

        for (String guest : guestListVIP) {
            System.out.println(guest);
        }

        for (String guest : guestListRegular) {
            System.out.println(guest);
        }
    }
}
