package F04Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        int secondNum = Integer.parseInt(scanner.nextLine());
        DecimalFormat df = new DecimalFormat("0.##");


        /// * + -
        switch (operator) {
            case '/' :
                System.out.println(df.format(printResultFromDivision(firstNum, secondNum)));
                break;
            case '*' :
                System.out.println(df.format(printResultFromMultiply(firstNum, secondNum)));
                break;
            case '+' :
                System.out.println(df.format(printResultFromAdd(firstNum, secondNum)));
                break;
            case '-' :
                System.out.println(df.format(printResultFromSubstract(firstNum, secondNum)));
                break;
        }
    }

    public static double printResultFromDivision (int firstNum, int secondNum){
        double result = firstNum / Double.valueOf(secondNum);

        return result;
    }

    public static double printResultFromMultiply (int firstNum, int secondNum){
        double result = firstNum * Double.valueOf(secondNum);

        return result;
    }

    public static double printResultFromAdd (int firstNum, int secondNum){
        double result = firstNum + Double.valueOf(secondNum);

        return result;
    }

    public static double printResultFromSubstract (int firstNum, int secondNum){
        double result = firstNum - Double.valueOf(secondNum);

        return result;
    }
}
