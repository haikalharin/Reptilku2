package com.example.reptilku.Komunitas;

public class Home {
    final private int NO_IMAGE = -1;

    private String sosmedName;

    public void setKota(String kota) {
        this.kota = kota;
    }
    private String kota;
    private  int mImageResouce = NO_IMAGE;
    private String komName;
    private String komUrl;

    public Home(String sosmedName, int mImageResouce,String kota, String komName,
                String komUrl){
        this.sosmedName = sosmedName;
        this.mImageResouce = mImageResouce;
        this.kota = kota;
        this.komName = komName;
        this.komUrl = komUrl;


    }

    public String getSosmedName(){
        return sosmedName;
    }
    public String getKota(){
        return kota;
    }
    public int getmImageResouce(){
        return mImageResouce;
    }
    public String getKomName(){ return komName;
    }
    public String getKomUrl() { return komUrl; }

}

//Disini tempat untuk menambahkan identitas baru pada detail activity
