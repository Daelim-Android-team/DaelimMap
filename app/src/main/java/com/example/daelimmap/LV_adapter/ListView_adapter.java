package com.example.daelimmap.LV_adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import com.example.daelimmap.LV_Item.ListView_item;
import com.example.daelimmap.R;
import com.example.daelimmap.bottomsheet.result;

import java.util.ArrayList;
import java.util.List;


public class ListView_adapter extends BaseAdapter implements Filterable {

    public TextView listview_item;
    public ArrayList<ListView_item> listView_itemList = new ArrayList<ListView_item>(); //데이터를 넣을 배열
    public String getdata;
    public ListView_adapter(Context applicationContext, int listview_adapter, List<String> listView_itemList){

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

//        contextTextView.setOnClickListener(new View.OnClickListener() {
//            private String getdata;
//
//            @Override
//            public void onClick(View v) {
//                 String  getdata=listView_itemList.get(pos).getContent();
//                 this.getdata= getdata;
//                Intent intent = new Intent(context, result.class);
//
//                v.getContext().startActivity(intent);
//            }
//        });

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
    public  ArrayList<ListView_item> getItemList() {
        return listView_itemList;
    }

    @Override
    public Filter getFilter() {
        return null;
    }
}
