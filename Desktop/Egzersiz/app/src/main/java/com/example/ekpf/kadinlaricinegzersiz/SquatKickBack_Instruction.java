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

public class SquatKickBack_Instruction extends android.support.v4.app.Fragment  {
    TextView squat_kickback_tv;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.squat_kickback_ins_layout,container,false);

        squat_kickback_tv = (TextView) v.findViewById(R.id.squatkickback_txt);
        squat_kickback_tv.setText("\t\tSquat Kick Back (Squat ve Yana Tekme) Hareketi\n" +
                "\n" +
                "1- Bacaklar omuz genişliğinden biraz daha fazla açılarak squat yapılır.\n" +
                "2-Ayağa kalktıkça ağırlık bir bacağa verilir ve diğer bacakla tekme atılır.\n" +
                "3-Başlangıç pozisyonuna geri dönülür ve diğer tarafla hareket tekrarlanır.\n");


        return  v;
    }



}
