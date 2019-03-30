package com.example.ekpf.kadinlaricinegzersiz;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;

/**
 * Created by ekpf on 22.11.2016.
 */


public class ustVucutFragment extends Fragment {

    EditText et;
    ImageButton half_squat_jab_btn,plank_shoulder_btn,touch_and_nap_btn,bear_walks_btn;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.ust_vucut_tasarim,container,false);

        half_squat_jab_btn = (ImageButton)v.findViewById(R.id.halfSquatJab_btn);
        plank_shoulder_btn=(ImageButton) v.findViewById(R.id.plankShoulder_btn);
        touch_and_nap_btn = (ImageButton) v.findViewById(R.id.touchAndNap_btn);
        bear_walks_btn = (ImageButton) v.findViewById(R.id.bearWalks_btn);

        half_squat_jab_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.content_main,new HalfSquatJab_Instruction(),"HalfSquat_Ins").addToBackStack("HalfSquat_Ins").commit();

            }
        });

        plank_shoulder_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.content_main,new PlankShoulder_Instruction(),"PlanShoulder_Ins").addToBackStack("PlanShoulder_Ins").commit();

            }
        });

        touch_and_nap_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.content_main,new TouchAndHop_Instruction(),"TouchAndHop_Ins").addToBackStack("TouchAndHop_Ins").commit();

            }
        });

        bear_walks_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.content_main,new BearWalks_Instruction(),"BearWalks_Ins").addToBackStack("BearWalks_Ins").commit();

            }
        });


        /* Define Your Functionality Here
           Find any view  => v.findViewById()
          Specifying Application Context in Fragment => getActivity() */

        return v;
    }
}
