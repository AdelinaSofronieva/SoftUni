package F04Methods.Lab;

import java.util.Scanner;

public class P04Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        //("add", "multiply", "subtract", "divide")
        switch (command) {
            case "add" :
                printAddResult(firstNum, secondNum);
                break;
            case "multiply" :
                printMutiplyResult(firstNum, secondNum);
                break;
            case "subtract" :
                printSubstractResult(firstNum, secondNum);
                break;
            case "divide" :
                printDivideResult(firstNum, secondNum);
                break;
        }
    }

    public static void printAddResult (int firstNum, int secondNum) {
        System.out.println(firstNum + secondNum);
    }

    public static void printMutiplyResult (int firstNum, int secondNum) {
        System.out.println(firstNum * secondNum);
    }

    public static void printSubstractResult (int firstNum, int secondNum) {
        System.out.println(firstNum - secondNum);
    }

    public static void printDivideResult (int firstNum, int secondNum) {
        System.out.println(firstNum / secondNum);
    }
}
