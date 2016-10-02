package com.kisannetwork.praveen.kisancontact;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.kisannetwork.praveen.kisancontact.DummyContent.DummyItem;
import com.kisannetwork.praveen.kisancontact.PlaceholderFragment.OnListFragmentInteractionListener;

import java.util.List;

/**
 * Created by Praveen Patel on 10/3/2016.
 */
public class MyMessagesRecyclerViewAdapter extends RecyclerView.Adapter<MyMessagesRecyclerViewAdapter.ViewHolder> {

    private final List<DummyItem> mValues;
    private final OnListFragmentInteractionListener mListener;

    MainActivity contacts = null;

    public MyMessagesRecyclerViewAdapter(List<DummyItem> items, OnListFragmentInteractionListener mListener) {
        mValues = items;
        this.mListener = mListener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_messages, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {

        String name = mValues.get(position).name;
        holder.mItem = mValues.get(position);
        holder.name.setText(name);
        holder.list_image.setText(name.charAt(0) + "");
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView name;

        public final TextView list_image;
        public DummyItem mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            name = (TextView) view.findViewById(R.id.name);
            list_image = (TextView) view.findViewById(R.id.list_image);
            mView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context context = v.getContext();
                    Intent intent = new Intent(context, DetailActivity.class);
                    context.startActivity(intent);
                }
            });
        }

        @Override
        public String toString() {
            return super.toString() + " '";
        }
    }
}
