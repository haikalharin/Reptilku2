package com.example.reptilku.Fjb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.reptilku.R;

import java.util.ArrayList;

public class FjbActivity extends AppCompatActivity {
    public static final int REQUEST_CODE =1;
    FjbAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fjb);
        final ArrayList<HomeFjb> reptile = new ArrayList<>();

        reptile.add(new HomeFjb("FACEBOOK","Ular",
                R.drawable.fb_bekasi, "BEKASI", "SRB ( Sahabat Reptil Bekasi )",
                "https://www.facebook.com/groups/1970742126498092/"));
        reptile.add(new HomeFjb("FACEBOOK","Iguana",
                R.drawable.fb_bekasi2, "BEKASI", "Forum Jual Beli Mamalia Reptil Bekasi ( FJBMRB )",
                "https://web.facebook.com/groups/893217620774815/"));
        reptile.add(new HomeFjb("KASKUS", "Kura-kura",
                R.drawable.kk_bekasi, "BEKASI", "[Bekasi Coldblooded Community] Reptilia & Amphibia",
                "https://www.kaskus.co.id/thread/000000000000000003126604/bekasi-coldblooded-community-reptilia--amphibia/?order=asc"));
        reptile.add(new HomeFjb("INSTAGRAM","Tokek",
                R.drawable.ig_bekasi, "BEKASI", "SRB ( Sahabat Reptil Bekasi )",
                "https://www.instagram.com/sahabatreptilbekasi/?hl=id"));

        adapter = new FjbAdapter(this,reptile);

        ListView orderListView = (ListView)
                findViewById(R.id.order_list_view);
        orderListView.setAdapter(adapter);
        orderListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(FjbActivity.this, FjbDetailActivity.class);

                HomeFjb currentReptile = reptile.get(position);
                Log.e("SOSMED NAME", currentReptile.getSosmedName());
                i.putExtra("sosmed", currentReptile.getSosmedName());
                i.putExtra("jenis", currentReptile.getJenis());
                i.putExtra("image", currentReptile.getmImageResouce());
                i.putExtra("kota", currentReptile.getKota());
                i.putExtra("fjb", currentReptile.getFjbName());
                i.putExtra("url", currentReptile.getKomUrl());

                startActivity(i);
            }
        });


    }
}


