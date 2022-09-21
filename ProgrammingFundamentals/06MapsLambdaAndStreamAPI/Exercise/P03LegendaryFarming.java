package F09MapsLambdaAndStreamAPI.Exercise;

import java.util.*;

public class P03LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        Map<String, Integer> farmingMap = new LinkedHashMap<>();
        farmingMap.put("shards", 0);
        farmingMap.put("fragments", 0);
        farmingMap.put("motes", 0);
        Map<String, Integer> farmingJunkMap = new LinkedHashMap<>();

        boolean isMaterialEnough = false;

        while (true) {
            String[] currentInputLine = inputLine.split(" ");
            for (int i = 0; i < currentInputLine.length; i += 2) {

                Integer currentQuantity = Integer.parseInt(currentInputLine[i]);
                String currentMaterial = currentInputLine[i + 1].toLowerCase();


                if (currentMaterial.toLowerCase().equals("shards") || currentMaterial.toLowerCase().equals("fragments") ||
                        currentMaterial.toLowerCase().equals("motes")) {

                    Integer currentQuantityCount = farmingMap.get(currentMaterial);
                    if (currentQuantityCount == null) {
                        currentQuantityCount = 0;
                    }

                    farmingMap.put(currentMaterial, currentQuantity + currentQuantityCount);

                    if (farmingMap.get(currentMaterial) >= 250) {
                        if (currentMaterial.equals("shards")) {
                            System.out.print("Shadowmourne");
                        } else if (currentMaterial.equals("fragments")) {
                            System.out.print("Valanyr");
                        } else {
                            System.out.print("Dragonwrath");
                        }
                        System.out.println(" obtained!");
                        farmingMap.put(currentMaterial, farmingMap.get(currentMaterial) - 250);
                        isMaterialEnough = true;

                    }
                } else {
                    Integer currentQuantityCount = farmingJunkMap.get(currentMaterial);
                    if (currentQuantityCount == null) {
                        currentQuantityCount = 0;
                    }

                    farmingJunkMap.put(currentMaterial, currentQuantity + currentQuantityCount);
                }
                if (isMaterialEnough) {
                    break;
                }
            }
            if (isMaterialEnough) {
                break;
            }

            inputLine = scanner.nextLine();

        }

                        for (Map.Entry<String, Integer> entry : farmingMap.entrySet()) {
                            Integer currentQuantityCount = entry.getValue();
                            if (currentQuantityCount == null) {
                                currentQuantityCount = 0;
                            }
        }


        farmingMap.entrySet()
                .stream()
                //.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
//                .map(entry -> {
//                    if (entry.getValue() == null)
//                        entry.setValue(0);
//                    return entry;})
                //.sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .forEach(e -> System.out.printf("%s: %d%n", e.getKey().toLowerCase(), e.getValue()));


//                for (Map.Entry<String, Integer> entry : farmingMap.entrySet()) {
//            System.out.printf("%s: %d%n", entry.getKey().toLowerCase(), entry.getValue());
//        }
//
        for (Map.Entry<String, Integer> entry : farmingJunkMap.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey().toLowerCase(), entry.getValue());
        }
    }
}
