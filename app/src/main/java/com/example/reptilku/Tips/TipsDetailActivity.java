package com.example.reptilku.Tips;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.reptilku.Komunitas.Bekasi.BekasiActivity;
import com.example.reptilku.R;
import com.example.reptilku.WebActivity;


public class TipsDetailActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips_detail);

        String hewan = getIntent().getStringExtra("hewan");
        String kom = getIntent().getStringExtra("komunitas");
        int art;
        art = getIntent().getIntExtra("artikel", 1);

        int image;
        image = getIntent().getIntExtra("image", -1);


        Log.e("SECOND ACTIVITY", hewan);



        TextView komunitas = (TextView)
                findViewById(R.id.nama_komunitas_detail);
        komunitas.setText(kom);

        TextView artikel = (TextView)
                findViewById(R.id.artikel_detail);
        artikel.setText(art);


        ImageView imageView = (ImageView)
                findViewById(R.id.home_image);
        imageView.setImageResource(image);
        imageView.setVisibility(View.VISIBLE);


        Button panggil_button = (Button) findViewById(R.id.panggil_button);
        panggil_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent gotosignin =new Intent(getApplicationContext(), Nextpage.class);
                startActivity(gotosignin);

            }
        });


    }
}
//        Button panggil_button=(Button) findViewById(R.id.panggil_button);
//        panggil_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                TextView textView=(TextView)
//                        findViewById(R.id.web_url);
//                Intent call = new Intent(Intent.ACTION_VIEW,Uri.parse(""+textView.getText()));
//                startActivity(call);
//

