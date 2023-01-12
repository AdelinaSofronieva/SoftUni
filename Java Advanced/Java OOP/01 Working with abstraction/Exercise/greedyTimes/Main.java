
package J01WorkingWithAbstraction.Exercise.greedyTimes;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long input = Long.parseLong(scanner.nextLine());
        String[] safe = scanner.nextLine().split("\\s+");

        Map<String, LinkedHashMap<String, Long>> bag = new LinkedHashMap<>();
        long gold = 0;
        long gems = 0;
        long money = 0;

        for (int i = 0; i < safe.length; i += 2) {
            String name = safe[i];
            long count = Long.parseLong(safe[i + 1]);

            String itemType = "";

            if (name.length() == 3) {
                itemType = "Cash";
            } else if (name.toLowerCase().endsWith("gem")) {
                itemType = "Gem";
            } else if (name.toLowerCase().equals("gold")) {
                itemType = "Gold";
            }

            if (itemType.equals("")) {
                continue;
            } else if (input < bag.values().stream().map(Map::values).flatMap(Collection::stream).mapToLong(e -> e).sum() + count) {
                continue;
            }

            switch (itemType) {
                case "Gem":
                    if (checkIfCanPutInBag(bag, count, itemType, "Gold")) continue;
                    break;
                case "Cash":
                    if (checkIfCanPutInBag(bag, count, itemType, "Gem")) continue;
                    break;
            }

            if (!bag.containsKey(itemType)) {
                bag.put((itemType), new LinkedHashMap<String, Long>());
            }

            if (!bag.get(itemType).containsKey(name)) {
                bag.get(itemType).put(name, 0L);
            }


            bag.get(itemType).put(name, bag.get(itemType).get(name) + count);
            if (itemType.equals("Gold")) {
                gold += count;
            } else if (itemType.equals("Gem")) {
                gems += count;
            } else if (itemType.equals("Cash")) {
                money += count;
            }
        }

        for (var items : bag.entrySet()) {
            Long sumValues = items.getValue().values().stream().mapToLong(l -> l).sum();

            System.out.println(String.format("<%s> $%s", items.getKey(), sumValues));

            items.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));

        }
    }

    private static boolean checkIfCanPutInBag(Map<String, LinkedHashMap<String, Long>> bag, long count, String itemType, String gold2) {
        if (!bag.containsKey(itemType)) {
            if (bag.containsKey(gold2)) {
                if (count > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                    return true;
                }
            } else {
                return true;
            }
        } else if (bag.get(itemType).values().stream().mapToLong(e -> e).sum() + count > bag.get(gold2).values().stream().mapToLong(e -> e).sum()) {
            return true;
        }
        return false;
    }
}