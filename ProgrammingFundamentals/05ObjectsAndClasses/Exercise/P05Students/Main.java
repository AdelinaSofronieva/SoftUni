package F08ObjectsAndClasses.Exercise.P05Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Students> studentsList = new ArrayList<>();
        int numOfStudents = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= numOfStudents; i++) {
            String[] commandLine = scanner.nextLine().split(" ");
            String firstName = commandLine[0];
            String lastName = commandLine[1];
            double grade = Double.parseDouble(commandLine[2]);

            Students currentStudent = new Students(firstName, lastName, grade);
            studentsList.add(currentStudent);
        }

        studentsList.sort(Comparator.comparing(Students::getGrade).reversed());
        for (Students student: studentsList) {
            System.out.println(student);
        }
    }
}
