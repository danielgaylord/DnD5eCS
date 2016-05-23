package com.example.pyrojackfrost.dnd5ecs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TabChar extends Fragment {

    Character chara;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        MainActivity activity = (MainActivity)getActivity();
        chara = activity.getChara();

        View v =inflater.inflate(R.layout.tab_char,container,false);

        ((TextView)v.findViewById(R.id.name_val)).setText(chara.getC_name());
        ((TextView)v.findViewById(R.id.race_val)).setText(chara.getC_race());
        ((TextView)v.findViewById(R.id.class_val)).setText(chara.getC_class());
        ((TextView)v.findViewById(R.id.level_val)).setText("" + chara.getC_level());
        ((TextView)v.findViewById(R.id.align_val)).setText(chara.getC_align());
        ((TextView)v.findViewById(R.id.background_val)).setText(chara.getC_bkgd());
        ((TextView)v.findViewById(R.id.faction_val)).setText(chara.getC_fact());
        ((TextView)v.findViewById(R.id.age_val)).setText(chara.getC_age());
        ((TextView)v.findViewById(R.id.height_val)).setText(chara.getC_height());
        ((TextView)v.findViewById(R.id.weight_val)).setText(chara.getC_weight());
        ((TextView)v.findViewById(R.id.eyes_val)).setText(chara.getC_eyes());
        ((TextView)v.findViewById(R.id.hair_val)).setText(chara.getC_hair());
        ((TextView)v.findViewById(R.id.skin_val)).setText(chara.getC_skin());
        ((TextView)v.findViewById(R.id.personality_val)).setText(chara.getC_person());
        ((TextView)v.findViewById(R.id.ideals_val)).setText(chara.getC_ideals());
        ((TextView)v.findViewById(R.id.bonds_val)).setText(chara.getC_bonds());
        ((TextView)v.findViewById(R.id.flaws_val)).setText(chara.getC_flaws());

        return v;
    }
}