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

public class PlankShoulder_Instruction extends android.support.v4.app.Fragment {


    TextView plank_shoulder_txt;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.plank_shoulder_ins_layout,container,false);

        plank_shoulder_txt=(TextView)v.findViewById(R.id.plankShoulder_txt);
        plank_shoulder_txt.setText("\n" +
                "\t\tPlank Shoulder Taps (Şınav Pozisyonunda Omuzlara Dokunma ) Hareketi\n" +
                "\n" +
                "1-Bacaklar kalça genişliğinde yere paralel ve avuç içleri yere değecek şekilde yerde durulur.\n" +
                "2-Sağ elle sol omuza dokunulur ve önceki pozisyona geri dönülür.\n" +
                "3-Sol elle sağ omuza dokunulur ve taraflar değiştirilerek harekete set bitene kadar devam edilir.\n");




        return  v;
    }
}
