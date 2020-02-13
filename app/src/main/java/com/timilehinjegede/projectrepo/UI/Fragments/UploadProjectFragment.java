package com.timilehinjegede.projectrepo.UI.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.timilehinjegede.projectrepo.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class UploadProjectFragment extends Fragment {


    public UploadProjectFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_upload_project, container, false);
    }

}
