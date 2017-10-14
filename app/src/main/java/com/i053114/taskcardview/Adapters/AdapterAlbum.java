package com.i053114.taskcardview.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.i053114.taskcardview.Models.ImageDates;
import com.i053114.taskcardview.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chris on 5/10/2017.
 */

public class AdapterAlbum extends RecyclerView.Adapter<AdapterAlbum.ViewHolder> {

    List<ImageDates> imageDatesList = new ArrayList<>();
    Context context;


    public AdapterAlbum(List<ImageDates> imageDatesList, Context context) {
        this.imageDatesList = imageDatesList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview, parent, false);

        // Pasar la vista (item.xml) al ViewHolder
        ViewHolder viewHolder = new ViewHolder(item);
        return viewHolder;

    }

    //77edicionañkjsg

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textViewtitle.setText(imageDatesList.get(position).getTitle());
        holder.textViewurl.setText(imageDatesList.get(position).getUrl());
        String [] images ;
        images  = new String[ 6];
        images [0]="https://scontent-mia3-1.xx.fbcdn.net/v/t31.0-8/16665649_1615500745133528_2665002130043165363_o.jpg?oh=4175018eaff30bcf6f900b7120c9aa8d&oe=5A4318F9";
        images [1]="images [0]=\"https://scontent-mia3-1.xx.fbcdn.net/v/t31.0-8/16665649_1615500745133528_2665002130043165363_o.jpg?oh=4175018eaff30bcf6f900b7120c9aa8d&oe=5A4318F9\";\n";
        images [2]="http://panoramanegro.com.ar/wp-content/uploads/2014/05/atletico_nacional.jpg";
        images [3]="https://i.pinimg.com/564x/b6/06/4d/b6064d3ae074842b02582109df6e3d66.jpg";
        images [4]="https://i.pinimg.com/236x/3d/43/5d/3d435d62a7669de0a5c26f7c3a25539e.jpg ";
        images [5]="https://i.pinimg.com/236x/7f/0d/a4/7f0da459cac924bc76183dc9caf7da6c.jpg";

        int number = (int ) (Math.random()*5);
        Picasso.with(context).load(images[number]).into(holder.imageView);



    }

    @Override
    public int getItemCount() {
         return  imageDatesList.size();
    }


    public class ViewHolder extends  RecyclerView.ViewHolder {
        TextView    textViewtitle;
        TextView  textViewurl;
        ImageView imageView;
        public ViewHolder(View item) {
            super(item);
            textViewtitle = (TextView) item.findViewById(R.id.id_tv_item_title);
            textViewurl = (TextView) item.findViewById(R.id.id_tv_item_url);
            imageView= (ImageView) item.findViewById(R.id.img_item_cardview);
        }



    }
}
