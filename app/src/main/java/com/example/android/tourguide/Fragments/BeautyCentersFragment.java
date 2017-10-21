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
public class BeautyCentersFragment extends Fragment {
    ListView listView;


    public BeautyCentersFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_beauty_centers, container, false);

        ArrayList<Location> locationArrayList = new ArrayList<>();
        locationArrayList.add(new Location(R.drawable.carmen_center, getString(R.string.carmen_center_name), getString(R.string.carmen_center_location), getString(R.string.phone_number)));
        locationArrayList.add(new Location(R.drawable.veolla_center, getString(R.string.veolla_center_name), getString(R.string.zayona_st), getString(R.string.phone_number)));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), R.layout.list_liew, locationArrayList);

        listView = view.findViewById(R.id.list_view);

        listView.setAdapter(locationAdapter);

        return view;
    }

}
