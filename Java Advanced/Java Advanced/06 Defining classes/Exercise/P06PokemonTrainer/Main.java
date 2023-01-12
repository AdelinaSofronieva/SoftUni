package J06DefiningClasses.Exercise.P06PokemonTrainer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Trainer> trainersMap = new LinkedHashMap<>();

        String inputData = scanner.nextLine();
        while (!inputData.equals("Tournament")) {
            String[] dataArr = inputData.split("\\s+");

            String trainerName = dataArr[0];
            String pokemonName = dataArr[1];
            String pokemonElement = dataArr[2];
            int pokemonHealth = Integer.parseInt(dataArr[3]);

            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);

            if (!trainersMap.containsKey(trainerName)) {
                trainersMap.put(trainerName, new Trainer(trainerName));
            }


            trainersMap.get(trainerName).addPokemon(pokemon);


            inputData = scanner.nextLine();
        }


        String element = scanner.nextLine();
        while (!element.equals("End")) {

            for (Map.Entry<String, Trainer> entry : trainersMap.entrySet()) {
                if (entry.getValue().pokeCollectionsSize() > 0) {
                    boolean havePokemon = false;
                    for (Pokemon pokemon : entry.getValue().getPokemons()) {
                        if (pokemon.getElement().equals(element)) {
                            havePokemon = true;
                            entry.getValue().setNumBadjes();
                            break;
                        }
                    }

                    if (!havePokemon) {
                        entry.getValue().missingPokemonPenalty();
                    }
                }
            }

            element = scanner.nextLine();
        }

        trainersMap.entrySet().stream()
                .sorted((f, s) -> Integer.compare(s.getValue().getNumBadjes(), f.getValue().getNumBadjes()))
                .forEach(trainer -> System.out.printf("%s %s %s%n",
                        trainer.getKey(),
                        trainer.getValue().getNumBadjes(),
                        trainer.getValue().pokeCollectionsSize()));
    }
}
