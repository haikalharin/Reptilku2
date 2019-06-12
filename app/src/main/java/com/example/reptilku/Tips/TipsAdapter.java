package com.example.reptilku.Tips;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.reptilku.R;

import java.util.ArrayList;

public class TipsAdapter extends ArrayAdapter<HomeTips> {

    public TipsAdapter(Activity context, ArrayList<HomeTips> homeTips) {
        super(context, 0, homeTips);
    }

    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_list_tips,
                    parent, false);
        }
        HomeTips currentHomeTips = getItem(position);

        TextView komNameTextView =  (TextView)
                listItemView.findViewById(R.id.nama_komunitas);
        komNameTextView.setText(currentHomeTips.getKomName());

        TextView sosmedNameTextView =  (TextView)
                listItemView.findViewById(R.id.nama_hewan);
        sosmedNameTextView.setText(currentHomeTips.getHewanName());

        TextView komUrlTextview = (TextView)
                listItemView.findViewById(R.id.web_url);
        komUrlTextview.setText(currentHomeTips.getKomUrl());

        TextView artikelTextview = (TextView)
                listItemView.findViewById(R.id.artikel);
        artikelTextview.setText(currentHomeTips.getmArtikel());


        ImageView imageView = (ImageView)
                listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentHomeTips.getmImageResouce());
        imageView.setVisibility((View.VISIBLE));
        return listItemView;

    }
}

//Ini digunakan untuk menyambungkan ke list_Bogor