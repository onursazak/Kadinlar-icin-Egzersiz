package com.example.ekpf.kadinlaricinegzersiz;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by onursazak on 13.12.2016.
 */

public class BearWalks_Instruction extends android.support.v4.app.Fragment {

    TextView bear_walk_txt;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.bear_walks_ins_layout,container,false);

        bear_walk_txt=(TextView)v.findViewById(R.id.bearWalks_txt);
        bear_walk_txt.setText("\t\t\tBear Walk (Ayı Yürüyüşü) Hareketi\n" +
                "\n" +
                "1- Sırt düz ve dizler hafif bükük olacak şekilde ellerin ve ayakların üzerinde yerde durulur.\n" +
                "2- Sağ el ve sol ayak kullanılarak ileriye doğru yürünür.\n" +
                "3-Sol el ve sağ ayak kullanılarak aynı şekilde yürünür.\n" +
                "4-Set bitene kadar hareket tekrarlanır.\n" +
                "\n");




        return  v;
    }
}
