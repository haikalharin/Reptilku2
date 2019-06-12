package com.example.reptilku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.reptilku.Komunitas.Bekasi.BekasiActivity;
import com.example.reptilku.Komunitas.Bogor.BogorActivity;
import com.example.reptilku.Komunitas.Depok.DepokActivity;
import com.example.reptilku.Komunitas.Jakarta.JakartaActivity;
import com.example.reptilku.Komunitas.Tangerang.TangerangActivity;

public class KotaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kota);

        Button btn1 = (Button) findViewById(R.id.button1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent gotosignin =new Intent(getApplicationContext(), BogorActivity.class);
                startActivity(gotosignin);

            }
        });

        Button btn2 = (Button) findViewById(R.id.button2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent gotosignin =new Intent(getApplicationContext(), BekasiActivity.class);
                startActivity(gotosignin);

            }
        });

        Button btn3 = (Button) findViewById(R.id.button3);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent gotosignin =new Intent(getApplicationContext(), TangerangActivity.class);
                startActivity(gotosignin);

            }
        });

        Button btn4 = (Button) findViewById(R.id.button4);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent gotosignin =new Intent(getApplicationContext(), DepokActivity.class);
                startActivity(gotosignin);

            }
        });

        Button btn5 = (Button) findViewById(R.id.button5);

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent gotosignin =new Intent(getApplicationContext(), JakartaActivity.class);
                startActivity(gotosignin);

            }
        });
    }
}

