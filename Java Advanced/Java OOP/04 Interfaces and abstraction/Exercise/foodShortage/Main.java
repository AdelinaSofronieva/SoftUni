package J04InterfacesAndAbstraction.Exercise.foodShortage;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Buyer> bougth = new LinkedHashMap<>();

        while (n-- > 0) {
            String[] dataArr = scanner.nextLine().split("\\s+");
            String name = dataArr[0];
            int age = Integer.parseInt(dataArr[1]);
            Buyer buyer;

            if (dataArr.length == 4) {
                String id = dataArr[2];
                String birthDate = dataArr[3];
                buyer = new Citizen(name, age, id, birthDate);
            } else {
                String group = dataArr[2];
                buyer = new Rebel(name, age, group);
            }
            bougth.put(name, buyer);

        }

        String searchName = scanner.nextLine();
        int sum = 0;
        while (!searchName.equals("End")) {

                for (Map.Entry<String, Buyer> entry : bougth.entrySet()) {
                    if (entry.getKey().equals(searchName)) {
                        entry.getValue().buyFood();
                        int currentSum = entry.getValue().getFood();
                        sum += currentSum;
                    }
            }

            searchName = scanner.nextLine();
        }

        System.out.println(sum);
    }

}
