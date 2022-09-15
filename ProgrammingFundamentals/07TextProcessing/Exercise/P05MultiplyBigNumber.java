package F10TextProcessing.Exercise;

import java.math.BigInteger;
import java.util.Scanner;

public class P05MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger bigNum = new BigInteger(scanner.nextLine());
        BigInteger multuplier = new BigInteger(scanner.nextLine());

        System.out.println(bigNum.multiply(multuplier));
    }
}
