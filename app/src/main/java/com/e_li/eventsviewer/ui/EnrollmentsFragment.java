package com.e_li.eventsviewer.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.e_li.eventsviewer.R;

public class EnrollmentsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_enrollments, container, false);

        TextView mTitle = root.findViewById(R.id.title);
        mTitle.setText(R.string.title_enrollments);

        return root;
    }
}