package com.example.android.tourguide.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.tourguide.Location;
import com.example.android.tourguide.R;

import java.util.List;

/**
 * Created by E1 on 10/16/2017.
 */

public class LocationAdapter extends ArrayAdapter<Location> {
    Context context;
    int resId;
    List<Location> locationList;

    public LocationAdapter(Context context, int resId, List<Location> locationList) {
        super(context, resId, (List) locationList);
        this.context = context;
        this.resId = resId;
        this.locationList = locationList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(resId, null);
        }

        Location locations = locationList.get(position);

        TextView name = convertView.findViewById(R.id.location_name);
        TextView location = convertView.findViewById(R.id.location);
        TextView phoneNumber = convertView.findViewById(R.id.phone_number);
        ImageView img = convertView.findViewById(R.id.location_image);

        img.setImageResource(locations.getImage());
        name.setText(locations.getName());
        location.setText(locations.getLocation());
        phoneNumber.setText(locations.getPhoneNumber());

        return convertView;

    }
}
