package F02DataTypes.Exercise;

import java.util.Scanner;

public class P03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCourses = Integer.parseInt(scanner.nextLine());
        int capacityOfCourses = Integer.parseInt(scanner.nextLine());

        double courses = (double) numberOfCourses / capacityOfCourses;
        System.out.printf("%.0f", Math.ceil(courses));

    }
}
