package com.cingu.laptop.dua.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.cingu.laptop.dua.R;
import com.cingu.laptop.dua.activity.DetailHidanganActivity;
import com.cingu.laptop.dua.activity.MainActivity;
import com.cingu.laptop.dua.model.Hidangan;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecyclerViewHidangan extends RecyclerView.Adapter<RecyclerViewHidangan.ViewHolder> {
    private Context context;
    private List<Hidangan> hidangans;

    public RecyclerViewHidangan(Context context, List<Hidangan> hidangans) {
        this.context = context;
        this.hidangans = hidangans;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_hidangan, parent, false);
        ViewHolder holder = new ViewHolder(v);

        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Hidangan hidangan = hidangans.get(position);
        holder.textViewNama.setText(hidangan.getNama_hidangan());
        holder.textViewHarga.setText(hidangan.getHarga_hidangan());
        String address = "";
        address = MainActivity.URL+"upload/"+ hidangan.getFoto_hidangan();
        Glide.with(context).load(address).into(holder.ivFotoHidangan);
        holder.llAllMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailHidanganActivity.class);
                intent.putExtra("nama_hidangan", hidangans.get(position).getNama_hidangan());
                intent.putExtra("deskripsi_hidangan", hidangans.get(position).getDeskripsi_hidangan());
                intent.putExtra("kateogori_hidangan", hidangans.get(position).getKategori_hidangan());
                intent.putExtra("harga_hidangan", hidangans.get(position).getHarga_hidangan());
                intent.putExtra("foto_hidangan", hidangans.get(position).getFoto_hidangan());

                context.startActivity(intent);
            }
        });

//        int resId = context.getResources().getIdentifier(hidangan.getFoto_hidangan(), "drawable", context.getPackageName());
//        holder.ivFotoHidangan.setImageResource(resId);
    }

    @Override
    public int getItemCount() {
        return hidangans.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tv_nama_hidangan)
        TextView textViewNama;
        @BindView(R.id.tv_harga_hidangan) TextView textViewHarga;
        @BindView(R.id.iv_foto_hidangan)
        ImageView ivFotoHidangan;
        @BindView(R.id.ll_all_menu)
        LinearLayout llAllMenu;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

}


/*
@Override
    public void onBindViewHolder(@NonNull RecyclerViewHidangan.ViewHolder holder, int position) {
        Hidangan hidangan = hidangans.get(position);
        holder.textViewNama.setText(hidangan.getNama_hidangan());
        holder.textViewHarga.setText(hidangan.getHarga_hidangan());

        String address = "";
        address = MainActivity.URL+"upload/"+ hidangan.getFoto_hidangan();
        Glide.with(context).load(address).into(holder.ivFotoHidangan);

        holder.cvMenuKategori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailHidanganActivity.class);
                intent.putExtra("nama_hidangan", hidangans.get(position).getNama_hidangan());
                intent.putExtra("deskripsi_hidangan", hidangans.get(position).getDeskripsi_hidangan());
                intent.putExtra("kateogori_hidangan", hidangans.get(position).getKategori_hidangan());
                intent.putExtra("harga_hidangan", hidangans.get(position).getHarga_hidangan());
                intent.putExtra("foto_hidangan", hidangans.get(position).getFoto_hidangan());

                context.startActivity(intent);
            }
        });
    }
 */