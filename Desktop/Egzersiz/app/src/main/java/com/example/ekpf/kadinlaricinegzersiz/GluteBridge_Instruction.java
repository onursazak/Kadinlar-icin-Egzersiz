package com.example.ekpf.kadinlaricinegzersiz;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by onursazak on 10.12.2016.
 */

public class GluteBridge_Instruction extends android.support.v4.app.Fragment {

    TextView glute_tv;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.glute_bridge_ins_layout,container,false);

        glute_tv=(TextView)v.findViewById(R.id.glute_bridge_ins_txt);
        glute_tv.setText("                            Glute Bridge Hareketi\n" +
                "\n" +
                "1-Eller yanda olacak şekilde ve dizler bükük olacak şekilde sırtüstü yatılır.\n" +
                "2-Sırt ve basenler kaldırılır ve 1 saniye bekletilir.\n" +
                "3-Başlangıç pozisyonuna dönülür  ve set tamamlanana kadar hareket tekrarlanır.\n");

        return  v;
    }
    }

