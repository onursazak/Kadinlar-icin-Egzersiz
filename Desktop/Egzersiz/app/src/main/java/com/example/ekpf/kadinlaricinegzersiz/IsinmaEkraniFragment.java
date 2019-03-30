package com.example.ekpf.kadinlaricinegzersiz;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class IsinmaEkraniFragment extends Fragment {

    Button isinmabtn;
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View v = inflater.inflate(R.layout.isinma_hareketleri_tasarim,container,false);
        isinmabtn = (Button)v.findViewById(R.id.isinma_instructon_btn);
        isinmabtn.setVisibility(View.VISIBLE);
        isinmabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.content_main,new Isinma_Instruction(),"Isınma_Ins_Fragment").addToBackStack("Isınma_Ins_Fragment").commit();

                isinmabtn.setVisibility(View.GONE);
            }
        });

        return v;
    }
}

