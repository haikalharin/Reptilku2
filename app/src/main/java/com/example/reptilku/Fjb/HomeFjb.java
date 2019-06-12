package com.example.reptilku.Fjb;

public class HomeFjb {
    final private int NO_IMAGE = -1;

    private String sosmedName;
    private String jenis;
    public void setKota(String kota) {
        this.kota = kota;
    }
    private String kota;
    private  int mImageResouce = NO_IMAGE;
    private String fjbName;
    private String komUrl;


    public HomeFjb(String sosmedName, String jenis, int mImageResouce, String kota, String fjbName,
                   String komUrl){
        this.sosmedName = sosmedName;
        this.jenis = jenis;
        this.mImageResouce = mImageResouce;
        this.kota = kota;
        this.fjbName = fjbName;
        this.komUrl = komUrl;


    }

    public String getSosmedName(){
        return sosmedName;
    }
    public String getJenis(){
        return jenis;
    }
    public String getKota(){
        return kota;
    }
    public int getmImageResouce(){
        return mImageResouce;
    }
    public String getFjbName(){ return fjbName;
    }
    public String getKomUrl() { return komUrl; }

}

//Disini tempat untuk menambahkan identitas baru pada detail activity
