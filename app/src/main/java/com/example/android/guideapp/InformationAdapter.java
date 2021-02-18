package com.example.android.guideapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class InformationAdapter extends ArrayAdapter<Information> {

    public InformationAdapter(Context context, ArrayList<Information> informationList) {
        super(context, 0, informationList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        final Information currentLocation = getItem(position);

        ImageView photoLocation = listItemView.findViewById(R.id.image);
        Glide.with(photoLocation).load(currentLocation.getImageSrc()).into(photoLocation);

        TextView nameLocation = listItemView.findViewById(R.id.place_name);
        nameLocation.setText(currentLocation.getPlace_name());

        TextView shortAddress = listItemView.findViewById(R.id.short_place_description);
        shortAddress.setText(currentLocation.getPlace_short_address());

        TextView fullDescription = listItemView.findViewById(R.id.full_description);
        fullDescription.setText(currentLocation.getPlace_description());

        TextView fullAddress = listItemView.findViewById(R.id.addressTextView);
        fullAddress.setText(currentLocation.getPlace_full_address());

        if (currentLocation.hasClickableAddress()) {
            fullAddress.setOnClickListener(v -> {
                fullAddress.setPaintFlags(fullAddress.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                String address = currentLocation.getClickableAddress();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:" + address));
                getContext().startActivity(intent);
            });
        }

        TextView phoneNumber = listItemView.findViewById(R.id.phoneTextView);
        phoneNumber.setText(currentLocation.getPhoneNumber());

        CardView cardView = (CardView) listItemView.findViewById(R.id.cardView);

        fullDescription.setVisibility(View.GONE);
        fullAddress.setVisibility(View.GONE);
        phoneNumber.setVisibility(View.GONE);

        cardView.setOnClickListener(v -> {
            if (fullAddress.getVisibility() == View.VISIBLE && fullDescription.getVisibility() == View.VISIBLE && phoneNumber.getVisibility() == View.VISIBLE) {
                fullAddress.setVisibility(View.GONE);
                fullDescription.setVisibility(View.GONE);
                phoneNumber.setVisibility(View.GONE);
            } else if (fullAddress.getVisibility() == View.GONE && fullDescription.getVisibility() == View.GONE && phoneNumber.getVisibility() == View.GONE) {
                fullAddress.setVisibility(View.VISIBLE);
                fullDescription.setVisibility(View.VISIBLE);
                phoneNumber.setVisibility(View.VISIBLE);
            }
        });
        return listItemView;
    }
}
