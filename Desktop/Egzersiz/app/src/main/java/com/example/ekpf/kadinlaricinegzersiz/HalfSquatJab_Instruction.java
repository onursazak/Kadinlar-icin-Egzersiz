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

public class HalfSquatJab_Instruction extends android.support.v4.app.Fragment {
    TextView half_squat_jab_txt;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.half_squat_jab_ins_layout,container,false);

        half_squat_jab_txt=(TextView)v.findViewById(R.id.halfSquatJab_txt);
        half_squat_jab_txt.setText("\n" +
                "\t\t\tHalf Squat Jab (Yarım Squat ve Yumruk ) Hareketi\n" +
                "\n" +
                "1 -Ayaklar omuz genişliğinde açılır.Dizler biraz bükük ve kalça yere yakın olacak şekilde pozisyon alınır.\n" +
                "2- Eller yumruk yapılıp çene hizasında tutulur.\n" +
                "3-Sol kolla çene hizası bozulmadan yumruk atılır ve başlangıç pozisyonuna geri dönülür.\n" +
                "4-Aynısı sağ kol için yapılır ve hızlı bir şekilde eller değiştirilmeye devam edilir.\n");

        return  v;
    }
}
