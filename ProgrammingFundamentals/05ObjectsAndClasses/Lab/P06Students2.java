package F08ObjectsAndClasses.Lab;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06Students2 {
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


        Student (String firstName, String lastName, int age, String hometown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
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

            if (isStudentExisting(studentList, firstName,lastName)) {
                Student currentStudent = getStudent(studentList, firstName,lastName, age, hometown);
            } else {
                Student currentStudent = new Student(firstName, lastName, age, hometown);
                studentList.add(currentStudent);
            }


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

    public static boolean isStudentExisting (List<Student> studentList, String firstName, String lastName) {
        for (Student currentStudent: studentList) {
            if (currentStudent.getFirstName().equals(firstName) && currentStudent.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }

    private static Student getStudent(List<Student> studentList, String firstName, String lastName, int age, String hometown) {
        Student existingStudent = null;
        for (Student student : studentList) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                existingStudent = student;
                existingStudent.age = age;
                existingStudent.hometown = hometown;
            }
        }
        return existingStudent;
    }
}