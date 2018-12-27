package com.ms.square.android.expandabletextview.sample;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.ms.square.android.expandabletextview.ExpandableTextView;
import com.ms.square.android.mymodule.app.R;

public class Demo1Fragment extends Fragment {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_demo1, container, false);

        ((TextView) rootView.findViewById(R.id.sample1).findViewById(R.id.title)).setText("Sample 1");
        ((TextView) rootView.findViewById(R.id.sample2).findViewById(R.id.title)).setText("Sample 2");

        ExpandableTextView expTv1 = rootView.findViewById(R.id.sample1)
                .findViewById(R.id.expand_text_view);
        ExpandableTextView expTv2 = rootView.findViewById(R.id.sample2)
                .findViewById(R.id.expand_text_view);

        expTv1.setOnExpandStateChangeListener(new ExpandableTextView.OnExpandStateChangeListener() {
            @Override
            public void onExpandStateChanged(TextView textView, boolean isExpanded) {
                Toast.makeText(getActivity(), isExpanded ? "Expanded" : "Collapsed", Toast.LENGTH_SHORT).show();
            }
        });

        expTv1.setText(getString(R.string.dummy_text1));
        expTv2.setText(getString(R.string.dummy_text2));
        return rootView;
    }
}
