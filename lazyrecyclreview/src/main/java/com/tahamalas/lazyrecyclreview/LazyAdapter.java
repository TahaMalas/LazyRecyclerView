package com.tahamalas.lazyrecyclreview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public abstract class LazyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private OnLoadMore onLoadMore;
    private int lastPosition = 3;

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position, @NonNull List<Object> payloads) {
        super.onBindViewHolder(holder, position, payloads);
        if (position == getItemCount() - lastPosition && onLoadMore != null) {
            onLoadMore.onLoadMore(position + lastPosition);
        }
    }

    public void setOnLoadMore(OnLoadMore onLoadMore) {
        this.onLoadMore = onLoadMore;
    }

}
