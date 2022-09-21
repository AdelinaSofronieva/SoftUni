package F04Methods.Exercise;

import java.util.Scanner;

public class P08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNum = Integer.parseInt(scanner.nextLine());
        double secondNum = Integer.parseInt(scanner.nextLine());

        printFactorialDivision(firstNum, secondNum);
    }

    public static void printFactorialDivision (double firstNumFactorial, double secondNumFactorial) {
        double firstNumFacorial = findFactorial(firstNumFactorial);
        double secondNumFactoial = findFactorial(secondNumFactorial);

        double result = firstNumFacorial / secondNumFactoial;
        System.out.printf("%.2f", result);
    }

    public static double findFactorial(double num) {
        double numFactorial = 1;

            for (int i = 1; i <= num; i++) {
                numFactorial *= i;
            }

        return  numFactorial;
    }
}
