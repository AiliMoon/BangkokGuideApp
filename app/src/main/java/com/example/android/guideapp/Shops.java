package com.example.android.guideapp;

import android.content.Context;

import java.util.List;

public class Shops {

    public static void shopsList(List<Information> list, Context context) {

        list.add(new Information(context.getString(R.string.shops_name_siam),
                context.getString(R.string.shop_siam_short),
                context.getString(R.string.shop_siam_full),
                context.getString(R.string.shop_siam_string_address),
                context.getString(R.string.shop_siam_phone), R.drawable.siam));

        list.add(new Information(context.getString(R.string.shop_name_central),
                context.getString(R.string.shop_central_short),
                context.getString(R.string.shop_central_full),
                context.getString(R.string.shop_central_string_address),
                context.getString(R.string.shop_central_phone), R.drawable.central));

        list.add(new Information(context.getString(R.string.shop_name_icon_siam),
                context.getString(R.string.shop_icon_siam_short),
                context.getString(R.string.shop_icon_full),
                context.getString(R.string.shop_icon_string_address),
                context.getString(R.string.shop_icon_phone), R.drawable.icon_siam));

        list.add(new Information(context.getString(R.string.shop_name_mbk),
                context.getString(R.string.shop_mbk_short),
                context.getString(R.string.shop_mbk_full),
                context.getString(R.string.shop_mbk_string_address),
                context.getString(R.string.shop_mbk_phone), R.drawable.mbk));

        list.add(new Information(context.getString(R.string.shop_name_embassy),
                context.getString(R.string.shop_embassy_short),
                context.getString(R.string.shop_embassy_full),
                context.getString(R.string.shop_embassy_string_address),
                context.getString(R.string.shop_embassy_phone), R.drawable.embassy));
    }
}
