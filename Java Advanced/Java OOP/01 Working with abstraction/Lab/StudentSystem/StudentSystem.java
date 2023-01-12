package J01WorkingWithAbstraction.Lab.StudentSystem;

import java.util.HashMap;
import java.util.Map;


public class StudentSystem {
    private Map<String, Student> repo;

    public StudentSystem() {
        this.repo = new HashMap<>();
    }

    public Map<String, Student> getRepo() {
        return this.repo;
    }

    public void parseCommand(String[] args) {
        String command = args[0];
        String name = args[1];

        if (command.equals("Create")) {
            int age = Integer.parseInt(args[2]);
            double grade = Double.parseDouble(args[3]);
            if (!repo.containsKey(name)) {
                Student student = new Student(name, age, grade);
                repo.put(name, student);
            }
        } else if (command.equals("Show")) {
            if (repo.containsKey(name)) {
                Student student = repo.get(name);
                StringBuilder studentInfo = new StringBuilder(String.format("%s is %s years old.", student.getName(), student.getAge()));

                if (student.getGrade() >= 5.00) {
                    studentInfo.append(" Excellent student.");
                } else if (student.getGrade() < 5.00 && student.getGrade() >= 3.50) {
                    studentInfo.append(" Average student.");
                } else {
                    studentInfo.append(" Very nice J03Inheritance.Exercise.J04InterfacesAndAbstraction.Exercise.person.");
                }

                System.out.println(studentInfo.toString());
            }
        }
    }
}
