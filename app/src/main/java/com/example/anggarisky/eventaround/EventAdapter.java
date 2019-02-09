package com.example.anggarisky.eventaround;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.EventViewHolder>{

    Context context;
    List<Event> eventList;

    public EventAdapter(Context context, List<Event> eventList){
        this.context = context;
        this.eventList = eventList;
    }

    @NonNull
    @Override
    public EventViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item_event, null);
        return new EventViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EventViewHolder eventViewHolder, int i) {

        Event event = eventList.get(i);

        eventViewHolder.eventtitle.setText(event.getEventitle());
        eventViewHolder.eventcategory.setText(event.getEventcategory());
        eventViewHolder.eventpicture.setImageDrawable(context.getResources().
                getDrawable(event.getEventpicture()));

    }

    @Override
    public int getItemCount() {
        return eventList.size();
    }

    class EventViewHolder extends RecyclerView.ViewHolder {

        TextView eventtitle, eventcategory;
        ImageView eventpicture;

        public EventViewHolder(@NonNull View itemView) {
            super(itemView);

            eventtitle = itemView.findViewById(R.id.eventtitle);
            eventcategory = itemView.findViewById(R.id.eventcategory);
            eventpicture = itemView.findViewById(R.id.eventpicture);


        }
    }

}
