package com.example.ekpf.kadinlaricinegzersiz;


public class Not {

    private int id;
    private String konu;
    private String icerik;
    private String tarih;

    public Not() {
    }

    public Not(int id,String konu, String icerik, String tarih) {
        this.id=id;
        this.konu = konu;
        this.icerik = icerik;
        this.tarih = tarih;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setKonu(String konu) {
        this.konu = konu;
    }

    public void setIcerik(String icerik) {
        this.icerik = icerik;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public int getId() {
        return id;
    }

    public String getKonu() {
        return konu;
    }

    public String getIcerik() {
        return icerik;
    }

    public String getTarih() {
        return tarih;
    }


}
