package com.example.aluno_uffs.aula2;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by aluno-uffs on 07/11/17.
 */

public class SpellView extends LinearLayout {


    public SpellView(Context context, Spell spell) {
        super(context);

        LayoutInflater.from(context).inflate(
                R.layout.spell_layout,
                this);

        TextView texto = findViewById(R.id.id_spell_name);
        CheckBox checkBox = findViewById(R.id.id_spell_memo);

        texto.setText(spell.getName());
        checkBox.setChecked(spell.isMemorized());

    }

}
