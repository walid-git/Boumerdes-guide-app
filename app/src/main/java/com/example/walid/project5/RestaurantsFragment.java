package com.example.walid.project5;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ArrayList<RecyclerViewElement> items = new ArrayList<>();
        items.add(new RecyclerViewElement(getString(R.string.jazeera), R.drawable.al_jazeera_restaurant, R.string.lorem_ipsum, "36.755898,3.444996"));
        items.add(new RecyclerViewElement(getString(R.string.bigmama), R.drawable.big_mama_restaurant, R.string.lorem_ipsum, "36.757752,3.456176"));
        items.add(new RecyclerViewElement(getString(R.string.odyssee), R.drawable.odysee_restaurant, R.string.lorem_ipsum, "36.753728,3.471353"));
        items.add(new RecyclerViewElement(getString(R.string.pimpim), R.drawable.pimpim_restaurant, R.string.lorem_ipsum, "36.759210,3.478319"));
        items.add(new RecyclerViewElement(getString(R.string.scala), R.drawable.scala_restaurant, R.string.lorem_ipsum, "36.766313,3.471135"));
        items.add(new RecyclerViewElement(getString(R.string.wood), R.drawable.wood_pecker_restaurant, R.string.lorem_ipsum, "36.754482,3.456676"));
        View v = inflater.inflate(R.layout.fragment, container, false);
        RecyclerView rv = v.findViewById(R.id.recyclerView);
        rv.setAdapter(new MyRecyclerAdapter(items));
        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        return v;
    }

}