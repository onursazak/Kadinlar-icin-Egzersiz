package com.example.ekpf.kadinlaricinegzersiz;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by onursazak on 27.12.2016.
 */

public class NotlarFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, @Nullable
    ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.not_defteri,container,false);
        LeftFragment leftFragment = new LeftFragment();
        getFragmentManager().beginTransaction().replace(R.id.left_fragment_container, new LeftFragment(),"Left Fragment").commit();



        return v;
    }

    public static class LeftFragment extends android.support.v4.app.Fragment {

        Button buttonEkle,buttonTarihAra;
        TextView tv;
        Veritabani vt;
        NotListAdapter nla;
        int yil, ay, gun;
        ListView listViewNotlar;
        EditText baslangicTarihi,bitisTarihi;


        public  void getNotlar(){
            nla = new NotListAdapter(getActivity());
            listViewNotlar.setAdapter(nla);

        }
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View myView = (View) inflater.inflate(R.layout.left_fragment, container, false);
            buttonEkle = (Button) myView.findViewById(R.id.buttonYeniNotEkle);
            buttonTarihAra=(Button) myView.findViewById(R.id.buttonTarihAra);
            listViewNotlar=(ListView)myView.findViewById(R.id.listViewNotlar);
            baslangicTarihi =(EditText)myView.findViewById(R.id.editTextBaslangicTarihi);
            bitisTarihi =(EditText)myView.findViewById(R.id.editTextBitisTarihi);

            vt = new Veritabani(getActivity());
            getNotlar();

            if(nla!=null){
                baslangicTarihi.setVisibility(View.VISIBLE);
                bitisTarihi.setVisibility(View.VISIBLE);
                buttonTarihAra.setVisibility(View.VISIBLE);
            }else{
                baslangicTarihi.setVisibility(View.GONE);
                bitisTarihi.setVisibility(View.GONE);
                buttonTarihAra.setVisibility(View.GONE);
            }

            baslangicTarihi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final Calendar c = Calendar.getInstance();
                    yil = c.get(Calendar.YEAR);
                    ay = c.get(Calendar.MONTH);
                    gun = c.get(Calendar.DAY_OF_MONTH);

                    DatePickerDialog dpd = new DatePickerDialog(getActivity(),
                            new DatePickerDialog.OnDateSetListener() {

                                @Override
                                public void onDateSet(DatePicker view, int year,
                                                      int monthOfYear, int dayOfMonth) {
                                    baslangicTarihi.setText(dayOfMonth + "-"
                                            + (monthOfYear + 1) + "-" + year);

                                }
                            }, yil, ay, gun);
                    dpd.show();
                }
            });
            bitisTarihi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final Calendar c = Calendar.getInstance();
                    yil = c.get(Calendar.YEAR);
                    ay = c.get(Calendar.MONTH);
                    gun = c.get(Calendar.DAY_OF_MONTH);

                    DatePickerDialog dpd = new DatePickerDialog(getActivity(),
                            new DatePickerDialog.OnDateSetListener() {

                                @Override
                                public void onDateSet(DatePicker view, int year,
                                                      int monthOfYear, int dayOfMonth) {
                                    bitisTarihi.setText(dayOfMonth + "-"
                                            + (monthOfYear + 1) + "-" + year);

                                }
                            }, yil, ay, gun);
                    dpd.show();
                }
            });
            buttonTarihAra.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(baslangicTarihi.length()>0 && bitisTarihi.length()<0){
                        nla = new NotListAdapter(getActivity(),baslangicTarihi.getText().toString(),bitisTarihi.getText().toString());
                        listViewNotlar.setAdapter(nla);
                    }else{
                        Toast.makeText(getActivity(), "Lütfen tarih değerleirni giriniz!", Toast.LENGTH_SHORT).show();
                    }
                }
            });

            listViewNotlar.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    RightFragment rightFragment = new RightFragment();
                    rightFragment.getIcerik = nla.getItem(position).getIcerik();
                    rightFragment.getKonu = nla.getItem(position).getKonu();
                    rightFragment.getId = nla.getItem(position).getId();
                    rightFragment.getTarih = nla.getItem(position).getTarih();
                    getFragmentManager().beginTransaction().replace(R.id.right_fragment_container, rightFragment).commit();
                }
            });

            buttonEkle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    getFragmentManager().beginTransaction().replace(R.id.right_fragment_container, new RightFragment()).commit();
                }
            });
            return myView;
        }

        @Override
        public void onResume() {
            super.onResume();
            getNotlar();
        }
    }

    public static class RightFragment extends android.support.v4.app.Fragment {

        public int getId=0;
        public String getKonu="";
        public String getIcerik="";
        public String getTarih="";

        EditText editTextKonu,editTextIcerik;
        TextView textViewTarih;
        Button buttonIptal,buttonSil,buttonEkle;
        Veritabani vt;

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

            final View myView = inflater.inflate(R.layout.right_fragment, container, false);

            buttonIptal = (Button)myView.findViewById(R.id.buttonIptal);
            buttonEkle = (Button)myView.findViewById(R.id.buttonEkle);
            buttonSil = (Button)myView.findViewById(R.id.buttonSil);
            editTextKonu = (EditText) myView.findViewById(R.id.editTextKonu);
            editTextIcerik = (EditText) myView.findViewById(R.id.editTextIcerik);
            textViewTarih = (TextView) myView.findViewById(R.id.textViewTarih);
            vt = new Veritabani(getActivity());


            if(getKonu!="") {
                textViewTarih.setText(getTarih);
                editTextKonu.setText(getKonu);
                editTextIcerik.setText(getIcerik);
                buttonSil.setVisibility(View.VISIBLE);
            }else
            {
                buttonSil.setVisibility(View.GONE);
                Calendar c = Calendar.getInstance();
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                String strDate = sdf.format(c.getTime());
                textViewTarih.setText(strDate);
            }
            buttonSil.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setMessage(getKonu + "  konuyu silmek istediğinize emin misin?").setCancelable(true).setPositiveButton("Evet",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    vt.notSil(getId);
                                    getFragmentManager().beginTransaction().replace(R.id.left_fragment_container, new LeftFragment()).commit();
                                    ((ViewGroup) myView.getParent()).removeView(myView);
                                }
                            })
                            .setNegativeButton("Hayır", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alert = builder.create();
                    alert.show();

                }
            });

            buttonEkle.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    if (getKonu != "") {
                        try {
                            if (editTextKonu.getText().length() == 0 && editTextIcerik.getText().length() == 0) {
                                Toast.makeText(getActivity(), "Lütfen tüm bilgileri doldurunuz.", Toast.LENGTH_SHORT).show();
                            } else {
                                vt.notGuncelle(getId, editTextKonu.getText().toString(), editTextIcerik.getText().toString(),textViewTarih.getText().toString());
                                getFragmentManager().beginTransaction().replace(R.id.left_fragment_container, new LeftFragment()).commit();
                                ((ViewGroup) myView.getParent()).removeView(myView);
                            }
                        } catch (Exception e) {
                            Toast.makeText(getActivity(), "Güncellenirken bir hata meydana geldi.", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        try {
                            if (editTextKonu.getText().length() == 0 && editTextIcerik.getText().length() == 0) {
                                Toast.makeText(getActivity(), "Lütfen tüm bilgileri doldurunuz.", Toast.LENGTH_SHORT).show();
                            } else {
                                vt.notEkle(editTextKonu.getText().toString(), editTextIcerik.getText().toString(),textViewTarih.getText().toString());
                                getFragmentManager().beginTransaction().replace(R.id.left_fragment_container, new LeftFragment()).commit();
                                ((ViewGroup) myView.getParent()).removeView(myView);
                            }
                        } catch (Exception e) {
                            Toast.makeText(getActivity(), "Eklenirken bir hata meydana geldi.", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            });

            buttonIptal.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ((ViewGroup) myView.getParent()).removeView(myView);
                }
            });
            return myView;
        }
    }
}
