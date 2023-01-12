package J03SetsAndMapsAdvanced.Lab;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class P08AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentsMap = new TreeMap<>();

        for (int i = 1; i <= n; i++) {
            String name = scanner.nextLine();

            List<Double> grades = Arrays.stream(scanner.nextLine()
                            .split(" "))
                    .map(Double::parseDouble)
                    .collect(Collectors.toList());

            studentsMap.put(name, new ArrayList<>());
            studentsMap.get(name).addAll(grades);

        }

        studentsMap.entrySet().forEach(entry -> {
            double sum = 0;
            for (var value: entry.getValue()) {
                sum += value;
            }
            double average = sum / entry.getValue().size();
            DecimalFormat df = new DecimalFormat("0.##############################");

            System.out.printf("%s is graduated with ", entry.getKey());
            System.out.println(df.format(average));
        });
    }
}
