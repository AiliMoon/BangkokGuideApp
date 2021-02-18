package com.example.android.guideapp;

import android.content.Context;

import java.util.List;

public class Sights {

    public static void sightsList(List<Information> list, Context context) {

        list.add(new Information(
                context.getString(R.string.sight_name_jim_thompson),
                context.getString(R.string.sight_jim_short_description),
                context.getString(R.string.sight_jim_thompson_full_description),
                context.getString(R.string.sight_jim_thompson_string_address),
                context.getString(R.string.sight_jim_thompson_phone_number),
                R.drawable.jim_thompson, context.getString(R.string.sight_jim_thompson_address)));

        list.add(new Information(context.getString(R.string.sight_name_mahanakorn_skywalk),
                context.getString(R.string.sight_mahanakorn_short_description),
                context.getString(R.string.sight_mahanakorn_full_description),
                context.getString(R.string.sight_mahanakorn_string_address),
                context.getString(R.string.sight_mahanakorn_phone_number),
                R.drawable.mahanakorn_skywalk, context.getString(R.string.sight_mahanakorn_address)));

        list.add(new Information(context.getString(R.string.sight_name_upper),
                context.getString(R.string.sight_upper_short_description),
                context.getString(R.string.sight_upper_full_description),
                context.getString(R.string.sight_upper_string_address),
                context.getString(R.string.sight_upper_phone_number),
                R.drawable.upper, context.getString(R.string.sight_upper_address)));

        list.add(new Information(context.getString(R.string.sight_sri_mariam_temple),
                context.getString(R.string.sight_sri_mariam_short_description),
                context.getString(R.string.sight_sri_mariam_full_description),
                context.getString(R.string.sight_sri_mariam_string_address),
                context.getString(R.string.sight_sri_mariam_phone_number),
                R.drawable.mariamman, context.getString(R.string.sight_sri_mariam_address)));

        list.add(new Information(context.getString(R.string.sight_name_sook_siam),
                context.getString(R.string.sight_sook_siam_short_description),
                context.getString(R.string.sight_sook_siam_full_description),
                context.getString(R.string.sight_sook_siam_string_address),
                context.getString(R.string.sight_sook_siam_phone_number),
                R.drawable.iconsiam, context.getString(R.string.sight_sook_siam_address)));
    }
}
