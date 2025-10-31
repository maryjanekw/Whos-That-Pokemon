package com.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PokedexManager {
// shuffles the Pokédex at the beginning of the game to avoid repeat questions

    // variables
    private List<Pokemon> shuffledPokedex;
    private int currentIndex = 0;

    // constructor
    public PokedexManager(List<Pokemon> pokedex) {
        this.shuffledPokedex = new  ArrayList<>(pokedex); // makes copy of pokedex to shuffle
        Collections.shuffle(this.shuffledPokedex); // will shuffle once to avoid repeating dexEntry
    }

    public boolean hasNext(){
        return currentIndex < shuffledPokedex.size();
    }

    // next question for Challenge Mode
    public ChallengeMode getNextChallengeQuestion(){
        if (hasNext()) {
            Pokemon nextPokemon = shuffledPokedex.get(currentIndex++);
            return new ChallengeMode(nextPokemon);
        }else {
            return null;
        }
    }

    // next question for Multiple Choice
    public MultiChoiceQuiz getNextMultiChoiceQuestion(List<Pokemon> fullPokedex){
        if (hasNext()){
            Pokemon correctPokemon = shuffledPokedex.get(currentIndex++);
            return new MultiChoiceQuiz(correctPokemon, fullPokedex);
        }else {
            return null;
        }
    }

    // when reset game Pokédex will suffle again
    public void reset() {
        currentIndex = 0;
        Collections.shuffle(shuffledPokedex);
    }
}
