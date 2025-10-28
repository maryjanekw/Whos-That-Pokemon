package com.project;

public class Pokemon {

    // Variables
    private int dexNumber;
    private String dexEntry;
    private String pokemonName;
    private String type;

    public Pokemon(int dexNumber, String dexEntry, String pokemonName, String type) {
        this.dexNumber = dexNumber;
        this.dexEntry = dexEntry;
        this.pokemonName = pokemonName;
        this.type = type;
    }

    public int getDexNumber() {
        return dexNumber;
    }

    public String getDexEntry() {
        return dexEntry;
    }

    public String getPokemonName() {
        return pokemonName;
    }

    public String getType() {
        return type;
    }

}
