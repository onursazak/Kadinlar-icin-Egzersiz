package com.example.ekpf.kadinlaricinegzersiz;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by onursazak on 11.12.2016.
 */

public class Donkeykicks_Instruction extends android.support.v4.app.Fragment {
    TextView donkey_tv;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.donkey_kick_ins_layout,container,false);
        donkey_tv = (TextView)v.findViewById(R.id.donkeykicks_ins_txt);
        donkey_tv.setText("           \t Donkey Kicks (Arkaya doğru tekme ) Hareketi \n\n" +
                "1-Diz çöküp eller yere koyulur.(Köpek pozisyonu)\n" +
                "2-Geriye doğru tekme atılır  ve kalça kasları sıkılır.\n" +
                "3-Dizler bükülür , bacak indirilir ve tekrarlanır.\n" +
                "4-Diğer bacak için aynısını yapılır.\n" +
                "\n");




        return  v;
    }

}
