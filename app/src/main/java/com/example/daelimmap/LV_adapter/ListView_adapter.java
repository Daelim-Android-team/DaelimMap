package com.example.daelimmap.LV_adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.daelimmap.LV_Item.ListView_item;
import com.example.daelimmap.R;

import java.util.ArrayList;


public class ListView_adapter extends BaseAdapter {
    private TextView listview_item;
    private ArrayList<ListView_item> listView_itemList = new ArrayList<ListView_item>();
    public ListView_adapter(){

    }
    @Override
    public int getCount(){
        return listView_itemList.size();
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        final int pos = position;
        final Context context = parent.getContext();

        if(convertView == null){
            LayoutInflater inflater =(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.listview_adapter,parent,false);
        }
        TextView contextTextView = (TextView) convertView.findViewById(R.id.content);

        ListView_item listView_item = listView_itemList.get(position);

        contextTextView.setText(listView_item.getContent());

        return convertView;
    }
    @Override
    public long getItemId(int position){
        return position;
    }
    @Override
    public Object getItem(int postion){
        return listView_itemList.get(postion);
    }
    public void addItem(String content){
        ListView_item item = new ListView_item();

        item.setContent(content);

        listView_itemList.add(item);
    }


}