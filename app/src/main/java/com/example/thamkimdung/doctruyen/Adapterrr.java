package com.example.thamkimdung.doctruyen;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by thamkimdung on 09/07/2016.
 */
public class Adapterrr extends BaseAdapter {

    private ArrayList<ItemFace>arrayList;
    private LayoutInflater layoutInflater;


    public Adapterrr(Context context) {
        layoutInflater=LayoutInflater.from(context);
        init();
    }

    private void init() {
        arrayList=new ArrayList<ItemFace>();
        arrayList.add(new ItemFace(R.drawable.vv,"Chỉ lấy 1 đồng."));
        arrayList.add(new ItemFace(R.drawable.vv,"Vôva và ông đọc truyện"));
        arrayList.add(new ItemFace(R.drawable.vv,"Vôva Ghen"));
        arrayList.add(new ItemFace(R.drawable.vv,"Vôva tập vẽ"));
        arrayList.add(new ItemFace(R.drawable.vv,"Mua xe tăng cho Vôva"));
        arrayList.add(new ItemFace(R.drawable.vv,"Đĩa đậu phộng"));
        arrayList.add(new ItemFace(R.drawable.vv,"Vôva vào lớp 1"));
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View itemView, ViewGroup parent) {
        if(itemView==null){
            itemView=layoutInflater.inflate(R.layout.item_list,parent,false);

        }
        
        ItemFace itemFace=arrayList.get(position);

        ImageView imageView= (ImageView) itemView.findViewById(R.id.imgItem);
        TextView textView= (TextView) itemView.findViewById(R.id.textIem);

        imageView.setImageResource(itemFace.getImageId());
        textView.setText(itemFace.getTitle());
        return itemView;
    }
}
