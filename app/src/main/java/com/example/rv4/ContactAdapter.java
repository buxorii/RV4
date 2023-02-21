package com.example.rv4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.MyHolder> {
    private List<Contact> list;

    public ContactAdapter(List<Contact> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        Contact i = list.get(position);
        holder.hPhoto.setImageResource(i.getcPhoto());
        holder.hName.setText(i.getcName());
        holder.hNumber.setText(i.getcNumber());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder{
        private ImageView hPhoto;
        private TextView hName, hNumber;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            hPhoto = itemView.findViewById(R.id.photo);
            hName = itemView.findViewById(R.id.full_name);
            hNumber = itemView.findViewById(R.id.phone_no);
        }
    }
}
