package com.timilehinjegede.projectrepo.UI.Fragments;


import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.timilehinjegede.projectrepo.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ViewProjectFragment extends Fragment {


    public ViewProjectFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

//        ClipboardManager clipboardManager = (ClipboardManager) getActivity().getSystemService(Context.CLIPBOARD_SERVICE);
//        ClipData clipData = ClipData.newPlainText("GitHub Link",githubLinkTextView.getText());
//        clipboardManager.setPrimaryClip(clipData);
//        Toast.makeText(getContext(), "Link copied o clipboard",Toast.LENGTH_SHORT).show();

        return inflater.inflate(R.layout.fragment_view_project, container, false);
    }

}
