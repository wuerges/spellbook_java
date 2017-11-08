package com.example.aluno_uffs.aula2;

/**
 * Created by aluno-uffs on 07/11/17.
 */

public class Spell {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    public boolean isMemorized() {
        return memorized;
    }

    public void setMemorized(boolean memorized) {
        this.memorized = memorized;
    }

    boolean memorized;

    public Spell(String name, boolean memo) {
        this.name = name;
        this.memorized = memo;
    }
}
