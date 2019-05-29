package com.arunrk.retrofit;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.SupplierViewHolder> {

    List<Contact> list;

    public ContactAdapter(List<Contact> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public SupplierViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new SupplierViewHolder(LayoutInflater
                .from(viewGroup.getContext())
                .inflate(R.layout.contact_list
                    , viewGroup
                    ,false));
    }

    @Override
    public void onBindViewHolder(@NonNull SupplierViewHolder holder, int position) {
        holder.txtName.setText("" + list.get(position).getName());
        holder.txtEmail.setText("" + list.get(position).getEmail());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class SupplierViewHolder extends RecyclerView.ViewHolder {

        TextView txtName, txtEmail;

        public SupplierViewHolder(@NonNull View itemView) {
            super(itemView);

            txtName = itemView.findViewById(R.id.txtName);
            txtEmail = itemView.findViewById(R.id.txtEmail);

        }
    }
}
