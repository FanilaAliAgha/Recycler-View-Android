package com.example.atry;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class programmingadapter extends RecyclerView.Adapter <programmingadapter.programmingViewHolder>{
private String[] data;
    public programmingadapter(String[] data)
    {
        this.data=data;
    }


    @NonNull
    @Override
    public programmingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view =inflater.inflate(R.layout.itemlist,parent,false);
        return new programmingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull programmingViewHolder holder, int position) {
        String title=data[position];
        holder.title.setText(title);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class programmingViewHolder extends RecyclerView.ViewHolder{

        TextView title;
        public programmingViewHolder(View itemView){
            super(itemView);
            title= (TextView) itemView.findViewById(R.id.title);
        }
    }
}
