package com.example.reptilku.Komunitas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.reptilku.R;
import com.example.reptilku.WebActivity;


public class HomeDetailActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_detail);

        String sosmed = getIntent().getStringExtra("sosmed");
        String kota = getIntent().getStringExtra("kota");
        String kom = getIntent().getStringExtra("komunitas");
        final String urll = getIntent().getStringExtra("url");

        int image;
        image = getIntent().getIntExtra("image", -1);


        Log.e("SECOND ACTIVITY", sosmed);

        TextView nameTextView = (TextView)
                findViewById(R.id.nama_sosmed_detail);
        nameTextView.setText(sosmed);

        TextView city = (TextView)
                findViewById(R.id.kota);
        city.setText(kota);

        TextView komunitas = (TextView)
                findViewById(R.id.nama_komunitas_detail);
        komunitas.setText(kom);

        TextView url = (TextView)
                findViewById(R.id.web_url);
        url.setText(urll);

        ImageView imageView = (ImageView)
                findViewById(R.id.home_image);
        imageView.setImageResource(image);
        imageView.setVisibility(View.VISIBLE);

        final TextView urlWeb = (TextView) findViewById(R.id.web_url);
        Button panggil_button = (Button) findViewById(R.id.panggil_button);
        panggil_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = (TextView)
                        findViewById(R.id.web_url);
                Intent call = new Intent(HomeDetailActivity.this, WebActivity.class);
                call.putExtra("urlWeb", urlWeb.getText().toString() );
                startActivity(call);


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

