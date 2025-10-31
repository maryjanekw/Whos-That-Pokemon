package com.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MultiChoiceQuiz extends Question{

    // variable - multiple choice answers
    private List<String> choices;

    public MultiChoiceQuiz(Pokemon correctPokemon, List<Pokemon> pokedex){
        super(correctPokemon); //generated the correct answer from Question
        this.choices = generateChoices(correctPokemon, pokedex);
    }

    // Quiz time - quiz prompt
    @Override
    protected String generatePrompt(){
        return "Who's that Pokemon?\n" + pokemon.getDexEntry();
    }

    // generates correct answer + 3 random
    private List<String>generateChoices(Pokemon correct, List<Pokemon> pokedex){
        List<String> options = new ArrayList<>();
        options.add(correct.getPokemonName()); // gathers correct answer first

        // add 3 random Pokémon to the answer poll
        Random random =new Random();
        while (options.size() < 4){
            Pokemon canidate = pokedex.get(random.nextInt(pokedex.size()));
            String name = canidate.getPokemonName();
            if (!options.contains(name)){
                options.add(name);
            }
        }
        // randomize answer poll
        Collections.shuffle(options);
        return options;
    }

    // answer checker
    @Override
    public boolean checkAnswer(String userAnswer) {
        return userAnswer.equalsIgnoreCase(pokemon.getPokemonName());
    }

    // getter
    public List<String> getChoices(){
        return choices;
    }
}
