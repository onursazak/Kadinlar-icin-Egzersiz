package com.example.ekpf.kadinlaricinegzersiz;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;


public class NotListAdapter extends BaseAdapter {

    LayoutInflater mInflater;
    ArrayList<Not> notlar;
    Veritabani dba;

    public NotListAdapter(Context context) {
        mInflater = LayoutInflater.from(context);
        notlar = new ArrayList<Not>();
        dba = new Veritabani(context);
        notlar = dba.getTumNotlar();
    }

    public NotListAdapter(Context context, String tarih1, String tarih2) {
        mInflater = LayoutInflater.from(context);
        notlar = new ArrayList<Not>();
        dba = new Veritabani(context);
        notlar=dba.getTarihNotlari(tarih1, tarih2);
    }

    public int getCount() {
        return notlar.size();
    }

    public long getItemId(int position) {
        return position;
    }

    public Not getItem(int i) {
        return notlar.get(i);
    }


    public View getView(int position, View myView, ViewGroup parent) {
        if (myView == null) {
            myView = mInflater.inflate(R.layout.not_adapter, null);
            TextView tv1  = (TextView) myView.findViewById(R.id.textViewAdapterKonu);
            TextView tv2 = (TextView) myView.findViewById(R.id.textViewAdapterIcerik);
            TextView tv3 = (TextView) myView.findViewById(R.id.textViewAdapterTarih);
            tv1.setText(notlar.get(position).getKonu());
            tv2.setText(notlar.get(position).getIcerik());
            tv3.setText(notlar.get(position).getTarih());
        }
        return myView;
    }
}

