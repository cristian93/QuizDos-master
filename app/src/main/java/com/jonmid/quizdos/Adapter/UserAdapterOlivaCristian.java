package com.jonmid.quizdos.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jonmid.quizdos.Models.UserModelOlivaCristian;
import com.jonmid.quizdos.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chris on 10/10/2017.
 */

public class UserAdapterOlivaCristian  extends RecyclerView.Adapter<UserAdapterOlivaCristian.ViewHolder>{
    List<UserModelOlivaCristian> modellist = new ArrayList<>();
    Context context;

    public UserAdapterOlivaCristian (List<UserModelOlivaCristian> modellist, Context context){
        this.modellist=modellist;
        this.context=context;


    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user,parent,false);

        ViewHolder viewHolder =     new ViewHolder(item);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textViewName.setText(modellist.get(position).getName());
        holder.textViewUserName.setText(modellist.get(position).getUsername());
        holder.textEmail.setText(modellist.get(position).getEmail());
        holder.textViewPhone.setText(modellist.get(position).getPhone());
        holder.textViewCompany.setText(modellist.get(position).getCompany());
        holder.textViewaddress.setText(modellist.get(position).getAddress());

    }

    @Override
    public int getItemCount() {
        return modellist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView textViewName;
        TextView textViewUserName;
        TextView textEmail;
        TextView textViewaddress;
        TextView textViewPhone;
        TextView textViewCompany;

        public ViewHolder(View item) {
            super(item);

            item.setOnClickListener(this);

            textViewName = (TextView) item.findViewById(R.id.id_tv_userinput_name);
            textViewUserName = (TextView) item.findViewById(R.id.id_tv_userinput_username);
            textEmail= (TextView) item.findViewById(R.id.id_tv_userinput_email);
            textViewaddress = (TextView) item.findViewById(R.id.id_tv_userinput_address);
            textViewPhone=(TextView) item.findViewById(R.id.id_tv_userinput_phone);
            textViewCompany=(TextView) item.findViewById(R.id.id_tv_userinput_namecompany);

        }


        @Override
        public void onClick(View view) {

        }
    }

}
