package F02DataTypes.Lab;

import java.util.Scanner;

public class P05ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        String delimiter = scanner.nextLine();

        String result = String.format("%s%s%s", firstName, delimiter, lastName);
        System.out.println(result);
    }
}
