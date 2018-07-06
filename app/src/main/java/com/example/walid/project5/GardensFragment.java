package com.example.walid.project5;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class GardensFragment extends Fragment {

    public GardensFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ArrayList<RecyclerViewElement> items = new ArrayList<>();
        items.add(new RecyclerViewElement(getString(R.string.el_nasr), R.drawable.el_nasr_garden, R.string.lorem_ipsum, "36.766072, 3.460534"));
        items.add(new RecyclerViewElement(getString(R.string.hayed), R.drawable.hayed_sofian_garden, R.string.lorem_ipsum, "36.763780,3.477288"));
        items.add(new RecyclerViewElement(getString(R.string.july5), R.drawable.july_5th_garden, R.string.lorem_ipsum, "36.754893,3.480967"));
        items.add(new RecyclerViewElement(getString(R.string.may21), R.drawable.may_21st_garden, R.string.lorem_ipsum, "36.761492,3.464818"));
        items.add(new RecyclerViewElement(getString(R.string.dauphin), R.drawable.le_dauphin_garden, R.string.lorem_ipsum, "36.764252,3.475135"));
        View v = inflater.inflate(R.layout.fragment, container, false);
        RecyclerView rv = v.findViewById(R.id.recyclerView);
        rv.setAdapter(new MyRecyclerAdapter(items));
        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        return v;
    }
}
