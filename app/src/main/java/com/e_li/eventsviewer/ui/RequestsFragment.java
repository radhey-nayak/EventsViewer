package com.e_li.eventsviewer.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.e_li.eventsviewer.R;

public class RequestsFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_requests, container, false);

        TextView mTitle = root.findViewById(R.id.title);
        mTitle.setText(R.string.title_requests);

        return root;
    }

}