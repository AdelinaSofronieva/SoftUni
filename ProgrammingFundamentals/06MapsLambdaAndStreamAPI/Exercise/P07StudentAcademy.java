package F09MapsLambdaAndStreamAPI.Exercise;

import java.util.*;

public class P07StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentsMap = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String currentStudent = scanner.nextLine();
            double currentGrade = Double.parseDouble(scanner.nextLine());

            if (studentsMap.containsKey(currentStudent)) {
                studentsMap.get(currentStudent).add(currentGrade);
            } else {
                studentsMap.put(currentStudent, new ArrayList<>());
                studentsMap.get(currentStudent).add(currentGrade);
            }
        }

        for (Map.Entry<String, List<Double>> entry : studentsMap.entrySet()) {
            double currentAverage = 0;
            int currentCount = studentsMap.get(entry.getKey()).size();
            Double sumGrades = entry.getValue().stream()
                    .reduce(0.0, Double::sum);
            currentAverage = sumGrades / currentCount;

            if (currentAverage >= 4.50) {
                System.out.printf("%s -> %.2f%n", entry.getKey(), currentAverage);
            }
        }

    }
}
