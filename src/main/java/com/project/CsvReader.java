package com.project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {

    private static final String fileName = "pokedex.csv";

    public List<Pokemon> getAllPokemon() {
        List<Pokemon> pokedex = new ArrayList<>();
        try (BufferedReader read = new BufferedReader(new FileReader(fileName))) {
            String pokemonInfo;
            while ((pokemonInfo = read.readLine()) != null) {
                String[] part = pokemonInfo.split("\\|");
                int dexNumber = Integer.parseInt(part[0]);
                String dexEntry = part[1].trim();
                String pokemonName = part[2].trim();
                String type = part[3].trim();
                Pokemon pokemon = new Pokemon(dexNumber, dexEntry, pokemonName, type);
            }
        } catch (IOException ex) {
            System.out.println("Error reading Pokemon file" + ex.getMessage());
        }
        return pokedex;
    }
}
