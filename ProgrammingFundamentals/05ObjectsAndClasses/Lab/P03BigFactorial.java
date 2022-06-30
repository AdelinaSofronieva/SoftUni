package F08ObjectsAndClasses.Lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class P03BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        BigDecimal numFact = new BigDecimal(1);

        for (int i = 1; i <= n; i++) {
            numFact = numFact.multiply(BigDecimal.valueOf(i));
        }

        System.out.println(numFact);
    }
}
