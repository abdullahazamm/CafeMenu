package com.example.cafemenu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {


    Context context;
    ArrayList<MenuModel> menuModelArrayList;
    RecyclerAdapter(Context context,ArrayList<MenuModel> menuModelArrayList) {
        this.context=context;
        this.menuModelArrayList=menuModelArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.menu_row,parent,false);
        ViewHolder viewHolder=new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageFood.setImageResource(menuModelArrayList.get(position).img);
        holder.txtName.setText(menuModelArrayList.get(position).fName);
        holder.txtPrice.setText(menuModelArrayList.get(position).fPrice);
    }

    @Override
    public int getItemCount() {
        return menuModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView txtName,txtPrice;
        ImageView imageFood;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtName=itemView.findViewById(R.id.foodname);
            txtPrice=itemView.findViewById(R.id.foodprice);
            imageFood=itemView.findViewById(R.id.foodimage);

        }
    }

}
