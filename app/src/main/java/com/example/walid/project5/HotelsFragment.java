package com.example.walid.project5;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class HotelsFragment extends Fragment {

    public HotelsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ArrayList<RecyclerViewElement> items = new ArrayList<>();
        items.add(new RecyclerViewElement(getString(R.string.les_lilas), R.drawable.les_lilas_hotel, R.string.lorem_ipsum, "36.763788,3.463676"));
        items.add(new RecyclerViewElement(getString(R.string.medina), R.drawable.medina_hotel, R.string.lorem_ipsum, "36.750251,3.470265"));
        items.add(new RecyclerViewElement(getString(R.string.timezrit), R.drawable.timezrit_hotel, R.string.lorem_ipsum, "36.762378,3.458991"));
        View v = inflater.inflate(R.layout.fragment, container, false);
        RecyclerView rv = v.findViewById(R.id.recyclerView);
        rv.setAdapter(new MyRecyclerAdapter(items));
        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        return v;
    }
}