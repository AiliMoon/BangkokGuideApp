package com.example.android.guideapp;

import android.content.Context;

import java.util.List;

public class Food {

    public static void foodList(List<Information> list, Context context) {
        list.add(new Information(context.getString(R.string.food_name_sixth),
                context.getString(R.string.food_sixth_short),
                context.getString(R.string.food_sixth_full),
                context.getString(R.string.food_sixth_string_address),
                context.getString(R.string.food_sixth_phone), R.drawable.sixth));

        list.add(new Information(context.getString(R.string.food_name_soi),
                context.getString(R.string.food_soi_short),
                context.getString(R.string.food_soi_full),
                context.getString(R.string.food_soi_string_address),
                context.getString(R.string.food_soi_phone), R.drawable.soi));

        list.add(new Information(context.getString(R.string.food_name_prachak),
                context.getString(R.string.food_prachak_short),
                context.getString(R.string.food_prachak_full),
                context.getString(R.string.food_prachak_string_address),
                context.getString(R.string.food_prachak_phone), R.drawable.prachak));

        list.add(new Information(context.getString(R.string.food_name_tealicious),
                context.getString(R.string.food_tealicious_short),
                context.getString(R.string.food_tealicious_full),
                context.getString(R.string.food_tealicious_string_address),
                context.getString(R.string.food_tealicious_phone), R.drawable.tealicious));
    }
}
