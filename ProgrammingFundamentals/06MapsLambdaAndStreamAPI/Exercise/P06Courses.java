package F09MapsLambdaAndStreamAPI.Exercise;

import java.util.*;

public class P06Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputCourses = scanner.nextLine();
        Map<String, List<String>> coursesMap = new LinkedHashMap<>();

        while (!inputCourses.equals("end")) {
            String courseName = inputCourses.split(" : ")[0];
            String studentName = inputCourses.split(" : ")[1];

            if (!coursesMap.containsKey(courseName)) {
                coursesMap.put(courseName, new ArrayList<>());
                coursesMap.get(courseName).add("-- " + studentName);
            } else {
                coursesMap.get(courseName).add("-- " + studentName);
            }

            inputCourses = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : coursesMap.entrySet()) {
            System.out.printf("%s: %d%n%s%n", entry.getKey(), coursesMap.get(entry.getKey()).size(), String.join(System.lineSeparator(), entry.getValue()));
        }

    }
}
