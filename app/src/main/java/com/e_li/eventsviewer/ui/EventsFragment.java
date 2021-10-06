package com.e_li.eventsviewer.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.TooltipCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.e_li.eventsviewer.DataAdapter;
import com.e_li.eventsviewer.R;
import com.e_li.eventsviewer.data;

import java.util.ArrayList;
import java.util.Objects;

public class EventsFragment extends Fragment {
    String[] e_names;
    String[] e_locations;
    String[] e_contents;
    String[] e_schedule;

    ArrayList<data> dataArrayList = new ArrayList<data>();
    DataAdapter dataAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_events, container, false);

        e_names = requireContext().getResources().getStringArray(R.array.e_name);
        e_locations = requireContext().getResources().getStringArray(R.array.e_location);
        e_contents = requireContext().getResources().getStringArray(R.array.e_content);
        e_schedule = requireContext().getResources().getStringArray(R.array.e_schedule);

        TextView mTitle = root.findViewById(R.id.title);
        RecyclerView mEventList = root.findViewById(R.id.events_list);

        mTitle.setText(R.string.title_events);

        loadData();
        dataAdapter = new DataAdapter(getContext(), dataArrayList);
        mEventList.setLayoutManager(new LinearLayoutManager(getContext()));
        mEventList.setAdapter(dataAdapter);


        return root;
    }

    private void loadData(){
        new Thread() {
            @Override
            public void run() {
                super.run();
                for (int i = 0; i < e_names.length; i++) {
                    dataArrayList.add(new data(null, e_names[i], e_locations[i], e_contents[i], e_schedule[i]));
                    requireActivity().runOnUiThread(() -> dataAdapter.notifyItemInserted(dataArrayList.size() - 1));
                }
            }
        }.start();
    }

}