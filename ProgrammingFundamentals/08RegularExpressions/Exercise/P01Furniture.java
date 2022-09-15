package F11RegularExpressions.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        double totalSum = 0.0;
        List<String> furnitureList = new ArrayList<>();

        while (!inputLine.equals("Purchase")) {
            Pattern pattern = Pattern.compile(">>(?<furniture>[A-Za-z]+)<<(?<price>[\\d.]+)!(?<quantity>\\d+)");
            Matcher matcher = pattern.matcher(inputLine);

            while (matcher.find()) {
                String furniture = matcher.group("furniture");
                double currentPrice = Double.parseDouble(matcher.group("price"));
                double currentQuantity = Double.parseDouble(matcher.group("quantity"));

                furnitureList.add(furniture);
                totalSum += currentPrice * currentQuantity;
            }

            inputLine = scanner.nextLine();
        }

        System.out.println("Bought furniture:");
        furnitureList.forEach(furniture -> System.out.printf("%s%n", furniture));
        //System.out.println(String.join(System.lineSeparator(), furnitureList));
        System.out.printf("Total money spend: %.2f", totalSum);
    }
}
