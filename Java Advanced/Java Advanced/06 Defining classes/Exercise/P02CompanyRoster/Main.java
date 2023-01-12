package J06DefiningClasses.Exercise.P02CompanyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Department> departmentList = new ArrayList<>();

        while (n-- > 0) {
            String[] inputData = scanner.nextLine().split("\\s+");
            String name = inputData[0];
            double salary = Double.parseDouble(inputData[1]);
            String position = inputData[2];
            String employeeDepartment = inputData[3];

            Employee employee = null;
            switch (inputData.length) {
                case 4:
                    employee = new Employee(name, salary, position, employeeDepartment);
                    break;
                case 5:
                    if (inputData[4].contains("@")) {
                        String email = inputData[4];
                        employee = new Employee(name, salary, position, employeeDepartment, email);
                    } else {
                        int age = Integer.parseInt(inputData[4]);
                        employee = new Employee(name, salary, position, employeeDepartment, age);
                    }
                    break;
                case 6:
                    String email = inputData[4];
                    int age = Integer.parseInt(inputData[5]);
                    employee = new Employee(name, salary, position, employeeDepartment, email, age);
                    break;
            }

            boolean departmentExists = departmentList
                    .stream()
                    .anyMatch(currDepartment -> currDepartment.getName().equals(employeeDepartment));

            if (!departmentExists) {
                Department department = new Department(employeeDepartment);
                departmentList.add(department);
            }

            Department currentDepartment = departmentList
                    .stream()
                    .filter(dep -> dep.getName().equals(employeeDepartment))
                    .findFirst()
                    .get();


            currentDepartment.getEmployees().add(employee);
        }

        Department highestPaidDepartment = departmentList
                .stream()
                .max(Comparator.comparingDouble(Department::calculateAverageSalary))
                .get();

        System.out.printf("Highest Average Salary: %s%n", highestPaidDepartment.getName());

        highestPaidDepartment.getEmployees()
                .stream()
                .sorted((first, second) -> Double.compare(second.getSalary(), first.getSalary()))
                .forEach(System.out::println);


    }
}
