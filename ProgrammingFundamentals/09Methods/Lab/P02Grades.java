package F04Methods.Lab;

import java.util.Scanner;

public class P02Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        printGrade(grade);
    }

    public static void printGrade(double grade) {
        if (grade >= 2.00 && grade <= 2.99) {
            System.out.printf("Fail");
        } else if (grade >= 3.00 && grade <= 3.49) {
            System.out.printf("Poor");
        }else if (grade >= 3.50 && grade <= 4.49) {
            System.out.printf("Good");
        }else if (grade >= 4.50 && grade <= 5.49) {
            System.out.printf("Very good");
        }else if (grade >= 5.50 && grade <= 6.00) {
            System.out.printf("Excellent");
        }
    }

}
