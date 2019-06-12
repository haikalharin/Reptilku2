package com.example.reptilku.Komunitas;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.reptilku.Komunitas.Home;
import com.example.reptilku.R;

import java.util.ArrayList;

public class KomAdapter extends ArrayAdapter<Home> {

    public KomAdapter(Activity context, ArrayList<Home>homes) {
        super(context, 0, homes);
    }

    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_list_komunitas,
                    parent, false);
        }
        Home currentHome = getItem(position);

        TextView komNameTextView =  (TextView)
                listItemView.findViewById(R.id.nama_komunitas);
        komNameTextView.setText(currentHome.getKomName());

        TextView kotaNameTextView =  (TextView)
                listItemView.findViewById(R.id.nama_kota);
        kotaNameTextView.setText(currentHome.getKota());


        TextView sosmedNameTextView =  (TextView)
                listItemView.findViewById(R.id.nama_sosmed);
        sosmedNameTextView.setText(currentHome.getSosmedName());

        TextView komUrlTextview = (TextView)
                listItemView.findViewById(R.id.web_url);
        komUrlTextview.setText(currentHome.getKomUrl());


        ImageView imageView = (ImageView)
                listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentHome.getmImageResouce());
        imageView.setVisibility((View.VISIBLE));
        return listItemView;

    }
}

//Ini digunakan untuk menyambungkan ke list_Bogor