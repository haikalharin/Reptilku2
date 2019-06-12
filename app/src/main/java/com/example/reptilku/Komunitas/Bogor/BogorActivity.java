package com.example.reptilku.Komunitas.Bogor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.reptilku.Komunitas.Home;
import com.example.reptilku.Komunitas.HomeDetailActivity;
import com.example.reptilku.Komunitas.KomAdapter;
import com.example.reptilku.R;

import java.util.ArrayList;

public class BogorActivity extends AppCompatActivity {

    public static final int REQUEST_CODE =1;
    KomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bogor);
    final ArrayList<Home> reptile = new ArrayList<>();

        reptile.add(new Home("FACEBOOK",
                R.drawable.fb_bogor, "BOGOR", "Bogor Reptile Addicted [ BORA ]",
                "https://www.facebook.com/groups/BogorReptileAddicted/"));
        reptile.add(new Home("TWITTER",
                R.drawable.twt_bogor, "BOGOR", "Bogor Reptile Addicted [ BORA ]",
                "https://twitter.com/BgrReptilAddict"));
        reptile.add(new Home("KASKUS",
                R.drawable.kk_bogor, "BOGOR","Pecinta REPTIL reg.Bogor",
                "https://www.kaskus.co.id/thread/000000000000000001579063/regional-lounge-982998299829-pecinta-reptil-regbogor-kumpul-yukk-982998299829/?order=asc"));
        reptile.add(new Home("INSTAGRAM",
                R.drawable.ig_bogor, "BOGOR", "Bogor Reptile Addicted [ BORA ]",
                "https://www.instagram.com/bogorreptileaddicted/?hl=id"));
        adapter = new KomAdapter(this,reptile);

        ListView orderListView = (ListView)
        findViewById(R.id.order_list_view);
                orderListView.setAdapter(adapter);
                orderListView.setOnItemClickListener(new
                AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Intent i = new Intent(BogorActivity.this, HomeDetailActivity.class);

                        Home currentReptile = reptile.get(position);
                        Log.e("SOSMED NAME", currentReptile.getSosmedName());
                        i.putExtra("sosmed", currentReptile.getSosmedName());
                        i.putExtra("image", currentReptile.getmImageResouce());
                        i.putExtra("kota", currentReptile.getKota());
                        i.putExtra("komunitas", currentReptile.getKomName());
                        i.putExtra("url", currentReptile.getKomUrl());

                        startActivity(i);
                    }
                });


    }
}

//                        HomeFjb currentHome = homes.get(position);
//                        Log.e("HOME NAME", currentHome.getHomeName());
//                        i.putExtra("name", currentHome.getHomeName());
//                        i.putExtra("image", currentHome.getmImageResouce());
//                        i.putExtra("price", currentHome.getHomePrice());
//                        i.putExtra("type", currentHome.getType());
//                        i.putExtra("deskripsi", currentHome.getHomeDescription());
//                        i.putExtra("telfon", currentHome.getTelfon());
//                        startActivity(i);

