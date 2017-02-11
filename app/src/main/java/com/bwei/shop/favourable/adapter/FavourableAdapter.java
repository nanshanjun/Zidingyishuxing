package com.bwei.shop.favourable.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.bwei.shop.favourable.entity.FavourableMessage;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者： 南山君
 * 时间：2017/2/11.8:31
 */

public class FavourableAdapter extends BaseAdapter {

    List<FavourableMessage.DataBean.ProductsBean> list= new ArrayList<>();

    Context context;

    public FavourableAdapter(Context context) {
        this.context = context;
    }


    public void addRest(List<FavourableMessage.DataBean.ProductsBean> list){

        this.list.clear();

        this.list.addAll(list);

        this.notifyDataSetChanged();

    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
