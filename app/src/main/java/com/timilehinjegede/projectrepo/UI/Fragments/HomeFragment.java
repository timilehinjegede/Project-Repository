package com.timilehinjegede.projectrepo.UI.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.timilehinjegede.projectrepo.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    View view;
    RecyclerView projectRecyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_home, container, false);

        projectRecyclerView = view.findViewById(R.id.projectRecyclerView);

        return view;
    }

}
