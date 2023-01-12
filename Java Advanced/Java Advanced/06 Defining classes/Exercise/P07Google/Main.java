package J06DefiningClasses.Exercise.P07Google;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();

        Map<String, Person> personInfoMap = new LinkedHashMap<>();

        while (!inputLine.equals("End")) {
            String[] data = inputLine.split("\\s+");
            String name =  data[0];
            String classToAdd = data[1];
            Person person = null;

            personInfoMap.putIfAbsent(name,
                    new Person(name,new ArrayList<>(),new ArrayList<>(),new ArrayList<>()));

            switch (classToAdd) {
                case "company" :
                    String companyName = data[2];
                    String department = data[3];
                    double salary = Double.parseDouble(data[4]);
                    Company company= new Company(companyName, department, salary);
                    personInfoMap.get(name).setCompany(company);
                break;
                case "pokemon" :
                    String pokemonName = data[2];
                    String pokemonType= data[3];
                    Pokemon pokemon = new Pokemon(pokemonName,pokemonType);
                    personInfoMap.get(name).getPokemonList().add(pokemon);
                    break;
                case "parents" :
                    String parentName = data[2];
                    String parentBirthday = data[3];
                    Parent parent = new Parent(parentName, parentBirthday);
                    personInfoMap.get(name).getParentList().add(parent);
                    break;
                case "children" :
                    String childName = data[2];
                    String childBirthday = data[3];
                    Children child = new Children(childName, childBirthday);
                    personInfoMap.get(name).getChildrenList().add(child);
                    break;
                case "car" :
                    String carModel = data[2];
                    int carSpeed = Integer.parseInt(data[3]);
                    Car car = new Car(carModel, carSpeed);
                    personInfoMap.get(name).setCar(car);
                    break;
            }

            inputLine = scanner.nextLine();
        }
        
        String searchPerson = scanner.nextLine();

        personInfoMap.get(searchPerson).printFormat();
    }
}
