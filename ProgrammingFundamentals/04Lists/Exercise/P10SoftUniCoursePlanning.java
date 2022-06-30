package F05Lists.Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P10SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> initialScheduleLessons = Arrays.stream(scanner.nextLine()
                        .split(", "))
                .collect(Collectors.toList());

        String commands = scanner.nextLine();

        while (!commands.equals("course start")) {
            String currentCommand = commands.split(":")[0];
            String lessonTitle = commands.split(":")[1];

            switch (currentCommand) {
                case "Add" :
                    if (!ifExist(initialScheduleLessons, lessonTitle)) {
                        initialScheduleLessons.add(lessonTitle);
                    }
                    break;
                case "Insert" :
                    int index = Integer.parseInt(commands.split(":")[2]);
                    if (!ifExist(initialScheduleLessons, lessonTitle)) {
                        initialScheduleLessons.add(index, lessonTitle);
                    }
                    break;
                case "Remove" :
                    if (ifExist(initialScheduleLessons, lessonTitle)) {
                        initialScheduleLessons.remove(lessonTitle);
                        String exercise = lessonTitle + "-Exercise";
                        if (initialScheduleLessons.contains(exercise)) {
                            initialScheduleLessons.remove(exercise);
                        }
                    }
                    break;
                case "Swap" :
                    String seconLessonTitle = commands.split(":")[2];
                    if (ifExist(initialScheduleLessons, lessonTitle) && ifExist(initialScheduleLessons, seconLessonTitle)) {
                         int firstIndex = initialScheduleLessons.indexOf(lessonTitle);
                         int secondIndex = initialScheduleLessons.indexOf(seconLessonTitle);
                         Collections.swap(initialScheduleLessons, firstIndex, secondIndex);
                        String firstExercise = lessonTitle + "-Exercise";
                        String secondExercise = seconLessonTitle + "-Exercise";
                        if (initialScheduleLessons.contains(firstExercise)) {
//                            String lessonWithExercise = seconLessonTitle.split("-")[0];
//                            int indexOfLessonWithExercise = initialScheduleLessons.indexOf(lessonWithExercise);
//                            int indexOfExercise = initialScheduleLessons.indexOf(firstExercise);
//                            Collections.swap(initialScheduleLessons, indexOfExercise, indexOfLessonWithExercise + 1);
                            initialScheduleLessons.remove(firstExercise);
                            initialScheduleLessons.add(initialScheduleLessons.indexOf(lessonTitle) + 1, firstExercise);
                        } else if (initialScheduleLessons.contains(secondExercise)) {
                            initialScheduleLessons.remove(secondExercise);
                            initialScheduleLessons.add(initialScheduleLessons.indexOf(seconLessonTitle) + 1, secondExercise);
//                            String lessonWithExercise = seconLessonTitle.split("-")[0];
//                            int indexOfLessonWithExercise = initialScheduleLessons.indexOf(lessonWithExercise);
//                            int indexOfExercise = initialScheduleLessons.indexOf(secondExercise);
//                            Collections.swap(initialScheduleLessons, indexOfExercise, indexOfLessonWithExercise + 1);
                        }
                    }
                    break;
                case "Exercise" :
                    if (!ifExist(initialScheduleLessons, lessonTitle)) {
                        initialScheduleLessons.add(lessonTitle);
                        initialScheduleLessons.add(lessonTitle + "-Exercise");
                    } else {
                        if (!lessonTitle.contains("Exercise") && !initialScheduleLessons.contains(lessonTitle + "-Exercise")) {
                            initialScheduleLessons.add(initialScheduleLessons.indexOf(lessonTitle) + 1,lessonTitle+"-Exercise");
                        }
                    }
                    break;
            }

            commands = scanner.nextLine();
        }

        int lessonIndex = 1;
        for (String currentLessonTitle: initialScheduleLessons) {

            System.out.printf("%d.%s%n", lessonIndex, currentLessonTitle);
            lessonIndex++;
        }
    }

    public static boolean ifExist (List <String> initialScheduleLessons, String lessonTitle) {
        boolean exist = initialScheduleLessons.contains(lessonTitle);

        return exist;
    }
}
