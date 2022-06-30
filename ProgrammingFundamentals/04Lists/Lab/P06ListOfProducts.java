package F05Lists.Lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P06ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> produscts = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String currentProduct = scanner.nextLine();
            produscts.add(currentProduct);
        }

        Collections.sort(produscts);

//        for (int i = 0; i < produscts.size(); i++) {
//            System.out.printf("%d.%s%n", i + 1, produscts.get(i));
//        }

        int count = 1;
        for (String fruit: produscts) {
            System.out.printf("%d.%s%n", count, fruit);
            count++;
        }
    }
}
