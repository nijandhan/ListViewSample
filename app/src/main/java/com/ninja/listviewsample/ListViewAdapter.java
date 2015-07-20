package com.ninja.listviewsample;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nijandhan on 7/20/2015.
 * Description :
 */
public class ListViewAdapter extends BaseAdapter {

    private List<String> mListItems = new ArrayList<>();

    public ListViewAdapter(ArrayList<String> listItems){
        mListItems = listItems;
    }

    @Override
    public int getCount() {
        return mListItems.size();
    }

    @Override
    public String getItem(int position) {
        return mListItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public static class ViewHolder{
        TextView mTextView;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null){
            holder = new ViewHolder();
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);
            holder.mTextView = (TextView) convertView.findViewById(R.id.row_text);
            convertView.setTag(holder);
        }else holder = (ViewHolder) convertView.getTag();

        holder.mTextView.setText(getItem(position));
        return convertView;
    }
}
