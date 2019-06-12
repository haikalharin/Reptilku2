package com.example.reptilku.Fjb;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.reptilku.R;

import java.util.ArrayList;

public class FjbAdapter  extends ArrayAdapter<HomeFjb> {
    public FjbAdapter(Activity context, ArrayList<HomeFjb> homeFjb) {
        super(context, 0, homeFjb);
    }

    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_list_fjb,
                    parent, false);
        }
        HomeFjb currentHomeFjb = getItem(position);

        TextView fjbNameTextView =  (TextView)
                listItemView.findViewById(R.id.nama_fjb);
        fjbNameTextView.setText(currentHomeFjb.getFjbName());

        TextView jenisNameTextView =  (TextView)
                listItemView.findViewById(R.id.jenis_reptil);
        jenisNameTextView.setText(currentHomeFjb.getJenis());

        TextView kotaNameTextView =  (TextView)
                listItemView.findViewById(R.id.nama_kota);
        kotaNameTextView.setText(currentHomeFjb.getKota());

        TextView sosmedNameTextView =  (TextView)
                listItemView.findViewById(R.id.nama_sosmed);
        sosmedNameTextView.setText(currentHomeFjb.getSosmedName());

        TextView komUrlTextview = (TextView)
                listItemView.findViewById(R.id.web_url);
        komUrlTextview.setText(currentHomeFjb.getKomUrl());


        ImageView imageView = (ImageView)
                listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentHomeFjb.getmImageResouce());
        imageView.setVisibility((View.VISIBLE));
        return listItemView;

    }
}

//Ini digunakan untuk menyambungkan ke list_Bogor

