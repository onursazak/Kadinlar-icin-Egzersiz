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

public class TouchAndHop_Instruction extends android.support.v4.app.Fragment  {
    TextView touch_and_hop_txt;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.touch_and_hop_ins_layout,container,false);

        touch_and_hop_txt=(TextView)v.findViewById(R.id.touchAndHop_txt);
        touch_and_hop_txt.setText("\t \tTouch And Hop (Dokun ve Zıpla) Hareketi\n" +
                "1-Sağ diz hafif bükükken sağ bacağın üzerinde durulur.\n" +
                "2-Sol bacak arkaya doğru gerdirilirken sol elle yere dokunulur.\n" +
                "3-Sol diz kırık bir şekilde hızlıca zıplanır.\n" +
                "4-Sağ ayanın üzerine düştükten sonra , tarafları değiştirip hareket tekrarlanır.\n" +
                "\n");

        return  v;
    }
}
