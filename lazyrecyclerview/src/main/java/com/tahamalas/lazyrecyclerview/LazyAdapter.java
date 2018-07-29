package com.tahamalas.lazyrecyclerview;

import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public abstract class LazyAdapter<V extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<V> {

    private OnLoadMore onLoadMore;
    private int lastPosition = 3;

    @CallSuper
    @Override
    public void onBindViewHolder(@NonNull V holder, int position, @NonNull List<Object> payloads) {
        super.onBindViewHolder(holder, position, payloads);
        if (position == getItemCount() - lastPosition && onLoadMore != null) {
            onLoadMore.onLoadMore(getItemCount() - 1);
        }
    }

    public void setOnLoadMore(OnLoadMore onLoadMore) {
        this.onLoadMore = onLoadMore;
    }

    public void setLastPosition(int lastPosition) {
        this.lastPosition = lastPosition;
    }

}
