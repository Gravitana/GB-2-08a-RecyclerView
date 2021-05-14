package com.example.gb_2_08a_recyclerview.ui;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gb_2_08a_recyclerview.R;

public class SocialNetworkAdapter extends RecyclerView.Adapter<SocialNetworkAdapter.SocialNetworkViewHolder> {

    private final String[] dataSource;


    public SocialNetworkAdapter(String[] dataSource) {
        this.dataSource = dataSource;
    }

    @NonNull
    @Override
    public SocialNetworkViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Создаём новый элемент пользовательского интерфейса
        return new SocialNetworkViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull SocialNetworkViewHolder holder, int position) {
        holder.textView.setText(dataSource[position]);
    }

    @Override
    public int getItemCount() {
        return dataSource.length;
    }

    class SocialNetworkViewHolder extends RecyclerView.ViewHolder {

        TextView textView;

        public SocialNetworkViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.textView);
        }
    }

}
