package com.example.android.guideapp;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    Context context;

    public CategoryAdapter(@NonNull FragmentManager fm, int behavior, Context context) {
        super(fm, behavior);
        this.context = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
       switch (position){
           case 0:
               return new SightsCategory();
           case 1:
               return new ParkCategory();
           case 2:
               return new FoodCategory();
           case 3:
               return new ShopsCategory();
           default:
               return null;
       }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return context.getString(R.string.sight_category);
            case 1:
                return context.getString(R.string.park_category);
            case 2:
                return context.getString(R.string.food_category);
            case 3:
                return context.getString(R.string.shops_category);
            default:
                return null;
        }
    }
}
