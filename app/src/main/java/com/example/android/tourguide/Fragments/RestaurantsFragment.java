package com.example.android.tourguide.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.android.tourguide.Adapter.LocationAdapter;
import com.example.android.tourguide.Location;
import com.example.android.tourguide.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {

    ListView listView;


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_restaurants, container, false);

        ArrayList<Location> locationArrayList = new ArrayList<>();
        locationArrayList.add(new Location(R.drawable.panorama_img, getString(R.string.panorama_name), getString(R.string.panorama_location), getString(R.string.phone_number)));
        locationArrayList.add(new Location(R.drawable.nutella_cafe_img, getString(R.string.nutella_name), getString(R.string.nutella_location), getString(R.string.phone_number)));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), R.layout.list_liew, locationArrayList);

        listView = view.findViewById(R.id.list_view);

        listView.setAdapter(locationAdapter);


        return view;
    }

}
