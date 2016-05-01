package com.marceloapp.autoreclamos.Adapters;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.marceloapp.autoreclamos.Models.Reclamo;
import com.marceloapp.autoreclamos.R;

import java.util.List;

/**
 * Created by Marcelo on 30/4/2016.
 */
public class ReclamosAdapter extends RecyclerView.Adapter <ReclamosAdapter.ReclamosViewHolder>{

    List<Reclamo> reclamos;

    public ReclamosAdapter(List<Reclamo> reclamos){
        this.reclamos = reclamos;
    }
    @Override
    public ReclamosViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_itemreclamo, parent, false);
        ReclamosViewHolder rvh = new ReclamosViewHolder(v);
        return rvh;
    }

    @Override
    public void onBindViewHolder(ReclamosViewHolder holder, int position) {
        holder.reclamoTitle.setText(reclamos.get(position).title);
        holder.reclamoDescription.setText(reclamos.get(position).description);
        holder.reclamoIcon.setImageResource(reclamos.get(position).iconId);
    }

    @Override
    public int getItemCount() {
        return reclamos.size();
    }

    public static class ReclamosViewHolder extends RecyclerView.ViewHolder{
        CardView cv;
        TextView reclamoTitle;
        TextView reclamoDescription;
        ImageView reclamoIcon;

        public ReclamosViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            reclamoTitle = (TextView)itemView.findViewById(R.id.reclamo_title);
            reclamoDescription = (TextView)itemView.findViewById(R.id.reclamo_description);
            reclamoIcon = (ImageView)itemView.findViewById(R.id.reclamo_icon);
        }
    }
}