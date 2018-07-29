package com.tahamalas.lazyrecyclervie;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tahamalas.lazyrecyclerview.LazyAdapter;

import java.util.List;

public class Adapter extends LazyAdapter<Adapter.ViewHolder> {

    private List<NewsResponse> newsResponseList;

    public Adapter(@NonNull List<NewsResponse> stringList) {
        this.newsResponseList = stringList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(newsResponseList.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return newsResponseList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView message;

        public ViewHolder(View itemView) {
            super(itemView);
            message = itemView.findViewById(R.id.message);
        }

        public void bind(String message) {
            this.message.setText(message);
        }
    }

}
