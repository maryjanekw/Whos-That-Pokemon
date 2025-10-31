package com.project;

import java.util.Collections;
import java.util.List;

public class PokedexManager {
// shuffles the Pokédex at the beginning of the game to avoid repeat questions

    // variables
    private List<Pokemon> shuffledPokedex;
    private int currentIndex = 0;

    // constructor
    public PokedexManager(List<Pokemon> pokedex) {
        this.shuffledPokedex = pokedex;
        Collections.shuffle(this.shuffledPokedex); // will shuffle once to avoid repeating dexEntry
    }

    public boolean hasNext(){
        return currentIndex < shuffledPokedex.size();
    }

    // when reset game Pokédex will suffle again
//    public void reset() {
//        currentIndex = 0;
//        Collections.shuffle(shuffledPokedex);
//    }
}
