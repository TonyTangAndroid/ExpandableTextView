package com.ms.square.android.expandabletextview.sample;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ListFragment;
import android.view.View;

public class Demo2Fragment extends ListFragment {
    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SampleTextListAdapter adapter = new SampleTextListAdapter(getActivity());
        setListAdapter(adapter);
    }
}