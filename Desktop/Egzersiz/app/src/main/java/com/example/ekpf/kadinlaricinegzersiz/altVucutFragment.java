package com.example.ekpf.kadinlaricinegzersiz;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


public class altVucutFragment extends Fragment  {

    ImageButton glute_btn,donkey_btn,high_knee_btn,side_shuffle_btn,squat_kick_back_btn;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.alt_vucut_tasarim,container,false);

        /* Define Your Functionality Here
           Find any view  => v.findViewById()
          Specifying Application Context in Fragment => getActivity() */
        glute_btn= (ImageButton) v.findViewById(R.id.glutebridge_btn);
        donkey_btn = (ImageButton) v.findViewById(R.id.donkeykicks_btn);
        high_knee_btn = (ImageButton) v.findViewById(R.id.highknees_btn);
        side_shuffle_btn = (ImageButton)v.findViewById(R.id.sideshuffle_btn);
        squat_kick_back_btn = (ImageButton) v.findViewById(R.id.squatkickback_btn);

        glute_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.content_main,new GluteBridge_Instruction(),"GluteBridge_Ins").addToBackStack("GluteBridge_Ins").commit();

            }
        });
        donkey_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.content_main,new Donkeykicks_Instruction(),"Donkeykick_Ins").addToBackStack("Donkeykick_Ins").commit();
            }
        });
        high_knee_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.content_main,new HighKnees_Instruction(),"Highknees_Ins").addToBackStack("Highknees_Ins").commit();


            }
        });
        side_shuffle_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.content_main,new SideShuffle_Instruction(),"SideShuffle_Ins").addToBackStack("SideShuffle_Ins").commit();
            }
        });
        squat_kick_back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.content_main,new SquatKickBack_Instruction(),"SquatKickback_Ins").addToBackStack("SquatKickback_Ins").commit();

            }
        });



        return v;
    }
}
