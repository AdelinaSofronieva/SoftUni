package J02Encapsulation.Exercise.ShoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] peopleDataArr = scanner.nextLine().split(";");
        String[] productsDataArr = scanner.nextLine().split(";");

        List<Person> peopleList = new ArrayList<>();
        List<Product> productsList = new ArrayList<>();

        for (int i = 0; i < peopleDataArr.length; i++) {
            String[] currentPerson = peopleDataArr[i].split("=");
            String name = currentPerson[0];
            double money = Double.parseDouble(currentPerson[1]);

            try {
                Person personToAdd = new Person(name,money);
                peopleList.add(personToAdd);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        for (int i = 0; i < productsDataArr.length; i++) {
            String[] currentProduct = productsDataArr[i].split("=");
            String name = currentProduct[0];
            double cost = Double.parseDouble(currentProduct[1]);

            try {
                Product productToAdd = new Product(name, cost);
                productsList.add(productToAdd);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        String inputLine = scanner.nextLine();
        while (!inputLine.equals("END")) {
            String personName = inputLine.split("\\s+")[0];
            String productName = inputLine.split("\\s+")[1];

            for (Person person : peopleList) {
                if (person.getName().equals(personName)) {
                    for (Product product : productsList) {
                       if (product.getName().equals(productName)) {
                            person.buyProduct(product);
                        }
                    }
                }
            }
            inputLine = scanner.nextLine();
        }

        for (Person person : peopleList) {
            System.out.println(person);
        }
    }
}
