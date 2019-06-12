package com.example.reptilku.Tips;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.reptilku.Tips.HomeTips;
import com.example.reptilku.Tips.TipsAdapter;
import com.example.reptilku.R;

import java.util.ArrayList;

public class TipsActivity extends AppCompatActivity {
    public static final int REQUEST_CODE =1;
    TipsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);
        final ArrayList<HomeTips> reptile = new ArrayList<>();

        reptile.add(new HomeTips("Python Reticulatus",
                R.drawable.fb_bekasi, "Ular", "",
                "https://www.facebook.com/groups/1970742126498092/", R.string.artikel1));
        reptile.add(new HomeTips("Kura kura ninja",
                R.drawable.fb_bekasi2, "Iguana", "Forum Jual Beli Mamalia Reptil Bekasi ( FJBMRB )",
                "https://web.facebook.com/groups/893217620774815/", R.string.artikel1));
        reptile.add(new HomeTips("KASKUS",
                R.drawable.kk_bekasi, "Kura-Kura", "[Bekasi Coldblooded Community] Reptilia & Amphibia",
                "https://www.kaskus.co.id/thread/000000000000000003126604/bekasi-coldblooded-community-reptilia--amphibia/?order=asc", R.string.artikel1));
        reptile.add(new HomeTips("INSTAGRAM",
                R.drawable.ig_bekasi, "Tokek", "SRB ( Sahabat Reptil Bekasi )",
                "https://www.instagram.com/sahabatreptilbekasi/?hl=id", R.string.artikel1));

        adapter = new TipsAdapter(this,reptile);

        ListView orderListView = (ListView)
                findViewById(R.id.order_list_view);
        orderListView.setAdapter(adapter);
        orderListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(TipsActivity.this, TipsDetailActivity.class);

                HomeTips currentReptile = reptile.get(position);
                Log.e("HEWAN NAME", currentReptile.getHewanName());
                i.putExtra("hewan", currentReptile.getHewanName());
                i.putExtra("image", currentReptile.getmImageResouce());
                i.putExtra("type", currentReptile.getKota());
                i.putExtra("komunitas", currentReptile.getKomName());
                i.putExtra("artikel", currentReptile.getmArtikel());


                startActivity(i);
            }
        });


    }
}