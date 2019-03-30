package com.example.ekpf.kadinlaricinegzersiz;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;


public class Veritabani extends SQLiteOpenHelper {

    public static final String DATABASE_ADI= "Veritabani.db";
    public static final String TABLO_ADI = "notlar";
    public static final String ID = "id";
    public static final String KONU = "konu";
    public static final String ICERIK = "icerik";
    public static final String TARIH = "tarih";

    public Veritabani(Context context)
    {
        super(context, DATABASE_ADI, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        db.execSQL(
                "create table notlar " +
                        "(id integer primary key, konu text,icerik text,tarih text)"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub
        db.execSQL("DROP TABLE IF EXISTS notlar");
        onCreate(db);
    }

    public boolean notEkle (String konu, String icerik, String tarih)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("konu", konu);
        contentValues.put("icerik", icerik);
        contentValues.put("tarih", tarih);
        db.insert("notlar", null, contentValues);
        return true;
    }

    public Cursor getNotlar(){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery("select * from notlar", null);
        return res;
    }

    public boolean notGuncelle (Integer id, String konu, String icerik, String tarih)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("konu", konu);
        contentValues.put("icerik", icerik);
        contentValues.put("tarih", tarih);
        db.update("notlar", contentValues, "id = ? ", new String[] { Integer.toString(id) } );
        return true;
    }

    public Integer notSil (Integer id)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete("notlar",
                "id = ? ",
                new String[] { Integer.toString(id) });
    }

    public ArrayList<Not> getTumNotlar() {
        ArrayList<Not> notlar=new ArrayList<Not>();
        Cursor c = getNotlar();
        if (c.moveToFirst()) {
            do {
                int id1 = c.getInt(c.getColumnIndex(Veritabani.ID));
                String konu = c.getString(c.getColumnIndex(Veritabani.KONU));
                String icerik = c.getString(c.getColumnIndex(Veritabani.ICERIK));
                String tarih = c.getString(c.getColumnIndex(Veritabani.TARIH));
                Not _not = new Not(id1, konu, icerik, tarih);
                notlar.add(_not);
            } while (c.moveToNext());
        }
        return notlar;
    }

    public Cursor tariheGoreNotlariGetir(String tarih1,String  tarih2) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor c = db.rawQuery("Select * From notlar where tarih >= '" + tarih1 + "' and tarih <= '" + tarih2 + "' Order By " + ID + " desc", new String[]{});
        return c;
    }

    public ArrayList<Not> getTarihNotlari(String tarih1,String tarih2) {
        ArrayList<Not> notlar=new ArrayList<Not>();
        Cursor c = tariheGoreNotlariGetir(tarih1, tarih2);
        if (c.moveToFirst()) {
            do {
                int id = c.getInt(c.getColumnIndex(ID));
                String konu = c.getString(c.getColumnIndex(KONU));
                String icerik = c.getString(c.getColumnIndex(ICERIK));
                String tarih = c.getString(c.getColumnIndex(TARIH));
                Not _not = new Not(id, konu, icerik, tarih);
                notlar.add(_not);
            } while (c.moveToNext());
        }
        return notlar;
    }
}