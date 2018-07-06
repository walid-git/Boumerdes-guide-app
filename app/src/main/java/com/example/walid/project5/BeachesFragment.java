package com.example.walid.project5;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class BeachesFragment extends Fragment {

    public BeachesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ArrayList<RecyclerViewElement> items = new ArrayList<>();
        items.add(new RecyclerViewElement(getString(R.string.corso), R.drawable.corso_beach, R.string.lorem_ipsum, "36.766307,3.453231"));
        items.add(new RecyclerViewElement(getString(R.string.second_beach), R.drawable.second_beach, R.string.lorem_ipsum, "36.767264,3.478433"));
        items.add(new RecyclerViewElement(getString(R.string.sabliere), R.drawable.sabliere_beach, R.string.lorem_ipsum, "36.768895, 3.495122"));
        items.add(new RecyclerViewElement(getString(R.string.les_sources), R.drawable.les_sources_beach, R.string.lorem_ipsum, "36.767600,3.484315"));
        items.add(new RecyclerViewElement(getString(R.string.les_800), R.drawable.les_800_beach, R.string.lorem_ipsum, "36.766834,3.460164"));
        View v = inflater.inflate(R.layout.fragment, container, false);
        RecyclerView rv = v.findViewById(R.id.recyclerView);
        rv.setAdapter(new MyRecyclerAdapter(items));
        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        return v;
    }
}