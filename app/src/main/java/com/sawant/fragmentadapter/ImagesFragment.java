package com.sawant.fragmentadapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ImagesFragment extends Fragment {
    int fragVal;

    static ImagesFragment init(int val) {
        ImagesFragment truitonFrag = new ImagesFragment();
        // Supply val input as an argument.
        Bundle args = new Bundle();
        args.putInt("val", val);

        truitonFrag.setArguments(args);
        return truitonFrag;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fragVal = getArguments() != null ? getArguments().getInt("val") : 1;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layoutView = inflater.inflate(R.layout.fragment_image, container,
                false);
        View tv = layoutView.findViewById(R.id.text);
        ((TextView) tv).setText("Truiton Fragment #" + fragVal);
        return layoutView;
    }
}