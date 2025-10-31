package com.project;

public class ChallengeMode extends Question{

    // constuctor - passes the chosen Pokémon fromm the PokédexManager
    public ChallengeMode(Pokemon pokemon){
        super(pokemon);
    }

    // Quiz time - prompt for challenge mode
    @Override
    protected String generatePrompt(){
        return "Who's that Pokemon?\n" + pokemon.getDexEntry();
    }

    // Answer checker
    @Override
    public boolean checkAnswer(String userAnswer){
        return userAnswer.equalsIgnoreCase(pokemon.getPokemonName());
    }
}
