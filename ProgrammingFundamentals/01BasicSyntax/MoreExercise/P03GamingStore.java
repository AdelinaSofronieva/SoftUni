package F01BasicSyntax.MoreExercise;

import java.util.Scanner;

public class P03GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentBallance = Double.parseDouble(scanner.nextLine());
        String game = scanner.nextLine();

        double totalBallance = currentBallance;

//        OutFall 4	$39.99
//        CS: OG	$15.99
//        Zplinter Zell	$19.99
//        Honored 2	$59.99
//        RoverWatch	$29.99
//        RoverWatch Origins Edition	$39.99

        while (!game.equals("Game Time")) {

            if (game.equals("OutFall 4")) {
                if (currentBallance >= 39.99) {
                    System.out.printf("Bought %s%n", game);
                    currentBallance -= 39.99;
                } else {
                    System.out.println("Too Expensive");
                }
            } else if (game.equals("CS: OG")) {
                if (currentBallance >= 15.99) {
                    System.out.printf("Bought %s%n", game);
                    currentBallance -= 15.99;
                } else {
                    System.out.println("Too Expensive");
                }
            } else if (game.equals("Zplinter Zell")) {
                if (currentBallance >= 19.99) {
                    System.out.printf("Bought %s%n", game);
                    currentBallance -= 19.99;
                } else {
                    System.out.println("Too Expensive");
                }
            } else if (game.equals("Honored 2")) {
                if (currentBallance >= 59.99) {
                    System.out.printf("Bought %s%n", game);
                    currentBallance -= 59.99;
                } else {
                    System.out.println("Too Expensive");
                }
            } else if (game.equals("RoverWatch")) {
                if (currentBallance >= 29.99) {
                    System.out.printf("Bought %s%n", game);
                    currentBallance -= 29.99;
                } else {
                    System.out.println("Too Expensive");
                }
            } else if (game.equals("RoverWatch Origins Edition")) {
                if (currentBallance >= 39.99) {
                    System.out.printf("Bought %s%n", game);
                    currentBallance -= 39.99;
                } else {
                    System.out.println("Too Expensive");
                }
            } else {
                System.out.println("Not Found");
            }

            if (currentBallance == 0) {
                System.out.println("Out of mo-ney!");
                break;
            }

            game = scanner.nextLine();
        }

        if (currentBallance > 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalBallance - currentBallance, currentBallance);
        }
    }
}
