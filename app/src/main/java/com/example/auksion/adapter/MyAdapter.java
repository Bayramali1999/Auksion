package com.example.auksion.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.auksion.R;
import com.example.auksion.data.lot.LotData;
import com.example.auksion.listener.OnIteClickListener;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.VH> {

    private ArrayList<LotData> list;
    private Context context;
    private OnIteClickListener listener;

    public MyAdapter(ArrayList<LotData> list, Context context, OnIteClickListener listener) {
        this.list = list;
        this.context = context;
        this.listener = listener;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_view, parent, false);
        return new VH(v, listener);
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    class VH extends RecyclerView.ViewHolder {
        private ImageView itemImage;
        private TextView placeName, tvId, tvCoast, tvStartedCoast;
        private View view;
        private OnIteClickListener listener;

        public VH(@NonNull View itemView, OnIteClickListener listener) {
            super(itemView);

            itemImage = itemView.findViewById(R.id.item_image);
            placeName = itemView.findViewById(R.id.tv_name_please);
            tvId = itemView.findViewById(R.id.tv_id);
            tvCoast = itemView.findViewById(R.id.tv_coast);
            tvStartedCoast = itemView.findViewById(R.id.tv_coast_starter);
            this.view = itemView;
            this.listener = listener;
        }

        @SuppressLint("SetTextI18n")
        public void onBind(LotData data) {

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.itemClicked(data);
                }
            });

            String imageUrl = getImageUrlByhash(data.getFile_hash());
            Glide
                    .with(view.getContext())
                    .load(imageUrl)
                    .centerCrop()
                    .into(itemImage);

            placeName.setText(data.getName());
            tvId.setText("№ " + data.getLot_number());
            tvCoast.setText("Zaklad  puli miqdori\n" + data.getZaklad_summa());
            tvStartedCoast.setText("Boshlangich narxi\n" + data.getStart_price());

        }

        private String getImageUrlByhash(String file_hash) {
            return "https://files.e-auksion.uz/files-worker/api/v1/images?file_hash=" + file_hash + "&from_mobile=1";
        }
    }
}
