package com.example.exampleprojectforrecycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<CardViewHolder>{

    List<CardData> list ;

    public Adapter( List<CardData> list)
    {
        this.list=list;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder( ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View listItem= layoutInflater.inflate(R.layout.card, viewGroup, false);
        CardViewHolder viewHolder = new CardViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder( CardViewHolder cardViewHolder, int i) {
        cardViewHolder.eventName.setText(list.get(i).title);
        cardViewHolder.description.setText(list.get(i).Description);
        cardViewHolder.date.setText((CharSequence) list.get(i).date);
        cardViewHolder.time.setText((CharSequence) list.get(i).time);
        cardViewHolder.day.setText(list.get(i).day);
        cardViewHolder.month.setText(list.get(i).month);
    }



    @Override
    public int getItemCount() {
        return list.size();
    }
}
