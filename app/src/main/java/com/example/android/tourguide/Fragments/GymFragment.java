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
public class GymFragment extends Fragment {
    public static final String TECHNO_GYM = "TechnoGym";
    public static final String CHALLENGER_GYM = "challenger Gym";
    public static final String AL_QAHIRA = "Al-qahira";
    public static final String AL_KARRADA = "Al-karrada - 42st.";
    ListView listView;


    public GymFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_gym, container, false);

        ArrayList<Location> locationArrayList = new ArrayList<>();
        locationArrayList.add(new Location(R.drawable.techno, TECHNO_GYM, AL_QAHIRA, "07700000"));
        locationArrayList.add(new Location(R.drawable.challenger_gym, CHALLENGER_GYM, AL_KARRADA, "07700000"));


        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), R.layout.list_liew, locationArrayList);

        listView = view.findViewById(R.id.list_view);

        listView.setAdapter(locationAdapter);

        return view;
    }

}
