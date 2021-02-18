package com.example.android.guideapp;

import android.content.Context;

import java.util.List;

public class Parks {

    public static void parksList(List<Information> list, Context context) {

        list.add(new Information(context.getString(R.string.park_name_lumphini),
                context.getString(R.string.park_lumphini_short_description),
                context.getString(R.string.park_lumphini_full),
                context.getString(R.string.park_lumphini_string_address),
                context.getString(R.string.park_lumphini_phone), R.drawable.lumpini_park));

        list.add(new Information(context.getString(R.string.park_name_benjasiri),
                context.getString(R.string.park_benjasiri_short_description),
                context.getString(R.string.park_benjasiri_full),
                context.getString(R.string.park_benjasiri_string_address),
                context.getString(R.string.park_benjasiri_phone), R.drawable.benjasiri));

        list.add(new Information(context.getString(R.string.park_name_fai),
                context.getString(R.string.park_fai_short_description),
                context.getString(R.string.park_fai_full),
                context.getString(R.string.park_fai_string_address),
                context.getString(R.string.park_fai_phone), R.drawable.fai));

        list.add(new Information(context.getString(R.string.park_name_chang),
                context.getString(R.string.park_chang_short_description),
                context.getString(R.string.park_chang_full),
                context.getString(R.string.park_chang_string_address),
                context.getString(R.string.park_chang_phone), R.drawable.changchui));

        list.add(new Information(context.getString(R.string.park_name_dusit),
                context.getString(R.string.park_dusit_short_description),
                context.getString(R.string.park_dusit_full),
                context.getString(R.string.park_dusit_string_address),
                context.getString(R.string.park_dusit_phone), R.drawable.dusit));
    }
}
