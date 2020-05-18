package com.training.alif.geeksfarm.e_pohonkarrier.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.training.alif.geeksfarm.e_pohonkarrier.Activity.DeskripsiAct;
import com.training.alif.geeksfarm.e_pohonkarrier.Entity.ListPekerjaan;
import com.training.alif.geeksfarm.e_pohonkarrier.R;

import java.util.ArrayList;
import java.util.List;

import static com.training.alif.geeksfarm.e_pohonkarrier.Activity.DeskripsiAct.EXTRA_DATA;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.ListPekerjaanViewHolder> {

    private ArrayList<ListPekerjaan> dataList;
   // private Context context;

    public RVAdapter(ArrayList<ListPekerjaan> dataList) {
        //this.context = context;
        this.dataList = dataList;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public RVAdapter.ListPekerjaanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.itemlist_cardview,parent,false);
        return new ListPekerjaanViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RVAdapter.ListPekerjaanViewHolder holder, int position) {
        holder.onBind(dataList.get(position));
    }

    @Override
    public int getItemCount() {
        return  dataList.size();
    }

    public class ListPekerjaanViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView tvNamaPekerjaan, tvShortDesc;
        ListPekerjaan listPekerjaan;
        Context context;
        public ListPekerjaanViewHolder(@NonNull View itemView) {
            super(itemView);
            context = itemView.getContext();
            imageView = itemView.findViewById(R.id.img_frontitemdesc);
            tvNamaPekerjaan = itemView.findViewById(R.id.tv_item_name);
            tvShortDesc = itemView.findViewById(R.id.tv_item_shortdesc);
            itemView.setOnClickListener(listener);
        }
        public void onBind(ListPekerjaan listPekerjaan){
            this.listPekerjaan = listPekerjaan;
            tvNamaPekerjaan.setText(listPekerjaan.getJobNames());
            tvShortDesc.setText(listPekerjaan.getShortDesc());
            imageView.setImageResource(listPekerjaan.getImageFrontCard());
        }

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, DeskripsiAct.class);
                i.putExtra(EXTRA_DATA,listPekerjaan);
                context.startActivity(i);
            }
        };
    }

}
