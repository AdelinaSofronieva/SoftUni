package F02DataTypes.MoreEcercise;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class P03FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNum = Double.parseDouble(scanner.nextLine());
        double secondNum = Double.parseDouble(scanner.nextLine());

        double eps = 0.000001;
        double difference = Math.abs(firstNum - secondNum);

        if (difference >= eps) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }

       // BigDecimal firstNum = new BigDecimal(scanner.nextLine());
       // BigDecimal secondNum = new BigDecimal(scanner.nextLine());
//
       // BigDecimal difference = new BigDecimal(0);
       // difference = firstNum.subtract(secondNum);
       // difference = difference.abs();
       // BigDecimal eps = new BigDecimal(0);
       // eps = eps.add(BigDecimal.valueOf(0.000001));
       // System.out.println(difference);
       // System.out.println(eps);
//
       // if (difference.equals(eps)) {
       //     System.out.println("Border case. The difference 0.0000001== eps. We consider the numbers are different.");
       // } else {
       //     System.out.println("The difference of " + difference + " is too big (> eps)");
       // }

    }
}
