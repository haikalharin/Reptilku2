package com.example.reptilku.Tips;

public class HomeTips {
    final private int NO_IMAGE = -1;


    private String komName;
    private  int mImageResouce = NO_IMAGE;
    private String hewanName;
    private String kota;
    private String komUrl;
    private  int mArtikel = NO_IMAGE;

    public HomeTips(String komName, int mImageResouce,String hewanName, String kota,
                    String komUrl, int mArtikel){
        this.komName = komName;
        this.mImageResouce = mImageResouce;
        this.hewanName = hewanName;
        this.kota = kota;
        this.komUrl = komUrl;
        this.mArtikel = mArtikel;


    }
    public String getKomName(){ return komName; }
    public int getmImageResouce(){
        return mImageResouce;
    }
    public String getHewanName(){
        return hewanName;
    }
    public String getKota(){
        return kota;
    }
    public String getKomUrl() { return komUrl; }
    public int getmArtikel(){
        return mArtikel;
    }

}

//Disini tempat untuk menambahkan identitas baru pada detail activity
