package com.example.aluno_uffs.aula2;

import java.util.ArrayList;

/**
 * Created by aluno-uffs on 07/11/17.
 */

public class Spellbook {

    ArrayList<Spell> spells;

    private Spellbook() {
        spells = new ArrayList<>();
    }

    private static Spellbook instance;

    public static Spellbook getInstance() {
        if(instance == null)
            instance = new Spellbook();
        return instance;
    }
}
