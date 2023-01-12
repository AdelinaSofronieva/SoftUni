package J04InterfacesAndAbstraction.Exercise.person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Class[] citizenInterfaces = Citizen.class.getInterfaces();
//        if(Arrays.asList(citizenInterfaces).contains(Person.class)){
//            Method[] fields = Person.class.getDeclaredMethods();
//            Scanner scanner = new Scanner(System.in);
//            String name = scanner.nextLine();
//            int age = Integer.parseInt(scanner.nextLine());
//            Person J04InterfacesAndAbstraction.Exercise.person = new Citizen(name,age);
//            System.out.println(fields.length);
//            System.out.println(J04InterfacesAndAbstraction.Exercise.person.getName());
//            System.out.println(J04InterfacesAndAbstraction.Exercise.person.getAge());
//        }

//        Class[] citizenInterfaces = Citizen.class.getInterfaces();
//        if (Arrays.asList(citizenInterfaces).contains(Birthable.class)
//                && Arrays.asList(citizenInterfaces).contains(Identifiable.class)) {
//            Method[] methods = Birthable.class.getDeclaredMethods();
//            Method[] methods1 = Identifiable.class.getDeclaredMethods();
//            Scanner scanner = new Scanner(System.in);
//            String name = scanner.nextLine();
//            int age = Integer.parseInt(scanner.nextLine());
//            String id = scanner.nextLine();
//            String birthDate = scanner.nextLine();
//            Identifiable identifiable = new Citizen(name, age, id, birthDate);
//            Birthable birthable = new Citizen(name, age, id, birthDate);
//            System.out.println(methods.length);
//            System.out.println(methods[0].getReturnType().getSimpleName());
//            System.out.println(methods1.length);
//            System.out.println(methods1[0].getReturnType().getSimpleName());
//
//        }

        Scanner scanner = new Scanner(System.in);
        List<Birthable> birthableList = new ArrayList<>();

        String input = scanner.nextLine();
        while (!"End".equals(input)) {
            String[] dataArr = input.split("\\s+");
            String type = dataArr[0];

            switch (type){
                case "Citizen" :
                    String citizenName = dataArr[1];
                    int age = Integer.parseInt(dataArr[2]);
                    String citizenId = dataArr[3];
                    String citizenBirthDate= dataArr[4];
                    Citizen citizen = new Citizen(citizenName,age, citizenId, citizenBirthDate);
                    birthableList.add(citizen);
                    break;
                case "Pet" :
                    String petName = dataArr[1];
                    String petBirthDate = dataArr[2];
                    Pet pet = new Pet(petName, petBirthDate);
                    birthableList.add(pet);
                    break;
                case "Robot" :
                    break;
            }


            input = scanner.nextLine();
        }

        String searchedYear = scanner.nextLine();

        boolean containsSearchedYear = false;

        for (Birthable birthable : birthableList) {
            if (birthable.getBirthDate().endsWith(searchedYear)) {
                System.out.println(birthable.getBirthDate());
                containsSearchedYear = true;
            }
        }

        if (!containsSearchedYear) {
            System.out.println("<no output>");
        }
    }
}
