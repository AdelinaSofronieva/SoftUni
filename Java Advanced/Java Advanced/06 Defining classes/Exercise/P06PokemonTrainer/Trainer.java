package J06DefiningClasses.Exercise.P06PokemonTrainer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Trainer {
    private String name;
    private int numBadjes;
    private List<Pokemon> pokemons;

    public Trainer(String name) {
        this.name = name;
        this.numBadjes = 0;
        pokemons = new ArrayList<>();
    }

    public void addPokemon (Pokemon pokemon) {
        this.pokemons.add(pokemon);
    }

    public int pokeCollectionsSize() {
        return this.pokemons.size();
    }

    private UnaryOperator<Pokemon> damagePokemon = pokemon ->
            new Pokemon(pokemon.getName(), pokemon.getElement(), pokemon.getHealth() - 10);

    public void missingPokemonPenalty() {
        this.pokemons = this.pokemons.stream()
                .map(damagePokemon)
                .filter(pokemon -> pokemon.getHealth() > 0)
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return String.format("%s %s %s%n",
                this.name,
                this.numBadjes,
                this.pokemons.size());
    }

    public int getNumBadjes() {
        return numBadjes;
    }

    public void setNumBadjes() {
        this.numBadjes++;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
}
