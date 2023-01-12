package J06DefiningClasses.Exercise.P07Google;


import java.util.List;

public class Person {
    private String name;
    private List<Pokemon> pokemonList;
    private List<Parent> parentList;
    private List<Children> childrenList;
    private Company company;
    private Car car;


    public Person(String name, List<Pokemon> pokemonList, List<Parent> parentList, List<Children> childrenList) {
        this.name = name;
        this.pokemonList = pokemonList;
        this.parentList = parentList;
        this.childrenList = childrenList;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public List<Parent> getParentList() {
        return parentList;
    }

    public List<Children> getChildrenList() {
        return childrenList;
    }

    public void printFormat() {
        System.out.println(name);
        System.out.println("Company:");
        if (company != null) {
            System.out.println(company.toString());
        }
        System.out.println("Car:");
        if (car != null) {
            System.out.println(car.toString());
        }
        System.out.println("Pokemon:");
        if (!getPokemonList().isEmpty()) {
            getPokemonList().forEach(pokemon -> System.out.printf("%s%n", pokemon.format()));
        }
        System.out.println("Parents:");
        if (!getParentList().isEmpty()) {
            getParentList().forEach(parent -> System.out.printf("%s%n", parent.format()));
        }
        System.out.println("Children:");
        if (!getChildrenList().isEmpty()) {
            getChildrenList().forEach(children -> System.out.printf("%s%n", children.format()));
        }
    }
}