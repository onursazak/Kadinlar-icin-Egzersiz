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

public class SideShuffle_Instruction extends android.support.v4.app.Fragment {
    TextView sideShuffle_tv;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.side_shuffle_ins_layout,container,false);
        sideShuffle_tv = (TextView)v.findViewById(R.id.sideshuffle_ins_txt);
        sideShuffle_tv.setText(
                "\t\t\t\tSide Shuffle (Dizleri Büküp Ayaklara Doğru Eğilme) \n"+"                                                Hareketi\n\n" +
                "1-Ayaklar basen genişliğinden biraz daha fazla açarak ayakta kalınır , kalçalar ve dizler geriye doğru bükülür ve parmakların yönü ileri doğru çevirilir.\n" +
                "2-Sola doğru hızlı bir adım atılır  ve sol ayağa sol el ile  dokunulur.\n" +
                "3-Sağ taraf için aynı hareket tekrarlanır.\n" +
                "\n");




        return  v;
    }
}
