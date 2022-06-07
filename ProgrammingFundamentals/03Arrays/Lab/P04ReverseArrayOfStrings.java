package F03Arrays.Lab;

import java.util.Scanner;

public class P04ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputElements = scanner.nextLine().split(" ");

        for (int i = 0; i < inputElements.length / 2; i++) {
            String oldElement = inputElements[i];
            inputElements[i] = inputElements[inputElements.length - 1 - i];
            inputElements[inputElements.length - 1 - i] = oldElement;
        }

        for (String currentElement: inputElements) {
            System.out.print(currentElement + " ");
        }

    }
}
