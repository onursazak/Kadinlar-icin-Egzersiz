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

public class HighKnees_Instruction extends android.support.v4.app.Fragment {
    TextView highKnee_tv;
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.high_knees_instruction,container,false);

        highKnee_tv = (TextView) v.findViewById(R.id.highknees_txt);
        highKnee_tv.setText("\t\t\tHigh Knees (Dizleri Bükük bir şekilde kaldırma)"+ "\n"+ "                                           Hareketi\n" +
                "\n" +
                "1-Bacaklar omuz genişliğinde açılarak dik durulur.İleriye bakılır ve göğüsler ileriye doğru çıkarılır.\n" +
                "2-Dizler bel seviyesine kadar yükseltilir ve yavaşça yere indirilir.\n" +
                "3-Set tamamlanana kadar tekrarlanır.\n" +
                "\n");


        return  v;
    }
}
