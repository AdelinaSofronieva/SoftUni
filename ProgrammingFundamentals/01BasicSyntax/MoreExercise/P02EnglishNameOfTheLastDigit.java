package F01BasicSyntax.MoreExercise;

import java.util.Scanner;

public class P02EnglishNameOfTheLastDigit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int lastDigit = num % 10;
        String textLastDigit = "";



        switch (lastDigit) {
            case 0:
                textLastDigit = "zero";
                break;
            case 1:
                textLastDigit = "one";
                break;
            case 2:
                textLastDigit = "two";
                break;
            case 3:
                textLastDigit = "three";
                break;
            case 4:
                textLastDigit = "four";
                break;
            case 5:
                textLastDigit = "five";
                break;
            case 6:
                textLastDigit = "six";
                break;
            case 7:
                textLastDigit = "seven";
                break;
            case 8:
                textLastDigit = "eight";
                break;
            case 9:
                textLastDigit = "nine";
                break;
        }

        System.out.println(textLastDigit);

    }
}
