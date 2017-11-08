package com.example.aluno_uffs.aula2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by aluno-uffs on 07/11/17.
 */

public class SpellbookAdapter extends BaseAdapter {

    Context context;

    public SpellbookAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return Spellbook.getInstance().spells.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return new SpellView(
                this.context,
                Spellbook.getInstance().spells.get(position));
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return Spellbook.getInstance().spells.get(position);
    }


}
