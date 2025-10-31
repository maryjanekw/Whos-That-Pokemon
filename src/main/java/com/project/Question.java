package com.project;

import java.util.List;
import java.util.Random;

public abstract class Question {

    // variables
    protected Pokemon pokemon; // the Pokémon this question is about "answer"
    protected String prompt; // the question "Who's that Pokémon?"

    // constructor
    public Question(Pokemon pokemon) {
        this.pokemon = pokemon;
        this.prompt = generatePrompt();
    }

    // generated pokedex entry - question
    protected abstract String generatePrompt();

    // answer checker
    public abstract boolean checkAnswer(String userAnswer);

    // getters
    public Pokemon getPokemon() { return pokemon; }

    public String getPrompt() { return prompt; }
}
