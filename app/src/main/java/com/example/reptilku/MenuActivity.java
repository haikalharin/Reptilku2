package com.example.reptilku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.reptilku.Fjb.FjbActivity;
import com.example.reptilku.Tips.TipsActivity;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button btn1 = (Button) findViewById(R.id.button1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent gotosignin =new Intent(getApplicationContext(),KotaActivity.class);
                startActivity(gotosignin);

            }
        });

        Button btn2 = (Button) findViewById(R.id.button2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent gotosignin =new Intent(getApplicationContext(), TipsActivity.class);
                startActivity(gotosignin);

            }
        });

        Button btn3 = (Button) findViewById(R.id.button3);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent gotosignin =new Intent(getApplicationContext(), FjbActivity.class);
                startActivity(gotosignin);

            }
        });

        Button btn4 = (Button) findViewById(R.id.btn_exit);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
            }
        });
    }

}
