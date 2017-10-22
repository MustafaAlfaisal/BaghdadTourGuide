package com.example.android.tourguide.Adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.tourguide.Fragments.BeautyCentersFragment;
import com.example.android.tourguide.Fragments.GymFragment;
import com.example.android.tourguide.Fragments.RestaurantsFragment;
import com.example.android.tourguide.Fragments.ShoppingMallsFragment;
import com.example.android.tourguide.R;

import java.util.ArrayList;

/**
 * Created by E1 on 10/16/2017.
 */

public class FragmentsAdapter extends FragmentPagerAdapter {
    ArrayList<Fragment> fragmentArrayList;
    Context context;

    public FragmentsAdapter(FragmentManager fm, Context nContext) {
        super(fm);
        context = nContext;

        fragmentArrayList = new ArrayList<>();
        fragmentArrayList.add(new RestaurantsFragment());
        fragmentArrayList.add(new ShoppingMallsFragment());
        fragmentArrayList.add(new GymFragment());
        fragmentArrayList.add(new BeautyCentersFragment());


    }

    @Override
    public Fragment getItem(int position) {
        return fragmentArrayList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentArrayList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {

            case 0:
                return context.getString(R.string.restaurants);

            case 1:
                return context.getString(R.string.shopping_malls);

            case 2:
                return context.getString(R.string.gyms);

            case 3:
                return context.getString(R.string.beauty_centers);
        }

        return null;
    }

}
