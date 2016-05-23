package com.example.pyrojackfrost.dnd5ecs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TabStats extends Fragment {

    Character chara;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        MainActivity activity = (MainActivity)getActivity();
        chara = activity.getChara();

        View v =inflater.inflate(R.layout.tab_stats,container,false);

        int hdv = Integer.parseInt("" + chara.getC_hd().charAt(chara.getC_hd().length() - 1));
        hdv = hdv + ((chara.getC_level() - 1) * ((hdv / 2) + 1));
        hdv += (chara.getC_level() * ((chara.getC_con() - 10) / 2));

        ((TextView)v.findViewById(R.id.hp_val)).setText("" + hdv);
        ((TextView)v.findViewById(R.id.hd_val)).setText(chara.getC_level() + chara.getC_hd());
        ((TextView)v.findViewById(R.id.str_mod)).setText(String.format("%+d", ((chara.getC_str() - 10) / 2)));
        ((TextView)v.findViewById(R.id.str_val)).setText("" + chara.getC_str());
        ((TextView)v.findViewById(R.id.dex_mod)).setText(String.format("%+d", ((chara.getC_dex() - 10) / 2)));
        ((TextView)v.findViewById(R.id.dex_val)).setText("" + chara.getC_dex());
        ((TextView)v.findViewById(R.id.con_mod)).setText(String.format("%+d", ((chara.getC_con() - 10) / 2)));
        ((TextView)v.findViewById(R.id.con_val)).setText("" + chara.getC_con());
        ((TextView)v.findViewById(R.id.int_mod)).setText(String.format("%+d", ((chara.getC_int() - 10) / 2)));
        ((TextView)v.findViewById(R.id.int_val)).setText("" + chara.getC_int());
        ((TextView)v.findViewById(R.id.wis_mod)).setText(String.format("%+d", ((chara.getC_wis() - 10) / 2)));
        ((TextView)v.findViewById(R.id.wis_val)).setText("" + chara.getC_wis());
        ((TextView)v.findViewById(R.id.cha_mod)).setText(String.format("%+d", ((chara.getC_cha() - 10) / 2)));
        ((TextView)v.findViewById(R.id.cha_val)).setText("" + chara.getC_cha());
        ((TextView)v.findViewById(R.id.init_val)).setText(String.format("%+d", ((chara.getC_dex() - 10) / 2)));
        ((TextView)v.findViewById(R.id.prof_val)).setText(String.format("%+d", (((chara.getC_level() - 1) / 4) + 2)));
        ((TextView)v.findViewById(R.id.pp_val)).setText(String.format("%d", (10 + ((chara.getC_wis() - 10) / 2))));

        return v;
    }
}