package com.rohitiskul.testparcels.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.gson.Gson;
import com.rohitiskul.testparcels.model.Category;
import com.rohitiskul.testparcels.model.Merchant;

import org.parceler.Parcels;

/**
 * Created by Rohit Kulkarni on 10/21/16.
 */

public class HomeFragment extends Fragment {

    public static HomeFragment getInstance(Category category) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putParcelable("key", Parcels.wrap(category));
        fragment.setArguments(args);
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final TextView view = new TextView(getContext());
        view.setBackgroundColor(Color.WHITE);
        Category category = Parcels.unwrap(getArguments().getParcelable("key"));
        view.setText("Category Parcel Test = " + category.name);
        String jsonMerchant = "";
        Merchant merchant = new Gson().fromJson(jsonMerchant, Merchant.class);
        view.setOnClickListener(view1 ->
                getFragmentManager()
                        .beginTransaction()
                        .replace(android.R.id.content, SecondFragment.getInstance(merchant))
                        .addToBackStack(null).commit());
        return view;
    }
}
