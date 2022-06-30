package F08ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05Students {
    //first name, last name, age, and hometown.
    static class Student {
        String firstName;
        String lastName;
        int age;
        String hometown;

        public String getFirstName() {
            return this.firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return this.age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getHometown() {
            return this.hometown;
        }

        public void setHometown(String hometown) {
            this.hometown = hometown;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        List<Student> studentList = new ArrayList<>();

        while (!inputLine.equals("end")) {
            String[] currentInputLine = inputLine.split(" ");
            String firstName = currentInputLine[0];
            String lastName = currentInputLine[1];
            int age = Integer.parseInt(currentInputLine[2]);
            String hometown = currentInputLine[3];

            Student currentStudent = new Student();

            currentStudent.setFirstName(firstName);
            currentStudent.setLastName(lastName);
            currentStudent.setAge(age);
            currentStudent.setHometown(hometown);

            studentList.add(currentStudent);

            inputLine = scanner.nextLine();
        }

        String cityName = scanner.nextLine();

        for (Student value : studentList) {
            if (cityName.equals(value.getHometown())) {
                System.out.printf("%s %s is %d years old%n",
                        value.getFirstName(),
                        value.getLastName(),
                        value.getAge());
            }
        }
    }
}
