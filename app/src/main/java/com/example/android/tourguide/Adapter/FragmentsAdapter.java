package com.example.android.tourguide.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.tourguide.Fragments.BeautyCentersFragment;
import com.example.android.tourguide.Fragments.GymFragment;
import com.example.android.tourguide.Fragments.RestaurantsFragment;
import com.example.android.tourguide.Fragments.ShoppingMallsFragment;

import java.util.ArrayList;

/**
 * Created by E1 on 10/16/2017.
 */

public class FragmentsAdapter extends FragmentPagerAdapter {
    public static final String BEAUTY_CENTERS = "Beauty Centers";
    public static final String GYMS = "Gyms";
    public static final String SHOPPING_MALLS = "Shopping Malls";
    public static final String RESTAURANTS = "Restaurants";
    ArrayList<Fragment> fragmentArrayList;
    ArrayList<String> names;

    public FragmentsAdapter(FragmentManager fm) {
        super(fm);

        fragmentArrayList = new ArrayList<>();
        fragmentArrayList.add(new RestaurantsFragment());
        fragmentArrayList.add(new ShoppingMallsFragment());
        fragmentArrayList.add(new GymFragment());
        fragmentArrayList.add(new BeautyCentersFragment());

        names = new ArrayList<>();
        names.add(RESTAURANTS);
        names.add(SHOPPING_MALLS);
        names.add(GYMS);
        names.add(BEAUTY_CENTERS);

    }

    @Override
    public Fragment getItem(int position) {
        return fragmentArrayList.get(position);
    }

    @Override
    public int getCount() {
        return names.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return names.get(position);
    }
}
