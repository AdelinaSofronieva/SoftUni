package J03SetsAndMapsAdvanced.Lab;

import java.util.*;

public class P05AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentsMap = new TreeMap<>();
        while (n-- > 0) {
            String[] inputLine = scanner.nextLine().split("\\s+");
            String name = inputLine[0];
            double grade = Double.parseDouble(inputLine[1]);

            studentsMap.putIfAbsent(name, new ArrayList<>());
            studentsMap.get(name).add(grade);
        }

        studentsMap.entrySet()
                .forEach(entry -> {
                    double sum = 0;
                    for (int i = 0; i < entry.getValue().size(); i++) {
                        sum += entry.getValue().get(i);
                    }
                    double averageSum = sum / entry.getValue().size();
                    System.out.print(entry.getKey() + " -> ");
                    entry.getValue().forEach(currentGrade -> System.out.printf("%.2f ", currentGrade));
                    System.out.printf("(avg: %.2f)%n", averageSum);
                });

    }
}
