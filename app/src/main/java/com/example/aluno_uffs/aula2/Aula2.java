package com.example.aluno_uffs.aula2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Aula2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula2);

        final Button meu_botao = findViewById(R.id.id_do_botao);
        final ListView minha_lista = findViewById(R.id.id_da_lista);


        Spellbook.getInstance().spells.add(
                new Spell("Avada Kedavra", false)
                );
        Spellbook.getInstance().spells.add(
                new Spell("Fireball", true)
        );


        SpellbookAdapter adaptador = new SpellbookAdapter(this);
        minha_lista.setAdapter(adaptador);

    }
}
