package com.example.ekpf.kadinlaricinegzersiz;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by onursazak on 6.12.2016.
 */

public class Isinma_Instruction extends android.support.v4.app.Fragment {

    Button isinmabtn2;
    TextView tv;
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.isinma_instruction_layout,container,false);
      //  View v2= inflater.inflate(R.layout.isinma_hareketleri_tasarim,container,false);

       // isinmabtn2 = (Button) v2.findViewById(R.id.isinma_instructon_btn);
        tv = (TextView) v.findViewById(R.id.textView11);
        tv.setText("ISINMALAR (WARM -UP )\n" +
                "1 - Koş : 90 saniye.Kalp atışını hızlandırır.\n" +
                "2 - İp Atla : 60 saniye.Dizler hafif çarpık bir şekilde ip atlanır.\n" +
                "3- Dağcılar ayakta : 60 saniye.Bir diz bel hizasına kadar getirilir ve zıt kol yukarıya doğru kaldırılır.Set boyunca değiştirerek devam edilir.\n" +
                "4- Zıplayan Jack(Jumping Jacks) : 30 saniye.Nefes vererek bacaklar yana açılır ve aynı anda kollar yukarıda birleştirilir.Nefes alarak tekrar başlangıç pozisyonuna dönülür.\n" +
                "5-Ellerinle ayak parmağına dokun(Fingertip to toe jack) : 60 saniye.Omuzlar açılır , sırt düz tutulur ve ters el ile ayağa dokunmaya çalışılır.Set süresince değiştirerek devam edilir.\n" +
                "6-Tırtıl Hareketi(Inchworm) : 60 saniye.Bel bükülür ve ellerle yürüyebildiğin kadar yürünür.Başa dönülür ve devam edilir.\n" +
                "7-Squat side kick : 60 saniye. Squat yapılır ve ayağa kalktıkça ağırlık sol ayağa aktarılır ve sağ ayak diğer tarafa doğru kaldırılır.Squat pozisyonuna geri dönülür ve sol ayakla aynı hareket tekrarlanır.\n" +
                "8-Reverans (Curtsy lunge) : 60 saniye.Ayaklar kalça genişliğinde olacak şekilde ayakta kalınır.Sol bacakla geriye büyük bir adım atılır , sağ bacağın arkasından geçilir.Sağ uyluk kemiği yere paralel oluncaya kadar diz çökülür ve sonra başlangıç pozisyonuna geri dönülür.Diğer tarafla hareketi tekrarlanır.\n" +
                "\n" +
                "\n" +
                "Dinamik Esnetme hareketleri \n" +
                "\n" +
                "9-Kolları Yana aç(Arm swing) : 60 saniye.Dizler hafif bükük bir şekilde ayakta kalınır.Ayaklar omuz genişliğinde açılır ve kollar yatay olarak kenarlara doğru gerdirilir.Kollar vücudun ön tarafından çapraz bir şekilde geçirilir ve eski haline geri döndürülür.\n" +
                "10-Dizinle Daire Çiz (knee circles) : 30 saniye + 30 saniye.Dizler ve ayaklar  beraber hareket ettirilir ve rahat bir hareket açıklığında kalınır.\n" +
                "\n");



        /* Define Your Functionality Here
           Find any view  => v.findViewById()
          Specifying Application Context in Fragment => getActivity() */

        return v;
    }


    }
