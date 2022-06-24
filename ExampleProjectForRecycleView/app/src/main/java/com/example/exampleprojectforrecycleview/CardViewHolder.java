package com.example.exampleprojectforrecycleview;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class CardViewHolder extends RecyclerView.ViewHolder {

    TextView eventName;
    TextView description;
    TextView date;
    TextView time;
    TextView day;
    TextView month;


    CardViewHolder(View itemView) {
        super(itemView);
        eventName=(TextView) itemView.findViewById(R.id.eventName);
        description=(TextView) itemView.findViewById(R.id.description);
        date=(TextView) itemView.findViewById(R.id.eventDate);
        time=(TextView) itemView.findViewById(R.id.eventTime);
        day=(TextView) itemView.findViewById(R.id.day_view);
        month=(TextView) itemView.findViewById(R.id.month_view);

    }
}
