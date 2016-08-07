package com.example.mohammad.metarialdesign;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Mohammad on 6/20/2016.
 */
public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.RecycleViewHolder> {
    String[] country_names, capital_name;

    public RecycleAdapter(String[] country_names, String[] capital_name){

        this.country_names = country_names;
        this.capital_name = capital_name;
    }


    @Override
    public RecycleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);

        RecycleViewHolder recycleViewHolder = new RecycleViewHolder(view);
        return recycleViewHolder;
    }

    @Override
    public void onBindViewHolder(RecycleViewHolder holder, int position) {
        holder.Tx_country.setText(country_names[position]);
        holder.Tx_capital.setText(capital_name[position]);

    }

    @Override
    public int getItemCount() {

        return country_names.length;
    }

    public static class RecycleViewHolder extends RecyclerView.ViewHolder{

        TextView Tx_country, Tx_capital;

        public RecycleViewHolder(View view){
            super(view);
            Tx_country = (TextView)view.findViewById(R.id.tx_country_name);
            Tx_capital = (TextView)view.findViewById(R.id.tx_capital_name);
        }
    }
}
