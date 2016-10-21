package com.rohitiskul.testparcels.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.rohitiskul.testparcels.model.Merchant;

import org.parceler.Parcels;

/**
 * Created by Rohit Kulkarni on 10/21/16.
 */

public class SecondFragment extends Fragment {

    public static HomeFragment getInstance(Merchant merchant) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putParcelable("key", Parcels.wrap(merchant));
        fragment.setArguments(args);
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final TextView view = new TextView(getContext());
        view.setText("Merchant Parcel Test");
        return view;
    }
}
